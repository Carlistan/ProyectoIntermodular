import java.util.ArrayList;
import java.util.*;


import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Jugador {

	public static void InsertarJugadoresMadrid(MongoCollection<Document> collection) {
        List<Document> jugadoresMadrid = new ArrayList<>();

        jugadoresMadrid.add(new Document("nombre", "Thibaut Courtois")
        	    .append("nacionalidad", Arrays.asList("Bélgica"))
        	    .append("edad", 33)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Andriy Lunin")
        	    .append("nacionalidad", Arrays.asList("Ucrania"))
        	    .append("edad", 26)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Fran González")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 19)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Éder Militão")
        	    .append("nacionalidad", Arrays.asList("Brasil", "España"))
        	    .append("edad", 27)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Raúl Asencio")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Antonio Rüdiger")
        	    .append("nacionalidad", Arrays.asList("Alemania", "Sierra Leona"))
        	    .append("edad", 32)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "David Alaba")
        	    .append("nacionalidad", Arrays.asList("Austria"))
        	    .append("edad", 32)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Jesús Vallejo")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Ferland Mendy")
        	    .append("nacionalidad", Arrays.asList("Francia", "Senegal"))
        	    .append("edad", 29)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Fran García")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Daniel Carvajal")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 33)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Lucas Vázquez")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 33)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Aurélien Tchouaméni")
        	    .append("nacionalidad", Arrays.asList("Francia", "Camerún"))
        	    .append("edad", 25)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Federico Valverde")
        	    .append("nacionalidad", Arrays.asList("Uruguay", "España"))
        	    .append("edad", 26)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Eduardo Camavinga")
        	    .append("nacionalidad", Arrays.asList("Francia", "RD del Congo"))
        	    .append("edad", 22)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Dani Ceballos")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Luka Modrić")
        	    .append("nacionalidad", Arrays.asList("Croacia"))
        	    .append("edad", 39)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Jude Bellingham")
        	    .append("nacionalidad", Arrays.asList("Inglaterra", "Irlanda"))
        	    .append("edad", 21)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Vinicius Junior")
        	    .append("nacionalidad", Arrays.asList("Brasil", "España"))
        	    .append("edad", 24)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Rodrygo")
        	    .append("nacionalidad", Arrays.asList("Brasil", "España"))
        	    .append("edad", 24)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Arda Güler")
        	    .append("nacionalidad", Arrays.asList("Turquía"))
        	    .append("edad", 20)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Brahim Díaz")
        	    .append("nacionalidad", Arrays.asList("Marruecos", "España"))
        	    .append("edad", 25)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Real Madrid"));
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Kylian Mbappé")
        	    .append("nacionalidad", Arrays.asList("Francia", "Camerún"))
        	    .append("edad", 26)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "París Saint-Germain FC")); 
        collection.insertMany(jugadoresMadrid);

        jugadoresMadrid.add(new Document("nombre", "Endrick")
        	    .append("nacionalidad", Arrays.asList("Brasil"))
        	    .append("edad", 18)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "SE Palmeiras")); 
        collection.insertMany(jugadoresMadrid);
			
        
        
	}
	
	public static void InsertarJugadoresBarcelona(MongoCollection<Document> collection) {
        List<Document> jugadoresBarcelona = new ArrayList<>();

        jugadoresBarcelona.add(new Document("nombre", "Marc-André ter Stegen")
        	    .append("nacionalidad", Arrays.asList("Alemania"))
        	    .append("edad", 33)
        	    .append("posicion", "Portero")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Iñaki Peña")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 26)
        	    .append("posicion", "Portero")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Wojciech Szczesny")
        	    .append("nacionalidad", Arrays.asList("Polonia"))
        	    .append("edad", 35)
        	    .append("posicion", "Portero")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Pau Cubarsí")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 18)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Ronald Araujo")
        	    .append("nacionalidad", Arrays.asList("Uruguay", "España"))
        	    .append("edad", 26)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Andreas Christensen")
        	    .append("nacionalidad", Arrays.asList("Dinamarca"))
        	    .append("edad", 29)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Girona FC"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Eric García")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Iñigo Martínez")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 34)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Alejandro Balde")
        	    .append("nacionalidad", Arrays.asList("España", "República Dominicana"))
        	    .append("edad", 21)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "FC Barcelona Atlètic"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Gerard Martín")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Jules Koundé")
        	    .append("nacionalidad", Arrays.asList("Francia", "Benín"))
        	    .append("edad", 26)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "FC Barcelona Atlètic"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Héctor Fort")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 18)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "FC Barcelona Atlètic"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Marc Casadó")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 21)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "FC Barcelona Atlètic"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Marc Bernal")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 17)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Pedri")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Gavi")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 20)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Frenkie de Jong")
        	    .append("nacionalidad", Arrays.asList("Países Bajos"))
        	    .append("edad", 28)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "RB Leipzig"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Dani Olmo")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 27)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Fermín López")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Girona FC"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Pablo Torre")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Raphinha")
        	    .append("nacionalidad", Arrays.asList("Brasil", "Italia"))
        	    .append("edad", 28)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Brighton & Hove Albion"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Ansu Fati")
        	    .append("nacionalidad", Arrays.asList("España", "Guinea-Bissau"))
        	    .append("edad", 22)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Lamine Yamal")
        	    .append("nacionalidad", Arrays.asList("España", "Guinea Ecuatorial"))
        	    .append("edad", 17)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Ferran Torres")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Robert Lewandowski")
        	    .append("nacionalidad", Arrays.asList("Polonia"))
        	    .append("edad", 36)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Girona FC"));
        collection.insertMany(jugadoresBarcelona);

        jugadoresBarcelona.add(new Document("nombre", "Pau Víctor")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "FC Barcelona"));
        collection.insertMany(jugadoresBarcelona);

	}


	public static void main(String[] args) {
        String direccion_mongo = "mongodb+srv://javiercarmonasolis2006:2PXjxAw1MGPcNuLy@carmona.xw1p8zv.mongodb.net/?retryWrites=true&w=majority&appName=Carmona";

        try  {       	
        	MongoClient mongoClient = MongoClients.create(direccion_mongo);
            
            MongoDatabase database = mongoClient.getDatabase("futbol3raya");
            MongoCollection<Document> collectionJugadores = database.getCollection("jugadores");
            
            InsertarJugadoresMadrid(collectionJugadores);
            InsertarJugadoresBarcelona(collectionJugadores);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
