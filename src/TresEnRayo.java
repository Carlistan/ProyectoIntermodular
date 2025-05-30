import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class TresEnRayo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
		        String direccion_mongo = "mongodb+srv://javiercarmonasolis2006:2PXjxAw1MGPcNuLy@clusterintermodular.whimpxk.mongodb.net/?retryWrites=true&w=majority&appName=ClusterIntermodular";
				try {
					
					MongoClient mongoClient = MongoClients.create(direccion_mongo);
		            
		            MongoDatabase database = mongoClient.getDatabase("futbol3raya");
		            MongoCollection<Document> collectionJugadores = database.getCollection("jugadores");
		            
					
					TresEnRayo frame = new TresEnRayo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public TresEnRayo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
