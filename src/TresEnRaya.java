import javax.swing.*;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.awt.*;
import java.awt.event.*;

public class TresEnRaya extends JFrame {
    private JButton[][] tablero = new JButton[3][3];
    private boolean turnoX = true;
    private JLabel estadoLabel;
    private JButton reiniciarButton;

    public TresEnRaya() {
        setTitle("Tres en Raya");
        setSize(400, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel del tablero
        JPanel panelTablero = new JPanel(new GridLayout(3, 3));
        Font font = new Font("Arial", Font.BOLD, 40);

        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                JButton boton = new JButton("");
                boton.setFont(font);
                tablero[fila][col] = boton;
                panelTablero.add(boton);

                final int f = fila;
                final int c = col;

                boton.addActionListener(e -> manejarMovimiento(f, c));
            }
        }

        // Panel de estado
        JPanel panelEstado = new JPanel(new BorderLayout());
        estadoLabel = new JLabel("Turno de X", SwingConstants.CENTER);
        estadoLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        panelEstado.add(estadoLabel, BorderLayout.CENTER);

        // Botón de reinicio
        reiniciarButton = new JButton("Reiniciar");
        reiniciarButton.setVisible(false);
        reiniciarButton.addActionListener(e -> reiniciarJuego());
        panelEstado.add(reiniciarButton, BorderLayout.EAST);

        add(panelTablero, BorderLayout.CENTER);
        add(panelEstado, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void manejarMovimiento(int fila, int col) {
        JButton boton = tablero[fila][col];

        if (!boton.getText().equals("") || hayGanador()) {
            return; // Casilla ocupada o juego terminado
        }

        boton.setText(turnoX ? "X" : "O");
        boton.setEnabled(false);

        if (hayGanador()) {
            estadoLabel.setText("¡Ganador: " + (turnoX ? "X" : "O") + "!");
            reiniciarButton.setVisible(true);
        } else if (empate()) {
            estadoLabel.setText("¡Empate!");
            reiniciarButton.setVisible(true);
        } else {
            turnoX = !turnoX;
            estadoLabel.setText("Turno de " + (turnoX ? "X" : "O"));
        }
    }

    private boolean hayGanador() {
        String simbolo = turnoX ? "X" : "O";

        for (int i = 0; i < 3; i++) {
            // Horizontales y verticales
            if (tablero[i][0].getText().equals(simbolo) &&
                tablero[i][1].getText().equals(simbolo) &&
                tablero[i][2].getText().equals(simbolo)) return true;

            if (tablero[0][i].getText().equals(simbolo) &&
                tablero[1][i].getText().equals(simbolo) &&
                tablero[2][i].getText().equals(simbolo)) return true;
        }

        // Diagonales
        if (tablero[0][0].getText().equals(simbolo) &&
            tablero[1][1].getText().equals(simbolo) &&
            tablero[2][2].getText().equals(simbolo)) return true;

        if (tablero[0][2].getText().equals(simbolo) &&
            tablero[1][1].getText().equals(simbolo) &&
            tablero[2][0].getText().equals(simbolo)) return true;

        return false;
    }

    private boolean empate() {
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                if (tablero[fila][col].getText().equals("")) {
                    return false;
                }
            }
        }
        return !hayGanador();
    }

    private void reiniciarJuego() {
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                tablero[fila][col].setText("");
                tablero[fila][col].setEnabled(true);
            }
        }
        turnoX = true;
        estadoLabel.setText("Turno de X");
        reiniciarButton.setVisible(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TresEnRaya::new);
        
        String direccion_mongo = "mongodb+srv://javiercarmonasolis2006:2PXjxAw1MGPcNuLy@clusterintermodular.whimpxk.mongodb.net/?retryWrites=true&w=majority&appName=ClusterIntermodular";
        try  {       	
        	MongoClient mongoClient = MongoClients.create(direccion_mongo);
            
            MongoDatabase database = mongoClient.getDatabase("futbol3raya");
            MongoCollection<Document> collectionJugadores = database.getCollection("jugadores");
      
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
