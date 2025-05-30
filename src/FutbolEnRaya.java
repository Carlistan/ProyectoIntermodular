import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import com.mongodb.client.*;
import org.bson.Document;
import static com.mongodb.client.model.Filters.*;

public class FutbolEnRaya extends JFrame {
    private JButton[][] tablero;
    private JTextField inputNombre;
    private JLabel infoResultado;
    private JLabel turnoLabel;
    private JButton reiniciarBtn;
    private String jugadorActual = "X";
    private String[][] categoriasFila;
    private String[][] categoriasColumna;
    private MongoClient mongoClient;
    private MongoCollection<Document> coleccion;

    public FutbolEnRaya() {
        mongoClient = MongoClients.create("mongodb+srv://javiercarmonasolis2006:2PXjxAw1MGPcNuLy@cluster0.wrre9zb.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0");
        MongoDatabase database = mongoClient.getDatabase("futbol3raya");
        coleccion = database.getCollection("jugadores");

        setTitle("Fútbol en Raya");
        setSize(600, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelTablero = new JPanel(new GridLayout(3, 3));
        tablero = new JButton[3][3];
        categoriasFila = new String[][] {{"POR"}, {"DC"}, {"MCO"}}; 
        categoriasColumna = new String[][] {{"VALENCIA"}, {"BETIS"}, {"SEVILLA"}}; 

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton btn = new JButton();
                btn.setFont(new Font("Arial", Font.BOLD, 24));
                int finalI = i;
                int finalJ = j;
                btn.addActionListener(e -> manejarTurno(finalI, finalJ));
                tablero[i][j] = btn;
                panelTablero.add(btn);
            }
        }

        inputNombre = new JTextField();
        infoResultado = new JLabel("Introduce un nombre y pulsa una casilla");
        turnoLabel = new JLabel("Turno: Jugador X");
        reiniciarBtn = new JButton("Reiniciar");
        reiniciarBtn.setVisible(false);
        reiniciarBtn.addActionListener(e -> reiniciarPartida());

        JPanel panelInferior = new JPanel(new GridLayout(5, 1));
        panelInferior.add(new JLabel("Introduce nombre del jugador:"));
        panelInferior.add(inputNombre);
        panelInferior.add(infoResultado);
        panelInferior.add(turnoLabel);
        panelInferior.add(reiniciarBtn);

        add(panelTablero, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);
        setVisible(true);
    }

    private void manejarTurno(int fila, int columna) {
        String nombre = inputNombre.getText().trim();
        if (nombre.isEmpty()) {
            infoResultado.setText("Por favor, introduce un nombre.");
            return;
        }

        String categoriaFila = categoriasFila[fila][0];
        String categoriaCol = categoriasColumna[columna][0];

        List<Document> resultados = coleccion.find(and(
                in("equipos", categoriaCol),
                in("posiciones", categoriaFila)
        )).into(new java.util.ArrayList<>());

        boolean encontrado = resultados.stream()
                .anyMatch(doc -> doc.getString("nombre").equalsIgnoreCase(nombre));

        if (encontrado) {
            JButton boton = tablero[fila][columna];
            if (boton.getText().isEmpty()) {
                boton.setText(jugadorActual);
                boton.setEnabled(false);
                infoResultado.setText("Acierto!");
                if (hayGanador()) {
                    infoResultado.setText("Ganador: Jugador " + jugadorActual);
                    reiniciarBtn.setVisible(true);
                    deshabilitarTablero();
                } else {
                    jugadorActual = jugadorActual.equals("X") ? "O" : "X";
                    turnoLabel.setText("Turno: Jugador " + jugadorActual);
                }
            }
        } else {
            infoResultado.setText("Fallo. Ese jugador no cumple las condiciones.");
        }
        inputNombre.setText("");
    }

    private boolean hayGanador() {
        for (int i = 0; i < 3; i++) {
            if (!tablero[i][0].getText().isEmpty() && tablero[i][0].getText().equals(tablero[i][1].getText()) && tablero[i][1].getText().equals(tablero[i][2].getText())) return true;
            if (!tablero[0][i].getText().isEmpty() && tablero[0][i].getText().equals(tablero[1][i].getText()) && tablero[1][i].getText().equals(tablero[2][i].getText())) return true;
        }
        if (!tablero[0][0].getText().isEmpty() && tablero[0][0].getText().equals(tablero[1][1].getText()) && tablero[1][1].getText().equals(tablero[2][2].getText())) return true;
        if (!tablero[0][2].getText().isEmpty() && tablero[0][2].getText().equals(tablero[1][1].getText()) && tablero[1][1].getText().equals(tablero[2][0].getText())) return true;
        return false;
    }

    private void deshabilitarTablero() {
        for (JButton[] fila : tablero) {
            for (JButton btn : fila) {
                btn.setEnabled(false);
            }
        }
    }

    private void reiniciarPartida() {
        for (JButton[] fila : tablero) {
            for (JButton btn : fila) {
                btn.setText("");
                btn.setEnabled(true);
            }
        }
        jugadorActual = "X";
        turnoLabel.setText("Turno: Jugador X");
        infoResultado.setText("");
        reiniciarBtn.setVisible(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FutbolEnRaya::new);
    }
}