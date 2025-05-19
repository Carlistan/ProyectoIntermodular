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

	public static void InsertarJugadoresAtleticoMadrid(MongoCollection<Document> collection) {
        List<Document> jugadoresAtleticoMadrid = new ArrayList<>();

		
        jugadoresAtleticoMadrid.add(new Document("nombre", "Jan Oblak")
        	    .append("nacionalidad", List.of("Eslovenia"))
        	    .append("edad", 32)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Juan Musso")
        	    .append("nacionalidad", List.of("Argentina", "Italia"))
        	    .append("edad", 31)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Robin Le Normand")
        	    .append("nacionalidad", List.of("España", "Francia"))
        	    .append("edad", 28)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "José María Giménez")
        	    .append("nacionalidad", List.of("Uruguay", "España"))
        	    .append("edad", 30)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Clément Lenglet")
        	    .append("nacionalidad", List.of("Francia"))
        	    .append("edad", 29)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Axel Witsel")
        	    .append("nacionalidad", List.of("Bélgica", "Martinica"))
        	    .append("edad", 36)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "César Azpilicueta")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 35)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Reinildo Mandava")
        	    .append("nacionalidad", List.of("Mozambique"))
        	    .append("edad", 31)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Javi Galán")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 30)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Nahuel Molina")
        	    .append("nacionalidad", List.of("Argentina"))
        	    .append("edad", 27)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Pablo Barrios")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 21)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Conor Gallagher")
        	    .append("nacionalidad", List.of("Inglaterra", "Irlanda"))
        	    .append("edad", 25)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Rodrigo De Paul")
        	    .append("nacionalidad", List.of("Argentina", "Italia"))
        	    .append("edad", 30)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Koke")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 33)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Marcos Llorente")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 30)
        	    .append("posicion", "Interior derecho")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Thomas Lemar")
        	    .append("nacionalidad", List.of("Francia", "Guadalupe"))
        	    .append("edad", 29)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Samuel Lino")
        	    .append("nacionalidad", List.of("Brasil"))
        	    .append("edad", 25)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Rodrigo Riquelme")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Giuliano Simeone")
        	    .append("nacionalidad", List.of("Argentina", "Italia"))
        	    .append("edad", 22)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Ángel Correa")
        	    .append("nacionalidad", List.of("Argentina", "España"))
        	    .append("edad", 30)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Julián Alvarez")
        	    .append("nacionalidad", List.of("Argentina", "Italia"))
        	    .append("edad", 25)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Alexander Sørloth")
        	    .append("nacionalidad", List.of("Noruega"))
        	    .append("edad", 29)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);

        jugadoresAtleticoMadrid.add(new Document("nombre", "Antoine Griezmann")
        	    .append("nacionalidad", List.of("Francia"))
        	    .append("edad", 34)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Atlético de Madrid"));
        collection.insertMany(jugadoresAtleticoMadrid);


	}
	
	
	public static void InsertarJugadoresRealSociedad(MongoCollection<Document> collection) {
        List<Document> jugadoresRealSociedad = new ArrayList<>();

        
        jugadoresRealSociedad.add(new Document("nombre", "Álex Remiro")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 30)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Unai Marrero")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Nayef Aguerd")
        	    .append("nacionalidad", List.of("Marruecos"))
        	    .append("edad", 29)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Igor Zubeldia")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Jon Pacheco")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Aritz Elustondo")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 31)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Jon Martín")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 19)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Javi López")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Aihen Muñoz")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 27)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Jon Aramburu")
        	    .append("nacionalidad", List.of("Venezuela", "España"))
        	    .append("edad", 22)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Hamari Traoré")
        	    .append("nacionalidad", List.of("Malí"))
        	    .append("edad", 33)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Álvaro Odriozola")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 29)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Martín Zubimendi")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 26)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Luka Sucic")
        	    .append("nacionalidad", List.of("Croacia"))
        	    .append("edad", 22)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Beñat Turrientes")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Jon Ander Olasagasti")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Brais Méndez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Arsen Zakharyan")
        	    .append("nacionalidad", List.of("Rusia"))
        	    .append("edad", 21)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Pablo Marín")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 21)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Ander Barrenetxea")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Sheraldo Becker")
        	    .append("nacionalidad", List.of("Surinam", "Países Bajos"))
        	    .append("edad", 30)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Arkaitz Mariezkurrena")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 20)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Takefusa Kubo")
        	    .append("nacionalidad", List.of("Japón"))
        	    .append("edad", 23)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Sergio Gómez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Mikel Oyarzabal")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

        jugadoresRealSociedad.add(new Document("nombre", "Orri Óskarsson")
        	    .append("nacionalidad", List.of("Islandia"))
        	    .append("edad", 20)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Real Sociedad"));
        collection.insertMany(jugadoresRealSociedad);

	}
	
	public static void InsertarJugadoresAtleticoBilbao(MongoCollection<Document> collection) {
        List<Document> jugadoresAtleticoBilbao = new ArrayList<>();
	
        jugadoresAtleticoBilbao.add(new Document("nombre", "Unai Simón")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 27)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Julen Agirrezabala")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Dani Vivian")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Aitor Paredes")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Yeray Álvarez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 30)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Unai Núñez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Adama Boiro")
        	    .append("nacionalidad", List.of("España", "Senegal"))
        	    .append("edad", 22)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Yuri Berchiche")
        	    .append("nacionalidad", List.of("España", "Argelia"))
        	    .append("edad", 35)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Andoni Gorosabel")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Iñigo Lekue")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 32)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Óscar de Marcos")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 36)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Mikel Vesga")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 32)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Mikel Jauregizar")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 21)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Beñat Prados")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Iñigo Ruiz de Galarreta")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 31)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Oihan Sancet")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Unai Gómez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 21)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Peio Canales")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 20)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Nico Williams")
        	    .append("nacionalidad", List.of("España", "Ghana"))
        	    .append("edad", 22)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Álex Berenguer")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 29)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Álvaro Djaló")
        	    .append("nacionalidad", List.of("España", "Guinea-Bissau"))
        	    .append("edad", 25)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Iñaki Williams")
        	    .append("nacionalidad", List.of("Ghana", "España"))
        	    .append("edad", 30)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Gorka Guruzeta")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Athletic Club"));

        jugadoresAtleticoBilbao.add(new Document("nombre", "Maroan Sannadi")
        	    .append("nacionalidad", List.of("España", "Marruecos"))
        	    .append("edad", 24)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Athletic Club"));

	
	}
	
	
	public static void main(String[] args) {
        String direccion_mongo = "mongodb+srv://javiercarmonasolis2006:2PXjxAw1MGPcNuLy@carmona.xw1p8zv.mongodb.net/?retryWrites=true&w=majority&appName=Carmona";

        try  {       	
        	MongoClient mongoClient = MongoClients.create(direccion_mongo);
            
            MongoDatabase database = mongoClient.getDatabase("futbol3raya");
            MongoCollection<Document> collectionJugadores = database.getCollection("jugadores");
            
            InsertarJugadoresMadrid(collectionJugadores);
            InsertarJugadoresBarcelona(collectionJugadores);
            InsertarJugadoresAtleticoMadrid(collectionJugadores);
            InsertarJugadoresRealSociedad(collectionJugadores);
            InsertarJugadoresAtleticoBilbao(collectionJugadores);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
