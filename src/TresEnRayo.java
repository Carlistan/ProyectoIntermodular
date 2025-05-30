import com.mongodb.client.*;
import org.bson.Document;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class TresEnRayo extends JFrame {
    private final JButton[][] tablero = new JButton[3][3];
    private List<String> equipos;
    private List<String> posiciones;

    private final JTextField campoNombre = new JTextField();
    private final JLabel estado = new JLabel("Turno de X", SwingConstants.CENTER);
    private boolean turnoX = true;
    private MongoCollection<Document> coleccionJugadores;
    private final JButton botonReiniciar = new JButton("Reiniciar");

    public TresEnRayo() {
        setTitle("Fútbol en Raya");
        setSize(600, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(200, 220, 255));

        // Conexión y carga dinámica de categorías
        conectarMongoDB();
        cargarCategorias(); // llena 'equipos' y 'posiciones'
        Collections.shuffle(equipos);
        Collections.shuffle(posiciones);
        equipos = equipos.subList(0, 3);
        posiciones = posiciones.subList(0, 3);

        // Título
        JLabel titulo = new JLabel("FUTBOL EN RAYA", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial Black", Font.BOLD, 32));
        titulo.setForeground(Color.BLACK);
        titulo.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
        add(titulo, BorderLayout.NORTH);

        // Panel de categorías y tablero
        JPanel panelCentro = new JPanel(new BorderLayout());
        panelCentro.setOpaque(false);

        // Cabecera con equipos
        JPanel header = new JPanel(new GridLayout(1, 4));
        header.setOpaque(false);
        header.add(new JLabel("", SwingConstants.CENTER));
        for (String eq : equipos) {
            JLabel lbl = new JLabel(eq, SwingConstants.CENTER);
            lbl.setFont(new Font("Arial", Font.BOLD, 18));
            lbl.setOpaque(true);
            lbl.setBackground(Color.BLACK);
            lbl.setForeground(Color.WHITE);
            header.add(lbl);
        }
        panelCentro.add(header, BorderLayout.NORTH);

        // Tablero con posiciones
        JPanel body = new JPanel(new GridLayout(3, 4));
        body.setOpaque(false);
        Font fontBoton = new Font("Arial", Font.BOLD, 28);
        for (int r = 0; r < 3; r++) {
            // etiqueta de posición
            JLabel lblPos = new JLabel(posiciones.get(r), SwingConstants.CENTER);
            lblPos.setFont(new Font("Arial", Font.BOLD, 18));
            lblPos.setOpaque(true);
            lblPos.setBackground(Color.BLACK);
            lblPos.setForeground(Color.WHITE);
            body.add(lblPos);
            for (int c = 0; c < 3; c++) {
                JButton btn = new JButton("");
                btn.setFont(fontBoton);
                final int rf = r, cf = c;
                btn.addActionListener(e -> validarYMarcar(rf, cf));
                tablero[r][c] = btn;
                body.add(btn);
            }
        }
        panelCentro.add(body, BorderLayout.CENTER);
        add(panelCentro, BorderLayout.CENTER);

        // Zona inferior: campo nombre y estado
        JPanel footer = new JPanel(new BorderLayout(10, 10));
        footer.setOpaque(false);
        campoNombre.setFont(new Font("Arial", Font.PLAIN, 20));
        footer.add(new JLabel("JUGADOR:"), BorderLayout.WEST);
        footer.add(campoNombre, BorderLayout.CENTER);
        footer.add(botonReiniciar, BorderLayout.EAST);
        botonReiniciar.setVisible(false);
        botonReiniciar.addActionListener(e -> reiniciarJuego());

        estado.setFont(new Font("Arial", Font.PLAIN, 18));
        footer.add(estado, BorderLayout.SOUTH);
        footer.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(footer, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void conectarMongoDB() {
        String uri = "mongodb+srv://javiercarmonasolis2006:2PXjxAw1MGPcNuLy@clusterintermodular.whimpxk.mongodb.net/?retryWrites=true&w=majority&appName=ClusterIntermodular";
        MongoClient client = MongoClients.create(uri);
        MongoDatabase db = client.getDatabase("futbol3raya");
        coleccionJugadores = db.getCollection("jugadores");
    }

    private void cargarCategorias() {
        equipos = coleccionJugadores.distinct("equipos", String.class).into(new ArrayList<>());
        posiciones = coleccionJugadores.distinct("posicion", String.class).into(new ArrayList<>());
    }

    private void validarYMarcar(int fila, int col) {
        String nombre = campoNombre.getText().trim();
        if (nombre.isEmpty()) { estado.setText("⚠️ Introduce un nombre."); return; }

        String equipo = equipos.get(col);
        String pos = posiciones.get(fila);
        Document query = new Document("nombre", nombre)
                .append("equipos", equipo)
                .append("posicion", pos);

        if (coleccionJugadores.find(query).first() != null) {
            JButton b = tablero[fila][col];
            b.setText(turnoX ? "X" : "◯");
            b.setForeground(turnoX ? Color.RED : Color.GREEN);
            b.setEnabled(false);
            campoNombre.setText("");
            if (hayGanador()) {
                estado.setText("🏆 ¡Ganador: " + (turnoX ? "X" : "O") + "!");
                desactivarTablero();
                botonReiniciar.setVisible(true);
            } else {
                turnoX = !turnoX;
                estado.setText("Turno de " + (turnoX ? "X" : "O"));
            }
        } else {
            estado.setText("❌ Jugador no válido para " + pos + " en " + equipo);
        }
    }

    private boolean hayGanador() {
        for (int i = 0; i < 3; i++) {
            if (linea(tablero[i][0], tablero[i][1], tablero[i][2])) return true;
            if (linea(tablero[0][i], tablero[1][i], tablero[2][i])) return true;
        }
        return linea(tablero[0][0], tablero[1][1], tablero[2][2]) || linea(tablero[0][2], tablero[1][1], tablero[2][0]);
    }

    private boolean linea(JButton a, JButton b, JButton c) {
        return !a.getText().isEmpty() && a.getText().equals(b.getText()) && b.getText().equals(c.getText());
    }

    private void desactivarTablero() {
        for (JButton[] row : tablero) for (JButton b : row) b.setEnabled(false);
    }

    private void reiniciarJuego() {
        for (JButton[] row : tablero) for (JButton b : row) { b.setText(""); b.setEnabled(true); }
        campoNombre.setText("");
        turnoX = true; estado.setText("Turno de X"); botonReiniciar.setVisible(false);
        Collections.shuffle(equipos);
        Collections.shuffle(posiciones);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TresEnRayo::new);
    }
}

