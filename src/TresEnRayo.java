import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.mongodb.client.*;
import org.bson.Document;
import static com.mongodb.client.model.Filters.*;

public class TresEnRayo extends JFrame {
    private JButton[][] tablero;
    private JTextField inputNombre;
    private JLabel infoResultado;
    private JLabel turnoLabel;
    private JButton reiniciarBtn;
    private String jugadorActual = "X";
    private String[] categoriasFila;
    private String[] categoriasColumna;
    private JPanel etiquetasHorizontales;
    private JPanel etiquetasVerticales;
    private MongoCollection<Document> coleccion;
    private String jugadorX = "";
    private String jugadorO = "";


    private final String[] todasNacionalidades = {"PORTUGAL", "ESPAÑA", "ARGENTINA", "BRASIL", "FRANCIA", "ALEMANIA"};
    private final String[] todosEquipos = {"Alaves,Athletic Club,Atletico de Madrid,Barcelona,Betis,Celta,Espanyol,Getafe,Girona,Leganes,Madrid,Mallorca,Osasuna,Palmas,Rayo Vallecano,Real Sociedad,Sevilla,Valencia,Valladolid,Villareal"};

    public TresEnRayo() {
    	 String direccion_mongo = "mongodb+srv://javiercarmonasolis2006:2PXjxAw1MGPcNuLy@clusterintermodular.whimpxk.mongodb.net/?retryWrites=true&w=majority&appName=ClusterIntermodular";
			try {
				MongoClient mongoClient = MongoClients.create(direccion_mongo);
	            
	            MongoDatabase database = mongoClient.getDatabase("futbol3raya");
	            coleccion = database.getCollection("jugadores");

        setTitle("Fútbol en Raya");
        setSize(700, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelCentral = new JPanel(new BorderLayout());
        JPanel panelTablero = new JPanel(new GridLayout(3, 3));
        tablero = new JButton[3][3];

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

        // Paneles de etiquetas
        etiquetasHorizontales = new JPanel(new GridLayout(1, 3));
        etiquetasVerticales = new JPanel(new GridLayout(3, 1));

        panelCentral.add(etiquetasHorizontales, BorderLayout.NORTH);
        panelCentral.add(etiquetasVerticales, BorderLayout.WEST);
        panelCentral.add(panelTablero, BorderLayout.CENTER);

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

        add(panelCentral, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        generarCategoriasAleatorias();

        setVisible(true);
			}catch (Exception e) {
            e.printStackTrace(); 
            JOptionPane.showMessageDialog(this, "Error al conectar con MongoDB", "Error", JOptionPane.ERROR_MESSAGE);
        }
			
    }

    private void generarCategoriasAleatorias() {
        categoriasFila = seleccionarAleatorio(todasNacionalidades, 3);
        categoriasColumna = seleccionarAleatorio(todosEquipos, 3);

        etiquetasHorizontales.removeAll();
        for (String cat : categoriasColumna) {
            JLabel lbl = new JLabel(cat, SwingConstants.CENTER);
            lbl.setFont(new Font("Arial", Font.BOLD, 14));
            etiquetasHorizontales.add(lbl);
        }

        etiquetasVerticales.removeAll();
        for (String cat : categoriasFila) {
            JLabel lbl = new JLabel(cat, SwingConstants.CENTER);
            lbl.setFont(new Font("Arial", Font.BOLD, 14));
            etiquetasVerticales.add(lbl);
        }

        etiquetasHorizontales.revalidate();
        etiquetasHorizontales.repaint();
        etiquetasVerticales.revalidate();
        etiquetasVerticales.repaint();
    }

    private String[] seleccionarAleatorio(String[] origen, int cantidad) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(origen));
        Collections.shuffle(lista);
        return lista.subList(0, cantidad).toArray(new String[0]);
    }

    private void manejarTurno(int fila, int columna) {
        String nombre = inputNombre.getText().trim();

        if (nombre.isEmpty()) {
            infoResultado.setText("Por favor, introduce un nombre.");
            return;
        }

        // Comprobamos si el jugador cumple las condiciones
        String categoriaFila = categoriasFila[fila];
        String categoriaCol = categoriasColumna[columna];

        ArrayList<Document> resultados = coleccion.find(and(
                in("equipos", categoriaCol),
                eq("nacionalidad", categoriaFila)
        )).into(new ArrayList<>());

        boolean encontrado = resultados.stream()
                .anyMatch(doc -> doc.getString("nombre").equalsIgnoreCase(nombre));

        if (!encontrado) {
            infoResultado.setText("Fallo. Ese jugador no cumple las condiciones.");
            return;
        }

        // Asignación de nombres a X y O (solo la primera vez)
        if (jugadorActual.equals("X")) {
            if (jugadorX.isEmpty()) {
                jugadorX = nombre;
            } else if (!jugadorX.equals(nombre)) {
                infoResultado.setText("Ese no es el nombre del Jugador X.");
                return;
            }
        } else {
            if (jugadorO.isEmpty()) {
                if (nombre.equals(jugadorX)) {
                    infoResultado.setText("Ese nombre ya está en uso como Jugador X.");
                    return;
                }
                jugadorO = nombre;
            } else if (!jugadorO.equals(nombre)) {
                infoResultado.setText("Ese no es el nombre del Jugador O.");
                return;
            }
        }

        // Colocar nombre en el botón si la casilla está vacía
        JButton boton = tablero[fila][columna];
        if (boton.getText().isEmpty()) {
            boton.setText(nombre);
            boton.setEnabled(false);
            infoResultado.setText("Acierto! Jugador " + jugadorActual + ": " + nombre);

            if (hayGanador()) {
                String nombreGanador = jugadorActual.equals("X") ? jugadorX : jugadorO;
                infoResultado.setText("Ganador: " + nombreGanador + " (" + jugadorActual + ")");
                reiniciarBtn.setVisible(true);
                deshabilitarTablero();
            } else {
                // Cambiar de turno
                jugadorActual = jugadorActual.equals("X") ? "O" : "X";
                turnoLabel.setText("Turno: Jugador " + jugadorActual);
            }
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
        generarCategoriasAleatorias();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TresEnRayo::new);
    }
}