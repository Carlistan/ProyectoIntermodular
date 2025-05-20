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

        jugadoresMadrid.add(new Document("nombre", "Andriy Lunin")
        	    .append("nacionalidad", Arrays.asList("Ucrania"))
        	    .append("edad", 26)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Fran González")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 19)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Éder Militão")
        	    .append("nacionalidad", Arrays.asList("Brasil", "España"))
        	    .append("edad", 27)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Raúl Asencio")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Antonio Rüdiger")
        	    .append("nacionalidad", Arrays.asList("Alemania", "Sierra Leona"))
        	    .append("edad", 32)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "David Alaba")
        	    .append("nacionalidad", Arrays.asList("Austria"))
        	    .append("edad", 32)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Jesús Vallejo")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Ferland Mendy")
        	    .append("nacionalidad", Arrays.asList("Francia", "Senegal"))
        	    .append("edad", 29)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Fran García")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Daniel Carvajal")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 33)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Lucas Vázquez")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 33)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Aurélien Tchouaméni")
        	    .append("nacionalidad", Arrays.asList("Francia", "Camerún"))
        	    .append("edad", 25)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Federico Valverde")
        	    .append("nacionalidad", Arrays.asList("Uruguay", "España"))
        	    .append("edad", 26)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Eduardo Camavinga")
        	    .append("nacionalidad", Arrays.asList("Francia", "RD del Congo"))
        	    .append("edad", 22)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Dani Ceballos")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Luka Modrić")
        	    .append("nacionalidad", Arrays.asList("Croacia"))
        	    .append("edad", 39)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Jude Bellingham")
        	    .append("nacionalidad", Arrays.asList("Inglaterra", "Irlanda"))
        	    .append("edad", 21)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Vinicius Junior")
        	    .append("nacionalidad", Arrays.asList("Brasil", "España"))
        	    .append("edad", 24)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Rodrygo")
        	    .append("nacionalidad", Arrays.asList("Brasil", "España"))
        	    .append("edad", 24)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Arda Güler")
        	    .append("nacionalidad", Arrays.asList("Turquía"))
        	    .append("edad", 20)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Brahim Díaz")
        	    .append("nacionalidad", Arrays.asList("Marruecos", "España"))
        	    .append("edad", 25)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Real Madrid"));

        jugadoresMadrid.add(new Document("nombre", "Kylian Mbappé")
        	    .append("nacionalidad", Arrays.asList("Francia", "Camerún"))
        	    .append("edad", 26)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "París Saint-Germain FC")); 

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

        jugadoresBarcelona.add(new Document("nombre", "Iñaki Peña")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 26)
        	    .append("posicion", "Portero")
        	    .append("equipo", "FC Barcelona"));

        jugadoresBarcelona.add(new Document("nombre", "Wojciech Szczesny")
        	    .append("nacionalidad", Arrays.asList("Polonia"))
        	    .append("edad", 35)
        	    .append("posicion", "Portero")
        	    .append("equipo", "FC Barcelona"));

        jugadoresBarcelona.add(new Document("nombre", "Pau Cubarsí")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 18)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "FC Barcelona"));

        jugadoresBarcelona.add(new Document("nombre", "Ronald Araujo")
        	    .append("nacionalidad", Arrays.asList("Uruguay", "España"))
        	    .append("edad", 26)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "FC Barcelona"));

        jugadoresBarcelona.add(new Document("nombre", "Andreas Christensen")
        	    .append("nacionalidad", Arrays.asList("Dinamarca"))
        	    .append("edad", 29)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Girona FC"));

        jugadoresBarcelona.add(new Document("nombre", "Eric García")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "FC Barcelona"));

        jugadoresBarcelona.add(new Document("nombre", "Iñigo Martínez")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 34)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "FC Barcelona"));

        jugadoresBarcelona.add(new Document("nombre", "Alejandro Balde")
        	    .append("nacionalidad", Arrays.asList("España", "República Dominicana"))
        	    .append("edad", 21)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "FC Barcelona Atlètic"));

        jugadoresBarcelona.add(new Document("nombre", "Gerard Martín")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "FC Barcelona"));

        jugadoresBarcelona.add(new Document("nombre", "Jules Koundé")
        	    .append("nacionalidad", Arrays.asList("Francia", "Benín"))
        	    .append("edad", 26)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "FC Barcelona Atlètic"));

        jugadoresBarcelona.add(new Document("nombre", "Héctor Fort")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 18)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "FC Barcelona Atlètic"));

        jugadoresBarcelona.add(new Document("nombre", "Marc Casadó")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 21)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "FC Barcelona Atlètic"));

        jugadoresBarcelona.add(new Document("nombre", "Marc Bernal")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 17)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "FC Barcelona"));

        jugadoresBarcelona.add(new Document("nombre", "Pedri")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "FC Barcelona"));

        jugadoresBarcelona.add(new Document("nombre", "Gavi")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 20)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "FC Barcelona"));

        jugadoresBarcelona.add(new Document("nombre", "Frenkie de Jong")
        	    .append("nacionalidad", Arrays.asList("Países Bajos"))
        	    .append("edad", 28)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "RB Leipzig"));

        jugadoresBarcelona.add(new Document("nombre", "Dani Olmo")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 27)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "FC Barcelona"));

        jugadoresBarcelona.add(new Document("nombre", "Fermín López")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Girona FC"));

        jugadoresBarcelona.add(new Document("nombre", "Pablo Torre")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "FC Barcelona"));

        jugadoresBarcelona.add(new Document("nombre", "Raphinha")
        	    .append("nacionalidad", Arrays.asList("Brasil", "Italia"))
        	    .append("edad", 28)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Brighton & Hove Albion"));

        jugadoresBarcelona.add(new Document("nombre", "Ansu Fati")
        	    .append("nacionalidad", Arrays.asList("España", "Guinea-Bissau"))
        	    .append("edad", 22)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "FC Barcelona"));

        jugadoresBarcelona.add(new Document("nombre", "Lamine Yamal")
        	    .append("nacionalidad", Arrays.asList("España", "Guinea Ecuatorial"))
        	    .append("edad", 17)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "FC Barcelona"));

        jugadoresBarcelona.add(new Document("nombre", "Ferran Torres")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "FC Barcelona"));

        jugadoresBarcelona.add(new Document("nombre", "Robert Lewandowski")
        	    .append("nacionalidad", Arrays.asList("Polonia"))
        	    .append("edad", 36)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Girona FC"));

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

        jugadoresAtleticoMadrid.add(new Document("nombre", "Juan Musso")
        	    .append("nacionalidad", List.of("Argentina", "Italia"))
        	    .append("edad", 31)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Robin Le Normand")
        	    .append("nacionalidad", List.of("España", "Francia"))
        	    .append("edad", 28)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "José María Giménez")
        	    .append("nacionalidad", List.of("Uruguay", "España"))
        	    .append("edad", 30)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Clément Lenglet")
        	    .append("nacionalidad", List.of("Francia"))
        	    .append("edad", 29)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Axel Witsel")
        	    .append("nacionalidad", List.of("Bélgica", "Martinica"))
        	    .append("edad", 36)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "César Azpilicueta")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 35)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Reinildo Mandava")
        	    .append("nacionalidad", List.of("Mozambique"))
        	    .append("edad", 31)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Javi Galán")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 30)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Nahuel Molina")
        	    .append("nacionalidad", List.of("Argentina"))
        	    .append("edad", 27)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Pablo Barrios")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 21)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Conor Gallagher")
        	    .append("nacionalidad", List.of("Inglaterra", "Irlanda"))
        	    .append("edad", 25)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Rodrigo De Paul")
        	    .append("nacionalidad", List.of("Argentina", "Italia"))
        	    .append("edad", 30)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Koke")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 33)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Marcos Llorente")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 30)
        	    .append("posicion", "Interior derecho")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Thomas Lemar")
        	    .append("nacionalidad", List.of("Francia", "Guadalupe"))
        	    .append("edad", 29)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Samuel Lino")
        	    .append("nacionalidad", List.of("Brasil"))
        	    .append("edad", 25)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Rodrigo Riquelme")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Giuliano Simeone")
        	    .append("nacionalidad", List.of("Argentina", "Italia"))
        	    .append("edad", 22)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Ángel Correa")
        	    .append("nacionalidad", List.of("Argentina", "España"))
        	    .append("edad", 30)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Julián Alvarez")
        	    .append("nacionalidad", List.of("Argentina", "Italia"))
        	    .append("edad", 25)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresAtleticoMadrid.add(new Document("nombre", "Alexander Sørloth")
        	    .append("nacionalidad", List.of("Noruega"))
        	    .append("edad", 29)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Atlético de Madrid"));

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

        jugadoresRealSociedad.add(new Document("nombre", "Unai Marrero")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Nayef Aguerd")
        	    .append("nacionalidad", List.of("Marruecos"))
        	    .append("edad", 29)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Igor Zubeldia")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Jon Pacheco")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Sociedad"));


        jugadoresRealSociedad.add(new Document("nombre", "Aritz Elustondo")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 31)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Jon Martín")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 19)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Sociedad"));

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

        jugadoresRealSociedad.add(new Document("nombre", "Martín Zubimendi")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 26)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Luka Sucic")
        	    .append("nacionalidad", List.of("Croacia"))
        	    .append("edad", 22)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Beñat Turrientes")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Jon Ander Olasagasti")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Brais Méndez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Arsen Zakharyan")
        	    .append("nacionalidad", List.of("Rusia"))
        	    .append("edad", 21)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Pablo Marín")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 21)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Ander Barrenetxea")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Sheraldo Becker")
        	    .append("nacionalidad", List.of("Surinam", "Países Bajos"))
        	    .append("edad", 30)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Arkaitz Mariezkurrena")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 20)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Takefusa Kubo")
        	    .append("nacionalidad", List.of("Japón"))
        	    .append("edad", 23)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Sergio Gómez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Real Sociedad"));

        jugadoresRealSociedad.add(new Document("nombre", "Mikel Oyarzabal")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Real Sociedad"));

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
        collection.insertMany(jugadoresAtleticoBilbao);
	}
	
	public static void InsertarJugadoresVillarreal(MongoCollection<Document> collection) {
        List<Document> jugadoresVillarreal = new ArrayList<>();
	
        jugadoresVillarreal.add(new Document("nombre", "Diego Conde")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 26)
        	    .append("posicion", "Portero")
        	    .append("equipo", "CD Leganés"));

        jugadoresVillarreal.add(new Document("nombre", "Luiz Júnior")
        	    .append("nacionalidad", List.of("Brasil", "Portugal"))
        	    .append("edad", 24)
        	    .append("posicion", "Portero")
        	    .append("equipo", "FC Famalicão"));

        jugadoresVillarreal.add(new Document("nombre", "Iker Álvarez")
        	    .append("nacionalidad", List.of("Andorra"))
        	    .append("edad", 23)
        	    .append("posicion", "Portero")
        	    .append("equipo", "FC Famalicão"));

        jugadoresVillarreal.add(new Document("nombre", "Logan Costa")
        	    .append("nacionalidad", List.of("Cabo Verde", "Francia"))
        	    .append("edad", 24)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Toulouse FC"));

        jugadoresVillarreal.add(new Document("nombre", "Willy Kambwala")
        	    .append("nacionalidad", List.of("Francia", "RD del Congo"))
        	    .append("edad", 20)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Manchester United"));

        jugadoresVillarreal.add(new Document("nombre", "Eric Bailly")
        	    .append("nacionalidad", List.of("Costa de Marfil"))
        	    .append("edad", 31)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Manchester United"));

        jugadoresVillarreal.add(new Document("nombre", "Raúl Albiol")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 39)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Manchester United"));

        jugadoresVillarreal.add(new Document("nombre", "Pau Navarro")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 20)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Villarreal CF B"));

        jugadoresVillarreal.add(new Document("nombre", "Sergi Cardona")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "UD Las Palmas"));

        jugadoresVillarreal.add(new Document("nombre", "Alfonso Pedraza")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 29)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "UD Las Palmas"));

        jugadoresVillarreal.add(new Document("nombre", "Juan Foyth")
        	    .append("nacionalidad", List.of("Argentina", "España"))
        	    .append("edad", 27)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "UD Las Palmas"));

        jugadoresVillarreal.add(new Document("nombre", "Kiko Femenía")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 34)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "UD Las Palmas"));

        jugadoresVillarreal.add(new Document("nombre", "Pape Gueye")
        	    .append("nacionalidad", List.of("Senegal", "Francia"))
        	    .append("edad", 26)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "Olympique de Marsella"));

        jugadoresVillarreal.add(new Document("nombre", "Santi Comesaña")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Olympique de Marsella"));

        jugadoresVillarreal.add(new Document("nombre", "Dani Parejo")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 36)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Olympique de Marsella"));

        jugadoresVillarreal.add(new Document("nombre", "Denis Suárez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 31)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Olympique de Marsella"));

        jugadoresVillarreal.add(new Document("nombre", "Álex Baena")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Olympique de Marsella"));

        jugadoresVillarreal.add(new Document("nombre", "Yéremy Pino")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Olympique de Marsella"));

        jugadoresVillarreal.add(new Document("nombre", "Ilias Akhomach")
        	    .append("nacionalidad", List.of("Marruecos", "España"))
        	    .append("edad", 21)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Olympique de Marsella"));

        jugadoresVillarreal.add(new Document("nombre", "Tajon Buchanan")
        	    .append("nacionalidad", List.of("Canadá", "Jamaica"))
        	    .append("edad", 26)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Inter de Milán"));

        jugadoresVillarreal.add(new Document("nombre", "Nicolas Pépé")
        	    .append("nacionalidad", List.of("Costa de Marfil", "Francia"))
        	    .append("edad", 29)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Trabzonspor"));

        jugadoresVillarreal.add(new Document("nombre", "Thierno Barry")
        	    .append("nacionalidad", List.of("Francia", "Guinea"))
        	    .append("edad", 22)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "FC Basilea"));

        jugadoresVillarreal.add(new Document("nombre", "Ayoze Pérez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 31)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Real Betis Balompié"));

        jugadoresVillarreal.add(new Document("nombre", "Gerard Moreno")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 33)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Real Betis Balompié"));
        collection.insertMany(jugadoresVillarreal);

	}
	
	public static void InsertarJugadoresValencia(MongoCollection<Document> collection) {
        List<Document> jugadoresValencia = new ArrayList<>();
        
        jugadoresValencia.add(new Document("nombre", "Giorgi Mamardashvili")
        	    .append("nacionalidad", List.of("Georgia"))
        	    .append("edad", 24)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Liverpool FC"));

        jugadoresValencia.add(new Document("nombre", "Stole Dimitrievski")
        	    .append("nacionalidad", List.of("Macedonia del Norte", "España"))
        	    .append("edad", 31)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Rayo Vallecano"));

        jugadoresValencia.add(new Document("nombre", "Jaume Doménech")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 34)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "Cristhian Mosquera")
        	    .append("nacionalidad", List.of("España", "Colombia"))
        	    .append("edad", 20)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "Yarek Gasiorowski")
        	    .append("nacionalidad", List.of("España", "Polonia"))
        	    .append("edad", 20)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "César Tárrega")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Valladolid CF"));

        jugadoresValencia.add(new Document("nombre", "Mouctar Diakhaby")
        	    .append("nacionalidad", List.of("Guinea", "Francia"))
        	    .append("edad", 28)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "José Gayà")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 29)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "Jesús Vázquez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "Max Aarons")
        	    .append("nacionalidad", List.of("Inglaterra", "Jamaica"))
        	    .append("edad", 25)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "AFC Bournemouth"));

        jugadoresValencia.add(new Document("nombre", "Thierry Correia")
        	    .append("nacionalidad", List.of("Portugal", "Cabo Verde"))
        	    .append("edad", 26)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "Dimitri Foulquier")
        	    .append("nacionalidad", List.of("Guadalupe", "Francia"))
        	    .append("edad", 32)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "Pepelu")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 26)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "Enzo Barrenechea")
        	    .append("nacionalidad", List.of("Argentina"))
        	    .append("edad", 23)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "Aston Villa"));

        jugadoresValencia.add(new Document("nombre", "Hugo Guillamón")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "Javi Guerra")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "André Almeida")
        	    .append("nacionalidad", List.of("Portugal"))
        	    .append("edad", 24)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "Iván Jaime")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "FC Oporto"));

        jugadoresValencia.add(new Document("nombre", "Martín Tejón")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 21)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "Luis Rioja")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 31)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Deportivo Alavés"));

        jugadoresValencia.add(new Document("nombre", "Sergi Canós")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "Diego López")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "Fran Pérez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "Hugo Duro")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Valencia CF"));

        jugadoresValencia.add(new Document("nombre", "Umar Sadiq")
        	    .append("nacionalidad", List.of("Nigeria"))
        	    .append("edad", 28)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Real Sociedad"));

        jugadoresValencia.add(new Document("nombre", "Rafa Mir")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 27)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Sevilla FC"));
        collection.insertMany(jugadoresValencia);

	}
	
	public static void InsertarJugadoresGirona(MongoCollection<Document> collection) {
        List<Document> jugadoresGirona = new ArrayList<>();
        
        jugadoresGirona.add(new Document("nombre", "Paulo Gazzaniga")
        	    .append("nacionalidad", List.of("Argentina", "Italia"))
        	    .append("edad", 33)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Sin equipo"));

        jugadoresGirona.add(new Document("nombre", "Vladyslav Krapyvtsov")
        	    .append("nacionalidad", List.of("Ucrania"))
        	    .append("edad", 19)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Valencia CF"));

        jugadoresGirona.add(new Document("nombre", "Juan Carlos")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 37)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Valencia CF"));

        jugadoresGirona.add(new Document("nombre", "Ladislav Krejci")
        	    .append("nacionalidad", List.of("República Checa"))
        	    .append("edad", 26)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "AC Sparta Praga"));

        jugadoresGirona.add(new Document("nombre", "David López")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 35)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Valencia CF"));

        jugadoresGirona.add(new Document("nombre", "Daley Blind")
        	    .append("nacionalidad", List.of("Países Bajos", "Inglaterra"))
        	    .append("edad", 35)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Valencia CF"));

        jugadoresGirona.add(new Document("nombre", "Juanpe")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 34)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Valencia CF"));

        jugadoresGirona.add(new Document("nombre", "Miguel Gutiérrez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Valencia CF"));

        jugadoresGirona.add(new Document("nombre", "Arnau Martínez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Valencia CF"));

        jugadoresGirona.add(new Document("nombre", "Alejandro Francés")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Real Zaragoza"));

        jugadoresGirona.add(new Document("nombre", "Arthur Melo")
        	    .append("nacionalidad", List.of("Brasil"))
        	    .append("edad", 28)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "Juventus de Turín"));

        jugadoresGirona.add(new Document("nombre", "Oriol Romeu")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 33)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "FC Barcelona"));

        jugadoresGirona.add(new Document("nombre", "Yangel Herrera")
        	    .append("nacionalidad", List.of("Venezuela", "España"))
        	    .append("edad", 27)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Valencia CF"));

        jugadoresGirona.add(new Document("nombre", "Donny van de Beek")
        	    .append("nacionalidad", List.of("Países Bajos"))
        	    .append("edad", 28)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Manchester United"));

        jugadoresGirona.add(new Document("nombre", "Jhon Solís")
        	    .append("nacionalidad", List.of("Colombia"))
        	    .append("edad", 20)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Valencia CF"));

        jugadoresGirona.add(new Document("nombre", "Iván Martín")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 26)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Valencia CF"));

        jugadoresGirona.add(new Document("nombre", "Gabriel Misehouy")
        	    .append("nacionalidad", List.of("Países Bajos", "Ghana"))
        	    .append("edad", 19)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Ajax Amsterdam U21"));

        jugadoresGirona.add(new Document("nombre", "Bryan Gil")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Tottenham Hotspur"));

        jugadoresGirona.add(new Document("nombre", "Arnaut Danjuma")
        	    .append("nacionalidad", List.of("Países Bajos", "Nigeria"))
        	    .append("edad", 28)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Villarreal CF"));

        jugadoresGirona.add(new Document("nombre", "Min-su Kim")
        	    .append("nacionalidad", List.of("Corea del Sur"))
        	    .append("edad", 19)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Valencia CF"));

        jugadoresGirona.add(new Document("nombre", "Viktor Tsygankov")
        	    .append("nacionalidad", List.of("Ucrania"))
        	    .append("edad", 27)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Valencia CF"));

        jugadoresGirona.add(new Document("nombre", "Yáser Asprilla")
        	    .append("nacionalidad", List.of("Colombia"))
        	    .append("edad", 21)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Watford FC"));

        jugadoresGirona.add(new Document("nombre", "Portu")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 32)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Valencia CF"));

        jugadoresGirona.add(new Document("nombre", "Abel Ruiz")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "SC Braga"));

        jugadoresGirona.add(new Document("nombre", "Bojan Miovski")
        	    .append("nacionalidad", List.of("Macedonia del Norte"))
        	    .append("edad", 25)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Aberdeen FC"));

        jugadoresGirona.add(new Document("nombre", "Cristhian Stuani")
        	    .append("nacionalidad", List.of("Uruguay", "Italia"))
        	    .append("edad", 38)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Valencia CF"));
        collection.insertMany(jugadoresGirona);

	}
	
	public static void InsertarJugadoresSevilla(MongoCollection<Document> collection) {
        List<Document> jugadoresSevilla = new ArrayList<>();
        jugadoresSevilla.add(new Document("nombre", "Álvaro Fernández")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 27)
        	    .append("posicion", "Portero")
        	    .append("equipo", "SD Huesca"));

        jugadoresSevilla.add(new Document("nombre", "Ørjan Nyland")
        	    .append("nacionalidad", List.of("Noruega"))
        	    .append("edad", 34)
        	    .append("posicion", "Portero")
        	    .append("equipo", "SD Huesca"));

        jugadoresSevilla.add(new Document("nombre", "Loïc Badé")
        	    .append("nacionalidad", List.of("Francia", "Costa de Marfil"))
        	    .append("edad", 25)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "SD Huesca"));

        jugadoresSevilla.add(new Document("nombre", "Kike Salas")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "SD Huesca"));

        jugadoresSevilla.add(new Document("nombre", "Marcão")
        	    .append("nacionalidad", List.of("Brasil"))
        	    .append("edad", 28)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "SD Huesca"));

        jugadoresSevilla.add(new Document("nombre", "Tanguy Nianzou")
        	    .append("nacionalidad", List.of("Francia", "Costa de Marfil"))
        	    .append("edad", 22)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "SD Huesca"));

        jugadoresSevilla.add(new Document("nombre", "Ramón Martínez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "SD Huesca"));

        jugadoresSevilla.add(new Document("nombre", "Adrià Pedrosa")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 27)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "SD Huesca"));

        jugadoresSevilla.add(new Document("nombre", "José Ángel Carmona")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Getafe CF"));

        jugadoresSevilla.add(new Document("nombre", "Juanlu Sánchez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 21)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Inter de Milán"));

        jugadoresSevilla.add(new Document("nombre", "Lucien Agoumé")
        	    .append("nacionalidad", List.of("Francia", "Camerún"))
        	    .append("edad", 23)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "SD Huesca"));

        jugadoresSevilla.add(new Document("nombre", "Nemanja Gudelj")
        	    .append("nacionalidad", List.of("Serbia", "Países Bajos"))
        	    .append("edad", 33)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "SD Huesca"));

        jugadoresSevilla.add(new Document("nombre", "Albert Sambi Lokonga")
        	    .append("nacionalidad", List.of("Bélgica", "RD del Congo"))
        	    .append("edad", 25)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Arsenal FC"));

        jugadoresSevilla.add(new Document("nombre", "Djibril Sow")
        	    .append("nacionalidad", List.of("Suiza", "Senegal"))
        	    .append("edad", 28)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "SD Huesca"));

        jugadoresSevilla.add(new Document("nombre", "Saúl Ñíguez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 30)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Atlético de Madrid"));

        jugadoresSevilla.add(new Document("nombre", "Manu Bueno")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 20)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "SD Huesca"));

        jugadoresSevilla.add(new Document("nombre", "Stanis Idumbo")
        	    .append("nacionalidad", List.of("Bélgica", "RD del Congo"))
        	    .append("edad", 19)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Sevilla Atlético"));

        jugadoresSevilla.add(new Document("nombre", "Rubén Vargas")
        	    .append("nacionalidad", List.of("Suiza", "República Dominicana"))
        	    .append("edad", 26)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "FC Augsburgo"));

        jugadoresSevilla.add(new Document("nombre", "Chidera Ejuke")
        	    .append("nacionalidad", List.of("Nigeria"))
        	    .append("edad", 27)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "CSKA Moscú"));

        jugadoresSevilla.add(new Document("nombre", "Dodi Lukébakio")
        	    .append("nacionalidad", List.of("Bélgica", "RD del Congo"))
        	    .append("edad", 27)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "SD Huesca"));

        jugadoresSevilla.add(new Document("nombre", "Suso")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 31)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "SD Huesca"));

        jugadoresSevilla.add(new Document("nombre", "Peque Fernández")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Mediapunta")
        	    .append("equipo", "Real Racing Club"));

        jugadoresSevilla.add(new Document("nombre", "Isaac Romero")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "SD Huesca"));

        jugadoresSevilla.add(new Document("nombre", "Akor Adams")
        	    .append("nacionalidad", List.of("Nigeria"))
        	    .append("edad", 25)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Montpellier HSC"));

        jugadoresSevilla.add(new Document("nombre", "García Pascual")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "SD Huesca"));
        collection.insertMany(jugadoresSevilla);

	}
	
	public static void InsertarJugadoresBetis(MongoCollection<Document> collection) {
        List<Document> jugadoresBetis = new ArrayList<>();
        jugadoresBetis.add(new Document("nombre", "Fran Vieites")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 26)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Betis Deportivo Balompié"));

        jugadoresBetis.add(new Document("nombre", "Adrián")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 38)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Liverpool FC"));

        jugadoresBetis.add(new Document("nombre", "Natan")
        	    .append("nacionalidad", List.of("Brasil"))
        	    .append("edad", 24)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "SSC Nápoles"));

        jugadoresBetis.add(new Document("nombre", "Diego Llorente")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 31)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Leeds United"));

        jugadoresBetis.add(new Document("nombre", "Marc Bartra")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 34)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Betis Deportivo Balompié"));

        jugadoresBetis.add(new Document("nombre", "Romain Perraud")
        	    .append("nacionalidad", List.of("Francia"))
        	    .append("edad", 27)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Southampton FC"));

        jugadoresBetis.add(new Document("nombre", "Ricardo Rodríguez")
        	    .append("nacionalidad", List.of("Suiza", "Chile"))
        	    .append("edad", 32)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Torino FC"));

        jugadoresBetis.add(new Document("nombre", "Aitor Ruibal")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 29)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Betis Deportivo Balompié"));

        jugadoresBetis.add(new Document("nombre", "Héctor Bellerín")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 30)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Betis Deportivo Balompié"));

        jugadoresBetis.add(new Document("nombre", "Ángel Ortiz")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 20)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Betis Deportivo Balompié"));

        jugadoresBetis.add(new Document("nombre", "Youssouf Sabaly")
        	    .append("nacionalidad", List.of("Senegal", "Francia"))
        	    .append("edad", 32)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Betis Deportivo Balompié"));

        jugadoresBetis.add(new Document("nombre", "Johnny Cardoso")
        	    .append("nacionalidad", List.of("Estados Unidos", "Italia"))
        	    .append("edad", 23)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "Betis Deportivo Balompié"));

        jugadoresBetis.add(new Document("nombre", "Marc Roca")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "Leeds United"));

        jugadoresBetis.add(new Document("nombre", "William Carvalho")
        	    .append("nacionalidad", List.of("Portugal", "Angola"))
        	    .append("edad", 33)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "Betis Deportivo Balompié"));

        jugadoresBetis.add(new Document("nombre", "Giovani Lo Celso")
        	    .append("nacionalidad", List.of("Argentina", "Italia"))
        	    .append("edad", 29)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Tottenham Hotspur"));

        jugadoresBetis.add(new Document("nombre", "Sergi Altimira")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Betis Deportivo Balompié"));

        jugadoresBetis.add(new Document("nombre", "Mateo Flores")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 21)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "Betis Deportivo Balompié"));

        jugadoresBetis.add(new Document("nombre", "Pablo Fornals")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 29)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Betis Deportivo Balompié"));

        jugadoresBetis.add(new Document("nombre", "Isco")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 33)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "Betis Deportivo Balompié"));

        jugadoresBetis.add(new Document("nombre", "Abde Ezzalzouli")
        	    .append("nacionalidad", List.of("Marruecos", "España"))
        	    .append("edad", 23)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Betis Deportivo Balompié"));

        jugadoresBetis.add(new Document("nombre", "Jesús Rodríguez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 19)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Betis Deportivo Balompié"));

        jugadoresBetis.add(new Document("nombre", "Antony")
        	    .append("nacionalidad", List.of("Brasil"))
        	    .append("edad", 25)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Manchester United"));

        jugadoresBetis.add(new Document("nombre", "Cucho Hernández")
        	    .append("nacionalidad", List.of("Colombia", "España"))
        	    .append("edad", 26)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Columbus Crew"));

        jugadoresBetis.add(new Document("nombre", "Chimy Ávila")
        	    .append("nacionalidad", List.of("Argentina", "España"))
        	    .append("edad", 31)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Betis Deportivo Balompié"));

        jugadoresBetis.add(new Document("nombre", "Cédric Bakambu")
        	    .append("nacionalidad", List.of("RD del Congo", "Francia"))
        	    .append("edad", 34)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Betis Deportivo Balompié"));
            collection.insertMany(jugadoresBetis);

	}
	
	public static void InsertarJugadoresPalmas(MongoCollection<Document> collection) {
        List<Document> jugadoresPalmas = new ArrayList<>();
        jugadoresPalmas.add(new Document("nombre", "Dinko Horkas")
        	    .append("nacionalidad", List.of("Croacia", "Bosnia y Herzegovina"))
        	    .append("edad", 26)
        	    .append("posicion", "Portero")
        	    .append("equipo", "Lokomotiv Plovdiv"));

        jugadoresPalmas.add(new Document("nombre", "Jasper Cillessen")
        	    .append("nacionalidad", List.of("Países Bajos"))
        	    .append("edad", 36)
        	    .append("posicion", "Portero")
        	    .append("equipo", "NEC Nijmegen"));

        jugadoresPalmas.add(new Document("nombre", "Mika Mármol")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "UD Las Palmas"));

        jugadoresPalmas.add(new Document("nombre", "Scott McKenna")
        	    .append("nacionalidad", List.of("Escocia"))
        	    .append("edad", 28)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Nottingham Forest"));

        jugadoresPalmas.add(new Document("nombre", "Juanma Herzog")
        	    .append("nacionalidad", List.of("España", "Alemania"))
        	    .append("edad", 21)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Las Palmas Atlético"));

        jugadoresPalmas.add(new Document("nombre", "Alex Suárez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 32)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "UD Las Palmas"));

        jugadoresPalmas.add(new Document("nombre", "Álex Muñoz")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 30)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Levante UD"));

        jugadoresPalmas.add(new Document("nombre", "Andy Pelmard")
        	    .append("nacionalidad", List.of("Francia", "Guadalupe"))
        	    .append("edad", 25)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Clermont Foot 63"));

        jugadoresPalmas.add(new Document("nombre", "Viti Rozada")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 27)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Real Oviedo"));

        jugadoresPalmas.add(new Document("nombre", "Marvin Park")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Real Madrid Castilla"));

        jugadoresPalmas.add(new Document("nombre", "Dário Essugo")
        	    .append("nacionalidad", List.of("Portugal", "Angola"))
        	    .append("edad", 20)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "Sporting de Lisboa"));

        jugadoresPalmas.add(new Document("nombre", "Stefan Bajcetic")
        	    .append("nacionalidad", List.of("España", "Serbia"))
        	    .append("edad", 20)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "Liverpool FC"));

        jugadoresPalmas.add(new Document("nombre", "Javi Muñoz")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 30)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "UD Las Palmas"));

        jugadoresPalmas.add(new Document("nombre", "Enzo Loiodice")
        	    .append("nacionalidad", List.of("Francia"))
        	    .append("edad", 24)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "UD Las Palmas"));

        jugadoresPalmas.add(new Document("nombre", "José Campaña")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 31)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "UD Las Palmas"));

        jugadoresPalmas.add(new Document("nombre", "Alberto Moleiro")
        	    .append("nacionalidad", List.of("España", "Cuba"))
        	    .append("edad", 21)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "UD Las Palmas"));

        jugadoresPalmas.add(new Document("nombre", "Kirian Rodríguez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 29)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "UD Las Palmas"));

        jugadoresPalmas.add(new Document("nombre", "Manu Fuster")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 27)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Albacete Balompié"));

        jugadoresPalmas.add(new Document("nombre", "Benito Ramírez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 29)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "UD Las Palmas"));

        jugadoresPalmas.add(new Document("nombre", "Adnan Januzaj")
        	    .append("nacionalidad", List.of("Bélgica", "Kosovo"))
        	    .append("edad", 30)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "Sevilla FC"));

        jugadoresPalmas.add(new Document("nombre", "Fábio Silva")
        	    .append("nacionalidad", List.of("Portugal"))
        	    .append("edad", 22)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Wolverhampton Wanderers"));

        jugadoresPalmas.add(new Document("nombre", "Oli McBurnie")
        	    .append("nacionalidad", List.of("Escocia", "Inglaterra"))
        	    .append("edad", 28)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Sheffield United"));

        jugadoresPalmas.add(new Document("nombre", "Sandro Ramírez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 29)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "UD Las Palmas"));

        jugadoresPalmas.add(new Document("nombre", "Marc Cardona")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 29)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "UD Las Palmas"));

        jugadoresPalmas.add(new Document("nombre", "Jaime Mata")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 36)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Getafe CF"));
        collection.insertMany(jugadoresPalmas);

	}
	
	public static void InsertarJugadoresOsasuna(MongoCollection<Document> collection) {
        List<Document> jugadoresOsasuna = new ArrayList<>();
        jugadoresOsasuna.add(new Document("nombre", "Sergio Herrera")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 31)
        	    .append("posicion", "Portero")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "Aitor Fernández")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 34)
        	    .append("posicion", "Portero")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "Enzo Boyomo")
        	    .append("nacionalidad", List.of("Camerún", "Francia"))
        	    .append("edad", 23)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Valladolid CF"));

        jugadoresOsasuna.add(new Document("nombre", "Jorge Herrando")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "Alejandro Catena")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 30)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "Unai García")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 33)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Sin equipo"));

        jugadoresOsasuna.add(new Document("nombre", "Abel Bretones")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Real Oviedo"));

        jugadoresOsasuna.add(new Document("nombre", "Juan Cruz")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 32)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "Jesús Areso")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "Rubén Peña")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 33)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "Lucas Torró")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 30)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "Iker Muñoz")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "Jon Moncayola")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 27)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "Pablo Ibáñez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 26)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "Aimar Oroz")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "Bryan Zaragoza")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "Bayern Múnich"));

        jugadoresOsasuna.add(new Document("nombre", "Moi Gómez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 30)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "José Manuel Arnáiz")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 30)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "Rubén García")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 31)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "Kike Barja")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "Ante Budimir")
        	    .append("nacionalidad", List.of("Croacia"))
        	    .append("edad", 33)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "CA Osasuna"));

        jugadoresOsasuna.add(new Document("nombre", "Raúl García")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "CA Osasuna"));

        collection.insertMany(jugadoresOsasuna);

	}
	
	public static void InsertarJugadoresCelta(MongoCollection<Document> collection) {
        List<Document> jugadoresCelta = new ArrayList<>();
        
        jugadoresCelta.add(new Document("nombre", "Iván Villar")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 27)
        	    .append("posicion", "Portero")
        	    .append("equipo", "RC Celta de Vigo"));

        jugadoresCelta.add(new Document("nombre", "Vicente Guaita")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 38)
        	    .append("posicion", "Portero")
        	    .append("equipo", "RC Celta de Vigo"));

        jugadoresCelta.add(new Document("nombre", "Javi Rodríguez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 21)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "RC Celta Fortuna"));

        jugadoresCelta.add(new Document("nombre", "Carl Starfelt")
        	    .append("nacionalidad", List.of("Suecia"))
        	    .append("edad", 29)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "RC Celta de Vigo"));

        jugadoresCelta.add(new Document("nombre", "Carlos Domínguez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "RC Celta de Vigo"));

        jugadoresCelta.add(new Document("nombre", "Yoel Lago")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 21)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "RC Celta de Vigo"));

        jugadoresCelta.add(new Document("nombre", "Marcos Alonso")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 34)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "FC Barcelona"));

        jugadoresCelta.add(new Document("nombre", "Mihailo Ristic")
        	    .append("nacionalidad", List.of("Serbia", "Bosnia y Herzegovina"))
        	    .append("edad", 29)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "RC Celta de Vigo"));

        jugadoresCelta.add(new Document("nombre", "Óscar Mingueza")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 26)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "RC Celta de Vigo"));

        jugadoresCelta.add(new Document("nombre", "Sergio Carreira")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "Elche CF"));

        jugadoresCelta.add(new Document("nombre", "Javier Manquillo")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 31)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "RC Celta de Vigo"));

        jugadoresCelta.add(new Document("nombre", "Damián Rodríguez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "RC Celta Fortuna"));

        jugadoresCelta.add(new Document("nombre", "Jailson")
        	    .append("nacionalidad", List.of("Brasil"))
        	    .append("edad", 29)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "RC Celta de Vigo"));

        jugadoresCelta.add(new Document("nombre", "Fran Beltrán")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 26)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "RC Celta de Vigo"));

        jugadoresCelta.add(new Document("nombre", "Hugo Sotelo")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 21)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "RC Celta de Vigo"));

        jugadoresCelta.add(new Document("nombre", "Ilaix Moriba")
        	    .append("nacionalidad", List.of("Guinea", "España"))
        	    .append("edad", 22)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "RB Leipzig"));

        jugadoresCelta.add(new Document("nombre", "Hugo Álvarez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 21)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "RC Celta Fortuna"));

        jugadoresCelta.add(new Document("nombre", "Williot Swedberg")
        	    .append("nacionalidad", List.of("Suecia"))
        	    .append("edad", 21)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "RC Celta de Vigo"));

        jugadoresCelta.add(new Document("nombre", "Alfon González")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 26)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "RC Celta Fortuna"));

        jugadoresCelta.add(new Document("nombre", "Franco Cervi")
        	    .append("nacionalidad", List.of("Argentina", "Italia"))
        	    .append("edad", 30)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "RC Celta de Vigo"));

        jugadoresCelta.add(new Document("nombre", "Fer López")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 20)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "RC Celta de Vigo"));

        jugadoresCelta.add(new Document("nombre", "Iker Losada")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Mediapunta")
        	    .append("equipo", "Real Betis Balompié"));

        jugadoresCelta.add(new Document("nombre", "Pablo Durán")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "RC Celta Fortuna"));

        jugadoresCelta.add(new Document("nombre", "Borja Iglesias")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 32)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Real Betis Balompié"));

        jugadoresCelta.add(new Document("nombre", "Iago Aspas")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 37)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "RC Celta de Vigo"));

        collection.insertMany(jugadoresCelta);
	}
	
	public static void InsertarJugadoresEspanyol(MongoCollection<Document> collection) {
        List<Document> jugadoresEspanyol = new ArrayList<>();
        
        jugadoresEspanyol.add(new Document("nombre", "Joan García")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Portero")
        	    .append("equipo", "RCD Espanyol"));

        	jugadoresEspanyol.add(new Document("nombre", "Fernando Pacheco")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 33)
        	    .append("posicion", "Portero")
        	    .append("equipo", "RCD Espanyol"));

        	jugadoresEspanyol.add(new Document("nombre", "Ángel Fortuño")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Portero")
        	    .append("equipo", "RCD Espanyol B"));

        	jugadoresEspanyol.add(new Document("nombre", "Marash Kumbulla")
        	    .append("nacionalidad", List.of("Albania", "Italia"))
        	    .append("edad", 25)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "AS Roma"));

        	jugadoresEspanyol.add(new Document("nombre", "Fernando Calero")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 29)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "RCD Espanyol"));

        	jugadoresEspanyol.add(new Document("nombre", "Leandro Cabrera")
        	    .append("nacionalidad", List.of("Uruguay", "España"))
        	    .append("edad", 33)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "RCD Espanyol"));

        	jugadoresEspanyol.add(new Document("nombre", "Sergi Gómez")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 33)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "RCD Espanyol"));

        	jugadoresEspanyol.add(new Document("nombre", "Pablo Ramón")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Defensa central")
        	    .append("equipo", "Real Madrid Castilla"));

        	jugadoresEspanyol.add(new Document("nombre", "Carlos Romero")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "Villarreal CF"));

        	jugadoresEspanyol.add(new Document("nombre", "Brian Oliván")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 31)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipo", "RCD Espanyol"));

        	jugadoresEspanyol.add(new Document("nombre", "Omar El Hilali")
        	    .append("nacionalidad", List.of("Marruecos", "España"))
        	    .append("edad", 21)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "RCD Espanyol"));

        	jugadoresEspanyol.add(new Document("nombre", "Álvaro Tejero")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipo", "SD Eibar"));

        	jugadoresEspanyol.add(new Document("nombre", "Urko González de Zárate")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 24)
        	    .append("posicion", "Pivote")
        	    .append("equipo", "Real Sociedad"));

        	jugadoresEspanyol.add(new Document("nombre", "Alex Král")
        	    .append("nacionalidad", List.of("República Checa"))
        	    .append("edad", 27)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "1.FC Unión Berlín"));

        	jugadoresEspanyol.add(new Document("nombre", "Pol Lozano")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "RCD Espanyol"));

        	jugadoresEspanyol.add(new Document("nombre", "José Gragera")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "RCD Espanyol"));

        	jugadoresEspanyol.add(new Document("nombre", "Álvaro Aguado")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 29)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "RCD Espanyol"));

        	jugadoresEspanyol.add(new Document("nombre", "Edu Expósito")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "RCD Espanyol"));

        	jugadoresEspanyol.add(new Document("nombre", "Justin Smith")
        	    .append("nacionalidad", List.of("Canadá", "Francia"))
        	    .append("edad", 22)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "RCD Espanyol"));

        	jugadoresEspanyol.add(new Document("nombre", "Rafel Bauzà")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 20)
        	    .append("posicion", "Mediocentro")
        	    .append("equipo", "RCD Espanyol"));

        	jugadoresEspanyol.add(new Document("nombre", "Javi Puado")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 26)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "RCD Espanyol"));

        	jugadoresEspanyol.add(new Document("nombre", "Pere Milla")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 32)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipo", "RCD Espanyol"));

        	jugadoresEspanyol.add(new Document("nombre", "Jofre Carreras")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 23)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "RCD Espanyol"));

        	jugadoresEspanyol.add(new Document("nombre", "Antoniu Roca")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipo", "RCD Espanyol B"));

        	jugadoresEspanyol.add(new Document("nombre", "Roberto Fernández")
        	    .append("nacionalidad", List.of("España"))
        	    .append("edad", 22)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "SC Braga"));

        	jugadoresEspanyol.add(new Document("nombre", "Walid Cheddira")
        	    .append("nacionalidad", List.of("Marruecos", "Italia"))
        	    .append("edad", 27)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "SSC Nápoles"));

        	jugadoresEspanyol.add(new Document("nombre", "Alejo Veliz")
        	    .append("nacionalidad", List.of("Argentina"))
        	    .append("edad", 21)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "Tottenham Hotspur"));

        	jugadoresEspanyol.add(new Document("nombre", "Omar Sadik")
        	    .append("nacionalidad", List.of("Marruecos"))
        	    .append("edad", 21)
        	    .append("posicion", "Delantero centro")
        	    .append("equipo", "RCD Espanyol"));

            collection.insertMany(jugadoresEspanyol);

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
            InsertarJugadoresVillarreal(collectionJugadores);
            InsertarJugadoresValencia(collectionJugadores);
            InsertarJugadoresGirona(collectionJugadores);
            InsertarJugadoresSevilla(collectionJugadores);
            InsertarJugadoresBetis(collectionJugadores);
            InsertarJugadoresPalmas(collectionJugadores);
            InsertarJugadoresOsasuna(collectionJugadores);
            InsertarJugadoresCelta(collectionJugadores);
            InsertarJugadoresEspanyol(collectionJugadores);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
