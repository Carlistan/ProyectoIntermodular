
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.bson.Document;
import com.mongodb.client.*;
import java.util.*;
import java.util.List;


public class TresEnRayo extends JFrame {

    private JButton[][] botones = new JButton[3][3];
    private boolean turnoJugadorX = true;
    private MongoCollection<Document> collection;
    private JTextField nombreJugadorField;
    private String[] paises = {"Portugal", "Alemania", "Brasil", "España", "Francia", "Argentina", "Uruguay"};
    private String[] equipos = {"Real Madrid", "Betis", "Alavés", "Barcelona", "Sevilla", "Valencia", "Osasuna"};


    public TresEnRayo() {
        setTitle("FÚTBOL EN RAYA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());

        // MongoDB
        String uri = "mongodb+srv://javiercarmonasolis2006:2PXjxAw1MGPcNuLy@clusterintermodular.whimpxk.mongodb.net/?retryWrites=true&w=majority&appName=ClusterIntermodular";
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase("futbol3raya");
        collection = database.getCollection("jugadores");

        // Elegimos aleatoriamente 3 países y 3 equipos
        List<String> listaPaises = Arrays.asList(paises);
        List<String> listaEquipos = Arrays.asList(equipos);
        Collections.shuffle(listaPaises);
        Collections.shuffle(listaEquipos);
        String[] paisesSeleccionados = listaPaises.subList(0, 3).toArray(new String[0]);
        String[] equiposSeleccionados = listaEquipos.subList(0, 3).toArray(new String[0]);

        JPanel topPanel = new JPanel(new GridLayout(1, 4));
        topPanel.add(new JLabel(""));
        for (String equipo : equiposSeleccionados) {
            topPanel.add(createHeaderLabel(equipo));
        }
        add(topPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(3, 4));

        for (int i = 0; i < 3; i++) {
            centerPanel.add(createHeaderLabel(paisesSeleccionados[i]));
            for (int j = 0; j < 3; j++) {
                JButton boton = new JButton("");
                boton.setFont(new Font("Arial", Font.BOLD, 40));
                boton.setBackground(Color.WHITE);
                int fila = i;
                int columna = j;
                boton.addActionListener(e -> manejarJugada(fila, columna));
                botones[i][j] = boton;
                centerPanel.add(boton);
            }
        }
        add(centerPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(new JLabel("JUGADOR:"));
        nombreJugadorField = new JTextField(20);
        bottomPanel.add(nombreJugadorField);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private JLabel createHeaderLabel(String text) {
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setOpaque(true);
        label.setForeground(Color.BLACK);
        return label;
    }

    private void manejarJugada(int fila, int columna) {
        JButton boton = botones[fila][columna];
        if (!boton.getText().equals("")) return;

        String nombre = nombreJugadorField.getText().trim();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduce el nombre del jugador.");
            return;
        }

        // Buscar jugador en MongoDB
        Document jugador = collection.find(new Document("nombre", nombre)).first();

        if (jugador == null) {
            JOptionPane.showMessageDialog(this, "❌ Jugador no encontrado en la base de datos.");
            return;
        }

        // Si se encuentra, marcar la casilla
        if (turnoJugadorX) {
            boton.setText("X");
            boton.setForeground(Color.GREEN);
        } else {
            boton.setText("O");
            boton.setForeground(Color.RED);
        }

        nombreJugadorField.setText(""); // limpiar el campo

        if (hayGanador()) {
            String ganador = turnoJugadorX ? "Jugador X" : "Jugador O";
            JOptionPane.showMessageDialog(this, "¡Ganó " + ganador + "!");
            guardarPartida(ganador);
            reiniciarTablero();
        } else if (tableroLleno()) {
            JOptionPane.showMessageDialog(this, "¡Empate!");
            guardarPartida("Empate");
            reiniciarTablero();
        } else {
            turnoJugadorX = !turnoJugadorX;
        }
    }


    private boolean hayGanador() {
        for (int i = 0; i < 3; i++) {
            if (!botones[i][0].getText().equals("") &&
                botones[i][0].getText().equals(botones[i][1].getText()) &&
                botones[i][1].getText().equals(botones[i][2].getText())) return true;

            if (!botones[0][i].getText().equals("") &&
                botones[0][i].getText().equals(botones[1][i].getText()) &&
                botones[1][i].getText().equals(botones[2][i].getText())) return true;
        }

        if (!botones[0][0].getText().equals("") &&
            botones[0][0].getText().equals(botones[1][1].getText()) &&
            botones[1][1].getText().equals(botones[2][2].getText())) return true;

        if (!botones[0][2].getText().equals("") &&
            botones[0][2].getText().equals(botones[1][1].getText()) &&
            botones[1][1].getText().equals(botones[2][0].getText())) return true;

        return false;
    }

    private boolean tableroLleno() {
        for (JButton[] fila : botones) {
            for (JButton b : fila) {
                if (b.getText().equals("")) return false;
            }
        }
        return true;
    }

    private void guardarPartida(String resultado) {
        String jugador = nombreJugadorField.getText().trim();
        if (jugador.isEmpty()) jugador = "Anónimo";

        Document doc = new Document("jugador", jugador)
            .append("resultado", resultado)
            .append("timestamp", System.currentTimeMillis());
        collection.insertOne(doc);
    }

    private void reiniciarTablero() {
        for (JButton[] fila : botones) {
            for (JButton b : fila) {
                b.setText("");
                b.setForeground(Color.BLACK);
            }
        }
        turnoJugadorX = true;
        dispose();
        new TresEnRayo().setVisible(true); // reinicia con nuevos nombres
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TresEnRayo().setVisible(true);
        });
    }
}

