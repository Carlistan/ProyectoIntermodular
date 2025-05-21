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
                .append("equipos", Arrays.asList("Genk", "Chelsea", "Atlético de Madrid", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Andriy Lunin")
                .append("nacionalidad", Arrays.asList("Ucrania"))
                .append("edad", 26)
                .append("posicion", "Portero")
                .append("equipos", Arrays.asList("Dnipro", "Zorya Luhansk", "Real Madrid", "Leganés", "Valladolid", "Oviedo")));

            jugadoresMadrid.add(new Document("nombre", "Éder Militão")
                .append("nacionalidad", Arrays.asList("Brasil"))
                .append("edad", 27)
                .append("posicion", "Defensa central")
                .append("equipos", Arrays.asList("São Paulo", "FC Porto", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Antonio Rüdiger")
                .append("nacionalidad", Arrays.asList("Alemania"))
                .append("edad", 32)
                .append("posicion", "Defensa central")
                .append("equipos", Arrays.asList("Stuttgart", "Roma", "Chelsea", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "David Alaba")
                .append("nacionalidad", Arrays.asList("Austria"))
                .append("edad", 32)
                .append("posicion", "Defensa central")
                .append("equipos", Arrays.asList("Austria Wien", "Bayern Múnich", "Hoffenheim", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Jesús Vallejo")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 28)
                .append("posicion", "Defensa central")
                .append("equipos", Arrays.asList("Real Zaragoza", "Eintracht Frankfurt", "Wolverhampton", "Granada", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Ferland Mendy")
                .append("nacionalidad", Arrays.asList("Francia"))
                .append("edad", 29)
                .append("posicion", "Lateral izquierdo")
                .append("equipos", Arrays.asList("Le Havre", "Olympique Lyonnais", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Fran García")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 25)
                .append("posicion", "Lateral izquierdo")
                .append("equipos", Arrays.asList("Real Madrid Castilla", "Rayo Vallecano", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Daniel Carvajal")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 33)
                .append("posicion", "Lateral derecho")
                .append("equipos", Arrays.asList("Real Madrid Castilla", "Bayer Leverkusen", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Lucas Vázquez")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 33)
                .append("posicion", "Lateral derecho")
                .append("equipos", Arrays.asList("Real Madrid Castilla", "Espanyol", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Luka Modrić")
                .append("nacionalidad", Arrays.asList("Croacia"))
                .append("edad", 39)
                .append("posicion", "Centrocampista")
                .append("equipos", Arrays.asList("Dinamo Zagreb", "Tottenham Hotspur", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Aurélien Tchouaméni")
                .append("nacionalidad", Arrays.asList("Francia"))
                .append("edad", 25)
                .append("posicion", "Centrocampista")
                .append("equipos", Arrays.asList("Girondins de Bordeaux", "AS Mónaco", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Eduardo Camavinga")
                .append("nacionalidad", Arrays.asList("Francia"))
                .append("edad", 22)
                .append("posicion", "Centrocampista")
                .append("equipos", Arrays.asList("Stade Rennais", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Federico Valverde")
                .append("nacionalidad", Arrays.asList("Uruguay"))
                .append("edad", 26)
                .append("posicion", "Centrocampista")
                .append("equipos", Arrays.asList("Peñarol", "Real Madrid Castilla", "Deportivo La Coruña", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Jude Bellingham")
                .append("nacionalidad", Arrays.asList("Inglaterra"))
                .append("edad", 21)
                .append("posicion", "Centrocampista")
                .append("equipos", Arrays.asList("Birmingham City", "Borussia Dortmund", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Arda Güler")
                .append("nacionalidad", Arrays.asList("Turquía"))
                .append("edad", 19)
                .append("posicion", "Centrocampista")
                .append("equipos", Arrays.asList("Fenerbahçe", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Dani Ceballos")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 28)
                .append("posicion", "Centrocampista")
                .append("equipos", Arrays.asList("Real Betis", "Arsenal", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Vinícius Júnior")
                .append("nacionalidad", Arrays.asList("Brasil"))
                .append("edad", 24)
                .append("posicion", "Delantero")
                .append("equipos", Arrays.asList("Flamengo", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Kylian Mbappé")
                .append("nacionalidad", Arrays.asList("Francia"))
                .append("edad", 26)
                .append("posicion", "Delantero")
                .append("equipos", Arrays.asList("AS Mónaco", "Paris Saint-Germain", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Rodrygo")
                .append("nacionalidad", Arrays.asList("Brasil"))
                .append("edad", 24)
                .append("posicion", "Delantero")
                .append("equipos", Arrays.asList("Santos", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Endrick")
                .append("nacionalidad", Arrays.asList("Brasil"))
                .append("edad", 18)
                .append("posicion", "Delantero")
                .append("equipos", Arrays.asList("Palmeiras", "Real Madrid")));

            jugadoresMadrid.add(new Document("nombre", "Brahim Díaz")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 25)
                .append("posicion", "Delantero")
                .append("equipos", Arrays.asList("Manchester City", "AC Milan", "Real Madrid")));


        collection.insertMany(jugadoresMadrid);        
	}
	
	public static void InsertarJugadoresBarcelona(MongoCollection<Document> collection) {
        List<Document> jugadoresBarcelona = new ArrayList<>();

        jugadoresBarcelona.add(new Document("nombre", "Marc-André ter Stegen")
                .append("nacionalidad", Arrays.asList("Alemania"))
                .append("edad", 33)
                .append("posicion", "Portero")
                .append("equipos", Arrays.asList("Borussia Mönchengladbach", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Iñaki Peña")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 26)
                .append("posicion", "Portero")
                .append("equipos", Arrays.asList("FC Barcelona B", "Galatasaray", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Wojciech Szczesny")
                .append("nacionalidad", Arrays.asList("Polonia"))
                .append("edad", 35)
                .append("posicion", "Portero")
                .append("equipos", Arrays.asList("Legia Varsovia", "Arsenal", "Roma", "Juventus", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Pau Cubarsí")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 18)
                .append("posicion", "Defensa central")
                .append("equipos", Arrays.asList("FC Barcelona B", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Ronald Araujo")
                .append("nacionalidad", Arrays.asList("Uruguay"))
                .append("edad", 26)
                .append("posicion", "Defensa central")
                .append("equipos", Arrays.asList("Boston River", "FC Barcelona B", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Andreas Christensen")
                .append("nacionalidad", Arrays.asList("Dinamarca"))
                .append("edad", 29)
                .append("posicion", "Defensa central")
                .append("equipos", Arrays.asList("Chelsea", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Eric García")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 24)
                .append("posicion", "Defensa central")
                .append("equipos", Arrays.asList("Manchester City", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Iñigo Martínez")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 34)
                .append("posicion", "Defensa central")
                .append("equipos", Arrays.asList("Real Sociedad", "Athletic Club", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Alejandro Balde")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 21)
                .append("posicion", "Lateral izquierdo")
                .append("equipos", Arrays.asList("FC Barcelona B", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Gerard Martín")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 23)
                .append("posicion", "Lateral izquierdo")
                .append("equipos", Arrays.asList("FC Barcelona B", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Jules Koundé")
                .append("nacionalidad", Arrays.asList("Francia"))
                .append("edad", 26)
                .append("posicion", "Lateral derecho")
                .append("equipos", Arrays.asList("Sevilla FC", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Héctor Fort")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 18)
                .append("posicion", "Lateral derecho")
                .append("equipos", Arrays.asList("FC Barcelona B", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Marc Casadó")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 21)
                .append("posicion", "Pivote")
                .append("equipos", Arrays.asList("FC Barcelona B", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Marc Bernal")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 17)
                .append("posicion", "Pivote")
                .append("equipos", Arrays.asList("FC Barcelona B", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Pedri")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 22)
                .append("posicion", "Mediocentro")
                .append("equipos", Arrays.asList("UD Las Palmas", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Gavi")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 20)
                .append("posicion", "Mediocentro")
                .append("equipos", Arrays.asList("FC Barcelona B", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Frenkie de Jong")
                .append("nacionalidad", Arrays.asList("Países Bajos"))
                .append("edad", 28)
                .append("posicion", "Mediocentro")
                .append("equipos", Arrays.asList("Ajax", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Dani Olmo")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 27)
                .append("posicion", "Mediocentro ofensivo")
                .append("equipos", Arrays.asList("Dinamo Zagreb", "RB Leipzig", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Fermín López")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 22)
                .append("posicion", "Mediocentro ofensivo")
                .append("equipos", Arrays.asList("FC Barcelona B", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Pablo Torre")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 22)
                .append("posicion", "Mediocentro ofensivo")
                .append("equipos", Arrays.asList("Racing Santander", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Raphinha")
                .append("nacionalidad", Arrays.asList("Brasil"))
                .append("edad", 28)
                .append("posicion", "Extremo izquierdo")
                .append("equipos", Arrays.asList("Leeds United", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Ansu Fati")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 22)
                .append("posicion", "Extremo izquierdo")
                .append("equipos", Arrays.asList("FC Barcelona B", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Lamine Yamal")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 17)
                .append("posicion", "Extremo derecho")
                .append("equipos", Arrays.asList("FC Barcelona B", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Ferran Torres")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 25)
                .append("posicion", "Extremo derecho")
                .append("equipos", Arrays.asList("Valencia CF", "Manchester City", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Robert Lewandowski")
                .append("nacionalidad", Arrays.asList("Polonia"))
                .append("edad", 36)
                .append("posicion", "Delantero centro")
                .append("equipos", Arrays.asList("Lech Poznań", "Borussia Dortmund", "Bayern Múnich", "FC Barcelona")));

            jugadoresBarcelona.add(new Document("nombre", "Pau Víctor")
                .append("nacionalidad", Arrays.asList("España"))
                .append("edad", 23)
                .append("posicion", "Delantero centro")
                .append("equipos", Arrays.asList("FC Barcelona B", "FC Barcelona")));
            
        collection.insertMany(jugadoresBarcelona);

	}

	public static void InsertarJugadoresAtleticoMadrid(MongoCollection<Document> collection) {
        List<Document> jugadoresAtleticoMadrid = new ArrayList<>();

		
        jugadoresAtleticoMadrid.add(new Document("nombre", "Jan Oblak")
        	    .append("nacionalidad", Arrays.asList("Eslovenia"))
        	    .append("edad", 32)
        	    .append("posicion", "Portero")
        	    .append("equipos", Arrays.asList("Olimpija Ljubljana", "Benfica", "Rio Ave", "Uniao Leiria", "Olhanense", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Juan Musso")
        	    .append("nacionalidad", Arrays.asList("Argentina"))
        	    .append("edad", 31)
        	    .append("posicion", "Portero")
        	    .append("equipos", Arrays.asList("Racing Club", "Udinese", "Atalanta", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Robin Le Normand")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 28)
        	    .append("posicion", "Defensa central")
        	    .append("equipos", Arrays.asList("Stade Brestois", "Real Sociedad", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "José María Giménez")
        	    .append("nacionalidad", Arrays.asList("Uruguay"))
        	    .append("edad", 30)
        	    .append("posicion", "Defensa central")
        	    .append("equipos", Arrays.asList("Danubio", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Clément Lenglet")
        	    .append("nacionalidad", Arrays.asList("Francia"))
        	    .append("edad", 29)
        	    .append("posicion", "Defensa central")
        	    .append("equipos", Arrays.asList("Nancy", "Sevilla", "Barcelona", "Tottenham", "Aston Villa", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Axel Witsel")
        	    .append("nacionalidad", Arrays.asList("Bélgica"))
        	    .append("edad", 36)
        	    .append("posicion", "Defensa central")
        	    .append("equipos", Arrays.asList("Standard Liège", "Benfica", "Zenit", "Tianjin Quanjian", "Borussia Dortmund", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "César Azpilicueta")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 35)
        	    .append("posicion", "Defensa central")
        	    .append("equipos", Arrays.asList("Osasuna", "Marsella", "Chelsea", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Reinildo Mandava")
        	    .append("nacionalidad", Arrays.asList("Mozambique"))
        	    .append("edad", 31)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipos", Arrays.asList("Benfica B", "Fafe", "Sporting Covilhã", "Belenenses", "Lille", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Javi Galán")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 30)
        	    .append("posicion", "Lateral izquierdo")
        	    .append("equipos", Arrays.asList("Córdoba", "Huesca", "Celta", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Nahuel Molina")
        	    .append("nacionalidad", Arrays.asList("Argentina"))
        	    .append("edad", 27)
        	    .append("posicion", "Lateral derecho")
        	    .append("equipos", Arrays.asList("Boca Juniors", "Defensa y Justicia", "Rosario Central", "Udinese", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Pablo Barrios")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 21)
        	    .append("posicion", "Mediocentro")
        	    .append("equipos", Arrays.asList("Real Madrid Juvenil", "Atlético de Madrid B", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Conor Gallagher")
        	    .append("nacionalidad", Arrays.asList("Inglaterra"))
        	    .append("edad", 25)
        	    .append("posicion", "Mediocentro")
        	    .append("equipos", Arrays.asList("Chelsea", "Charlton", "Swansea", "West Brom", "Crystal Palace", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Rodrigo De Paul")
        	    .append("nacionalidad", Arrays.asList("Argentina"))
        	    .append("edad", 30)
        	    .append("posicion", "Mediocentro")
        	    .append("equipos", Arrays.asList("Racing Club", "Valencia", "Udinese", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Koke")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 33)
        	    .append("posicion", "Mediocentro")
        	    .append("equipos", Arrays.asList("Atlético de Madrid B", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Marcos Llorente")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 30)
        	    .append("posicion", "Interior derecho")
        	    .append("equipos", Arrays.asList("Real Madrid", "Alavés", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Thomas Lemar")
        	    .append("nacionalidad", Arrays.asList("Francia"))
        	    .append("edad", 29)
        	    .append("posicion", "Mediocentro ofensivo")
        	    .append("equipos", Arrays.asList("Caen", "Monaco", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Samuel Lino")
        	    .append("nacionalidad", Arrays.asList("Brasil"))
        	    .append("edad", 25)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipos", Arrays.asList("Flamengo", "Gil Vicente", "Valencia", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Rodrigo Riquelme")
        	    .append("nacionalidad", Arrays.asList("España"))
        	    .append("edad", 25)
        	    .append("posicion", "Extremo izquierdo")
        	    .append("equipos", Arrays.asList("Bournemouth", "Mirandés", "Girona", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Giuliano Simeone")
        	    .append("nacionalidad", Arrays.asList("Argentina"))
        	    .append("edad", 22)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipos", Arrays.asList("Zaragoza", "Alavés", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Ángel Correa")
        	    .append("nacionalidad", Arrays.asList("Argentina"))
        	    .append("edad", 30)
        	    .append("posicion", "Extremo derecho")
        	    .append("equipos", Arrays.asList("San Lorenzo", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Julián Álvarez")
        	    .append("nacionalidad", Arrays.asList("Argentina"))
        	    .append("edad", 25)
        	    .append("posicion", "Delantero centro")
        	    .append("equipos", Arrays.asList("River Plate", "Manchester City", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Alexander Sørloth")
        	    .append("nacionalidad", Arrays.asList("Noruega"))
        	    .append("edad", 29)
        	    .append("posicion", "Delantero centro")
        	    .append("equipos", Arrays.asList("Rosenborg", "Groningen", "Midtjylland", "Crystal Palace", "Gent", "Trabzonspor", "RB Leipzig", "Real Sociedad", "Atlético de Madrid")));

        	jugadoresAtleticoMadrid.add(new Document("nombre", "Antoine Griezmann")
        	    .append("nacionalidad", Arrays.asList("Francia"))
        	    .append("edad", 34)
        	    .append("posicion", "Delantero centro")
        	    .append("equipos", Arrays.asList("Real Sociedad", "Atlético de Madrid", "Barcelona", "Atlético de Madrid")));

	}
	
	
	public static void InsertarJugadoresRealSociedad(MongoCollection<Document> collection) {
        List<Document> jugadoresRealSociedad = new ArrayList<>();


        jugadoresRealSociedad.add(new Document("nombre", "Álex Remiro")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 30)
            .append("posicion", "Portero")
            .append("equipos", Arrays.asList("Athletic Club", "Levante", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Unai Marrero")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 23)
            .append("posicion", "Portero")
            .append("equipos", Arrays.asList("Real Sociedad B", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Nayef Aguerd")
            .append("nacionalidad", Arrays.asList("Marruecos"))
            .append("edad", 29)
            .append("posicion", "Defensa central")
            .append("equipos", Arrays.asList("FUS Rabat", "Dijon", "Rennes", "West Ham", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Igor Zubeldia")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 28)
            .append("posicion", "Defensa central")
            .append("equipos", Arrays.asList("Real Sociedad B", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Jon Pacheco")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 24)
            .append("posicion", "Defensa central")
            .append("equipos", Arrays.asList("Real Sociedad B", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Aritz Elustondo")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 31)
            .append("posicion", "Defensa central")
            .append("equipos", Arrays.asList("Real Sociedad B", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Jon Martín")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 19)
            .append("posicion", "Defensa central")
            .append("equipos", Arrays.asList("Real Sociedad B", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Javi López")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 23)
            .append("posicion", "Lateral izquierdo")
            .append("equipos", Arrays.asList("Real Sociedad B", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Aihen Muñoz")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 27)
            .append("posicion", "Lateral izquierdo")
            .append("equipos", Arrays.asList("Real Sociedad B", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Jon Aramburu")
            .append("nacionalidad", Arrays.asList("Venezuela"))
            .append("edad", 22)
            .append("posicion", "Lateral derecho")
            .append("equipos", Arrays.asList("Real Sociedad B", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Hamari Traoré")
            .append("nacionalidad", Arrays.asList("Malí"))
            .append("edad", 33)
            .append("posicion", "Lateral derecho")
            .append("equipos", Arrays.asList("Paris FC", "Lierse", "Reims", "Rennes", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Álvaro Odriozola")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 29)
            .append("posicion", "Lateral derecho")
            .append("equipos", Arrays.asList("Real Sociedad", "Real Madrid", "Bayern Múnich", "Fiorentina", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Martín Zubimendi")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 26)
            .append("posicion", "Pivote")
            .append("equipos", Arrays.asList("Real Sociedad B", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Luka Sucic")
            .append("nacionalidad", Arrays.asList("Croacia"))
            .append("edad", 22)
            .append("posicion", "Mediocentro")
            .append("equipos", Arrays.asList("Liefering", "Red Bull Salzburg", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Beñat Turrientes")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 23)
            .append("posicion", "Mediocentro")
            .append("equipos", Arrays.asList("Real Sociedad B", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Jon Ander Olasagasti")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 24)
            .append("posicion", "Mediocentro")
            .append("equipos", Arrays.asList("Real Sociedad B", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Brais Méndez")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 28)
            .append("posicion", "Mediocentro ofensivo")
            .append("equipos", Arrays.asList("Celta de Vigo", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Arsen Zakharyan")
            .append("nacionalidad", Arrays.asList("Rusia"))
            .append("edad", 21)
            .append("posicion", "Mediocentro ofensivo")
            .append("equipos", Arrays.asList("Dynamo Moscú", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Pablo Marín")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 21)
            .append("posicion", "Mediocentro ofensivo")
            .append("equipos", Arrays.asList("Real Sociedad B", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Ander Barrenetxea")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 23)
            .append("posicion", "Extremo izquierdo")
            .append("equipos", Arrays.asList("Real Sociedad B", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Sheraldo Becker")
            .append("nacionalidad", Arrays.asList("Surinam"))
            .append("edad", 30)
            .append("posicion", "Extremo izquierdo")
            .append("equipos", Arrays.asList("ADO Den Haag", "PEC Zwolle", "Union Berlin", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Arkaitz Mariezkurrena")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 20)
            .append("posicion", "Extremo izquierdo")
            .append("equipos", Arrays.asList("Real Sociedad B", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Takefusa Kubo")
            .append("nacionalidad", Arrays.asList("Japón"))
            .append("edad", 23)
            .append("posicion", "Extremo derecho")
            .append("equipos", Arrays.asList("FC Tokyo", "Yokohama F. Marinos", "Mallorca", "Villarreal", "Getafe", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Sergio Gómez")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 24)
            .append("posicion", "Extremo derecho")
            .append("equipos", Arrays.asList("Borussia Dortmund", "Huesca", "Anderlecht", "Manchester City", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Mikel Oyarzabal")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 28)
            .append("posicion", "Delantero centro")
            .append("equipos", Arrays.asList("Real Sociedad B", "Real Sociedad")));

        jugadoresRealSociedad.add(new Document("nombre", "Orri Óskarsson")
            .append("nacionalidad", Arrays.asList("Islandia"))
            .append("edad", 20)
            .append("posicion", "Delantero centro")
            .append("equipos", Arrays.asList("Copenhagen", "Real Sociedad B", "Real Sociedad")));

        collection.insertMany(jugadoresRealSociedad);

	}
	
	public static void InsertarJugadoresAtleticoBilbao(MongoCollection<Document> collection) {
        List<Document> jugadoresAtleticoBilbao = new ArrayList<>();
	
        List<Document> jugadoresAthleticClub = new ArrayList<>();

        jugadoresAthleticClub.add(new Document("nombre", "Unai Simón")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 27)
            .append("posicion", "Portero")
            .append("equipos", Arrays.asList("Athletic Club B", "Athletic Club")));

        jugadoresAthleticClub.add(new Document("nombre", "Julen Agirrezabala")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 23)
            .append("posicion", "Portero")
            .append("equipos", Arrays.asList("Athletic Club B", "Athletic Club")));

        jugadoresAthleticClub.add(new Document("nombre", "Aitor Paredes")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 24)
            .append("posicion", "Defensa central")
            .append("equipos", Arrays.asList("Athletic Club B", "Athletic Club")));

        jugadoresAthleticClub.add(new Document("nombre", "Yeray Álvarez")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 29)
            .append("posicion", "Defensa central")
            .append("equipos", Arrays.asList("Athletic Club B", "Athletic Club")));

        jugadoresAthleticClub.add(new Document("nombre", "Dani Vivian")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 25)
            .append("posicion", "Defensa central")
            .append("equipos", Arrays.asList("Athletic Club B", "Mirandés", "Athletic Club")));

        jugadoresAthleticClub.add(new Document("nombre", "Íñigo Lekue")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 31)
            .append("posicion", "Lateral derecho")
            .append("equipos", Arrays.asList("Athletic Club B", "Athletic Club")));

        jugadoresAthleticClub.add(new Document("nombre", "Óscar de Marcos")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 35)
            .append("posicion", "Lateral derecho")
            .append("equipos", Arrays.asList("Alavés", "Athletic Club")));

        jugadoresAthleticClub.add(new Document("nombre", "Yuri Berchiche")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 34)
            .append("posicion", "Lateral izquierdo")
            .append("equipos", Arrays.asList("Real Sociedad", "PSG", "Athletic Club")));

        jugadoresAthleticClub.add(new Document("nombre", "Iñigo Ruiz de Galarreta")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 30)
            .append("posicion", "Mediocentro")
            .append("equipos", Arrays.asList("Athletic Club B", "Mallorca", "Las Palmas", "Eibar", "Athletic Club")));

        jugadoresAthleticClub.add(new Document("nombre", "Oihan Sancet")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 24)
            .append("posicion", "Mediocentro ofensivo")
            .append("equipos", Arrays.asList("Athletic Club B", "Athletic Club")));

        jugadoresAthleticClub.add(new Document("nombre", "Unai Gómez")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 21)
            .append("posicion", "Mediocentro")
            .append("equipos", Arrays.asList("Athletic Club B", "Athletic Club")));

        jugadoresAthleticClub.add(new Document("nombre", "Iker Muniain")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 32)
            .append("posicion", "Extremo izquierdo")
            .append("equipos", Arrays.asList("Athletic Club")));

        jugadoresAthleticClub.add(new Document("nombre", "Nico Williams")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 22)
            .append("posicion", "Extremo derecho")
            .append("equipos", Arrays.asList("Athletic Club B", "Athletic Club")));

        jugadoresAthleticClub.add(new Document("nombre", "Álex Berenguer")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 29)
            .append("posicion", "Extremo izquierdo")
            .append("equipos", Arrays.asList("Osasuna", "Torino", "Athletic Club")));

        jugadoresAthleticClub.add(new Document("nombre", "Iñaki Williams")
            .append("nacionalidad", Arrays.asList("Ghana"))
            .append("edad", 30)
            .append("posicion", "Delantero centro")
            .append("equipos", Arrays.asList("Athletic Club B", "Athletic Club")));

        jugadoresAthleticClub.add(new Document("nombre", "Gorka Guruzeta")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 28)
            .append("posicion", "Delantero centro")
            .append("equipos", Arrays.asList("Athletic Club B", "Sabadel", "Amorebieta", "Athletic Club")));

        collection.insertMany(jugadoresAtleticoBilbao);
	}
	
	public static void InsertarJugadoresVillarreal(MongoCollection<Document> collection) {
        List<Document> jugadoresVillarreal = new ArrayList<>();
	

        jugadoresVillarreal.add(new Document("nombre", "Filip Jörgensen")
            .append("nacionalidad", Arrays.asList("Suecia"))
            .append("edad", 22)
            .append("posicion", "Portero")
            .append("equipos", Arrays.asList("Villarreal B", "Villarreal")));

        jugadoresVillarreal.add(new Document("nombre", "Pepe Reina")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 41)
            .append("posicion", "Portero")
            .append("equipos", Arrays.asList("Barcelona", "Villarreal", "Liverpool", "Napoli", "Bayern", "Milan", "Aston Villa", "Lazio", "Villarreal")));

        jugadoresVillarreal.add(new Document("nombre", "Raúl Albiol")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 38)
            .append("posicion", "Defensa central")
            .append("equipos", Arrays.asList("Valencia", "Getafe", "Real Madrid", "Napoli", "Villarreal")));

        jugadoresVillarreal.add(new Document("nombre", "Pau Torres")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 27)
            .append("posicion", "Defensa central")
            .append("equipos", Arrays.asList("Villarreal", "Málaga", "Aston Villa")));

        jugadoresVillarreal.add(new Document("nombre", "Yerson Mosquera")
            .append("nacionalidad", Arrays.asList("Colombia"))
            .append("edad", 23)
            .append("posicion", "Defensa central")
            .append("equipos", Arrays.asList("Atlético Nacional", "Wolverhampton", "Cincinnati", "Villarreal")));

        jugadoresVillarreal.add(new Document("nombre", "Juan Foyth")
            .append("nacionalidad", Arrays.asList("Argentina"))
            .append("edad", 26)
            .append("posicion", "Lateral derecho")
            .append("equipos", Arrays.asList("Estudiantes", "Tottenham", "Villarreal")));

        jugadoresVillarreal.add(new Document("nombre", "Alberto Moreno")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 31)
            .append("posicion", "Lateral izquierdo")
            .append("equipos", Arrays.asList("Sevilla", "Liverpool", "Villarreal")));

        jugadoresVillarreal.add(new Document("nombre", "Álex Baena")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 23)
            .append("posicion", "Mediocentro ofensivo")
            .append("equipos", Arrays.asList("Villarreal", "Girona", "Villarreal")));

        jugadoresVillarreal.add(new Document("nombre", "Etienne Capoue")
            .append("nacionalidad", Arrays.asList("Francia"))
            .append("edad", 35)
            .append("posicion", "Mediocentro defensivo")
            .append("equipos", Arrays.asList("Toulouse", "Tottenham", "Watford", "Villarreal")));

        jugadoresVillarreal.add(new Document("nombre", "Francis Coquelin")
            .append("nacionalidad", Arrays.asList("Francia"))
            .append("edad", 33)
            .append("posicion", "Mediocentro defensivo")
            .append("equipos", Arrays.asList("Arsenal", "Freiburg", "Charlton", "Valencia", "Villarreal")));

        jugadoresVillarreal.add(new Document("nombre", "Santi Comesaña")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 28)
            .append("posicion", "Mediocentro")
            .append("equipos", Arrays.asList("Coruxo", "Rayo Vallecano", "Villarreal")));

        jugadoresVillarreal.add(new Document("nombre", "Dani Parejo")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 35)
            .append("posicion", "Mediocentro")
            .append("equipos", Arrays.asList("Real Madrid", "Getafe", "Valencia", "Villarreal")));

        jugadoresVillarreal.add(new Document("nombre", "Yeremy Pino")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 21)
            .append("posicion", "Extremo derecho")
            .append("equipos", Arrays.asList("Villarreal")));

        jugadoresVillarreal.add(new Document("nombre", "Gerard Moreno")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 32)
            .append("posicion", "Delantero centro")
            .append("equipos", Arrays.asList("Villarreal B", "Mallorca", "Espanyol", "Villarreal")));

        jugadoresVillarreal.add(new Document("nombre", "Alexander Sørloth")
            .append("nacionalidad", Arrays.asList("Noruega"))
            .append("edad", 29)
            .append("posicion", "Delantero centro")
            .append("equipos", Arrays.asList("Rosenborg", "Groningen", "Midtjylland", "Crystal Palace", "Gent", "Trabzonspor", "RB Leipzig", "Real Sociedad", "Villarreal")));

        collection.insertMany(jugadoresVillarreal);

	}
	
	public static void InsertarJugadoresValencia(MongoCollection<Document> collection) {
        List<Document> jugadoresValencia = new ArrayList<>();
        
        jugadoresValencia.add(new Document("nombre", "Stole Dimitrievski")
            .append("nacionalidad", Arrays.asList("Macedonia del Norte"))
            .append("edad", 31)
            .append("posicion", "Portero")
            .append("equipos", Arrays.asList("Rabotnički", "Granada", "Gimnàstic", "Rayo Vallecano", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Cristian Rivero")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 27)
            .append("posicion", "Portero")
            .append("equipos", Arrays.asList("Valencia B", "Albacete", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "José Gayà")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 30)
            .append("posicion", "Lateral izquierdo")
            .append("equipos", Arrays.asList("Valencia B", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Jesús Vázquez")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 22)
            .append("posicion", "Lateral izquierdo")
            .append("equipos", Arrays.asList("Valencia B", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Thierry Correia")
            .append("nacionalidad", Arrays.asList("Portugal"))
            .append("edad", 26)
            .append("posicion", "Lateral derecho")
            .append("equipos", Arrays.asList("Sporting CP", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Dimitri Foulquier")
            .append("nacionalidad", Arrays.asList("Francia"))
            .append("edad", 32)
            .append("posicion", "Lateral derecho")
            .append("equipos", Arrays.asList("Rennes", "Granada", "Watford", "Getafe", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Cristhian Mosquera")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 21)
            .append("posicion", "Defensa central")
            .append("equipos", Arrays.asList("Valencia B", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "César Tárrega")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 23)
            .append("posicion", "Defensa central")
            .append("equipos", Arrays.asList("Valencia B", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Mouctar Diakhaby")
            .append("nacionalidad", Arrays.asList("Guinea"))
            .append("edad", 28)
            .append("posicion", "Defensa central")
            .append("equipos", Arrays.asList("Lyon", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Rubén Iranzo")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 22)
            .append("posicion", "Defensa central")
            .append("equipos", Arrays.asList("Valencia B", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Hugo Guillamón")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 25)
            .append("posicion", "Mediocentro defensivo")
            .append("equipos", Arrays.asList("Valencia B", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Javi Guerra")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 22)
            .append("posicion", "Mediocentro")
            .append("equipos", Arrays.asList("Valencia B", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Pepelu")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 26)
            .append("posicion", "Mediocentro")
            .append("equipos", Arrays.asList("Levante", "Tondela", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "André Almeida")
            .append("nacionalidad", Arrays.asList("Portugal"))
            .append("edad", 25)
            .append("posicion", "Mediocentro ofensivo")
            .append("equipos", Arrays.asList("Vitória Guimarães", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Fran Pérez")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 23)
            .append("posicion", "Extremo derecho")
            .append("equipos", Arrays.asList("Valencia B", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Diego López")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 23)
            .append("posicion", "Extremo izquierdo")
            .append("equipos", Arrays.asList("Valencia B", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Sergi Canós")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 28)
            .append("posicion", "Extremo derecho")
            .append("equipos", Arrays.asList("Liverpool", "Brentford", "Norwich", "Olympiacos", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Iván Jaime")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 25)
            .append("posicion", "Mediocentro ofensivo")
            .append("equipos", Arrays.asList("Málaga", "Famalicão", "Porto", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Luis Rioja")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 31)
            .append("posicion", "Extremo izquierdo")
            .append("equipos", Arrays.asList("Celta B", "Almería", "Alavés", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Hugo Duro")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 25)
            .append("posicion", "Delantero centro")
            .append("equipos", Arrays.asList("Getafe", "Real Madrid Castilla", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Rafa Mir")
            .append("nacionalidad", Arrays.asList("España"))
            .append("edad", 28)
            .append("posicion", "Delantero centro")
            .append("equipos", Arrays.asList("Valencia B", "Wolverhampton", "Las Palmas", "Nottingham Forest", "Huesca", "Sevilla", "Valencia")));

        jugadoresValencia.add(new Document("nombre", "Umar Sadiq")
            .append("nacionalidad", Arrays.asList("Nigeria"))
            .append("edad", 28)
            .append("posicion", "Delantero centro")
            .append("equipos", Arrays.asList("Roma", "Partizan", "Almería", "Real Sociedad", "Valencia")));

        collection.insertMany(jugadoresValencia);

	}
	
	public static void InsertarJugadoresGirona(MongoCollection<Document> collection) {
	    List<Document> jugadoresGirona = new ArrayList<>();

	    jugadoresGirona.add(new Document("nombre", "Paulo Gazzaniga")
	            .append("nacionalidad", Arrays.asList("Argentina", "Italia"))
	            .append("edad", 33)
	            .append("posicion", "Portero")
	            .append("equipos", Arrays.asList("Tottenham Hotspur", "Swansea City", "Southampton", "Elche", "Sin equipo")));

	    jugadoresGirona.add(new Document("nombre", "Vladyslav Krapyvtsov")
	            .append("nacionalidad", Arrays.asList("Ucrania"))
	            .append("edad", 19)
	            .append("posicion", "Portero")
	            .append("equipos", Arrays.asList("Zorya Luhansk", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Juan Carlos")
	            .append("nacionalidad", Arrays.asList("España"))
	            .append("edad", 37)
	            .append("posicion", "Portero")
	            .append("equipos", Arrays.asList("UD Logroñés", "Córdoba CF", "AC Sparta Praga", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Ladislav Krejci")
	            .append("nacionalidad", Arrays.asList("República Checa"))
	            .append("edad", 26)
	            .append("posicion", "Defensa central")
	            .append("equipos", Arrays.asList("AC Sparta Praga", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "David López")
	            .append("nacionalidad", Arrays.asList("España"))
	            .append("edad", 35)
	            .append("posicion", "Defensa central")
	            .append("equipos", Arrays.asList("Espanyol", "Levante", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Daley Blind")
	            .append("nacionalidad", Arrays.asList("Países Bajos"))
	            .append("edad", 35)
	            .append("posicion", "Defensa central")
	            .append("equipos", Arrays.asList("Ajax", "Manchester United", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Juanpe")
	            .append("nacionalidad", Arrays.asList("España"))
	            .append("edad", 34)
	            .append("posicion", "Defensa central")
	            .append("equipos", Arrays.asList("Real Sociedad", "Granada", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Miguel Gutiérrez")
	            .append("nacionalidad", Arrays.asList("España"))
	            .append("edad", 23)
	            .append("posicion", "Lateral izquierdo")
	            .append("equipos", Arrays.asList("Real Madrid Castilla", "Real Madrid", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Arnau Martínez")
	            .append("nacionalidad", Arrays.asList("España"))
	            .append("edad", 22)
	            .append("posicion", "Lateral derecho")
	            .append("equipos", Arrays.asList("Espanyol", "Real Zaragoza", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Alejandro Francés")
	            .append("nacionalidad", Arrays.asList("España"))
	            .append("edad", 22)
	            .append("posicion", "Lateral derecho")
	            .append("equipos", Arrays.asList("Real Zaragoza", "Juventus de Turín", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Arthur Melo")
	            .append("nacionalidad", Arrays.asList("Brasil"))
	            .append("edad", 28)
	            .append("posicion", "Pivote")
	            .append("equipos", Arrays.asList("Cruzeiro", "Roma", "Juventus", "Lyon", "FC Barcelona", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Oriol Romeu")
	            .append("nacionalidad", Arrays.asList("España"))
	            .append("edad", 33)
	            .append("posicion", "Pivote")
	            .append("equipos", Arrays.asList("Barcelona", "Chelsea", "Southampton", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Yangel Herrera")
	            .append("nacionalidad", Arrays.asList("Venezuela", "España"))
	            .append("edad", 27)
	            .append("posicion", "Mediocentro")
	            .append("equipos", Arrays.asList("Granada", "New York City FC", "Manchester City", "Manchester United", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Donny van de Beek")
	            .append("nacionalidad", Arrays.asList("Países Bajos"))
	            .append("edad", 28)
	            .append("posicion", "Mediocentro")
	            .append("equipos", Arrays.asList("Ajax", "Manchester United", "Everton", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Jhon Solís")
	            .append("nacionalidad", Arrays.asList("Colombia"))
	            .append("edad", 20)
	            .append("posicion", "Mediocentro")
	            .append("equipos", Arrays.asList("Once Caldas", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Iván Martín")
	            .append("nacionalidad", Arrays.asList("España"))
	            .append("edad", 26)
	            .append("posicion", "Mediocentro ofensivo")
	            .append("equipos", Arrays.asList("Sporting Gijón", "Ajax Amsterdam U21", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Gabriel Misehouy")
	            .append("nacionalidad", Arrays.asList("Países Bajos", "Ghana"))
	            .append("edad", 19)
	            .append("posicion", "Mediocentro ofensivo")
	            .append("equipos", Arrays.asList("Sochaux", "Tottenham Hotspur", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Bryan Gil")
	            .append("nacionalidad", Arrays.asList("España"))
	            .append("edad", 24)
	            .append("posicion", "Extremo izquierdo")
	            .append("equipos", Arrays.asList("Sevilla", "Tottenham Hotspur", "Villarreal CF", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Arnaut Danjuma")
	            .append("nacionalidad", Arrays.asList("Países Bajos", "Nigeria"))
	            .append("edad", 28)
	            .append("posicion", "Extremo izquierdo")
	            .append("equipos", Arrays.asList("Club Brugge", "Bournemouth", "Villarreal", "Everton", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Min-su Kim")
	            .append("nacionalidad", Arrays.asList("Corea del Sur"))
	            .append("edad", 19)
	            .append("posicion", "Extremo izquierdo")
	            .append("equipos", Arrays.asList("Jeonbuk Hyundai Motors", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Viktor Tsygankov")
	            .append("nacionalidad", Arrays.asList("Ucrania"))
	            .append("edad", 27)
	            .append("posicion", "Extremo derecho")
	            .append("equipos", Arrays.asList("Dynamo Kyiv", "Watford FC", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Yáser Asprilla")
	            .append("nacionalidad", Arrays.asList("Colombia"))
	            .append("edad", 21)
	            .append("posicion", "Extremo derecho")
	            .append("equipos", Arrays.asList("Atlético Nacional", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Portu")
	            .append("nacionalidad", Arrays.asList("España"))
	            .append("edad", 33)
	            .append("posicion", "Extremo derecho")
	            .append("equipos", Arrays.asList("Girona", "SC Braga", "Eibar")));

	    jugadoresGirona.add(new Document("nombre", "Abel Ruiz")
	            .append("nacionalidad", Arrays.asList("España"))
	            .append("edad", 25)
	            .append("posicion", "Delantero centro")
	            .append("equipos", Arrays.asList("Barcelona", "Valencia", "Aberdeen FC", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Bojan Miovski")
	            .append("nacionalidad", Arrays.asList("Macedonia del Norte"))
	            .append("edad", 25)
	            .append("posicion", "Delantero centro")
	            .append("equipos", Arrays.asList("MŠK Žilina", "FC ViOn Zlaté Moravce", "Girona")));

	    jugadoresGirona.add(new Document("nombre", "Cristhian Stuani")
	            .append("nacionalidad", Arrays.asList("Uruguay", "Italia"))
	            .append("edad", 38)
	            .append("posicion", "Delantero centro")
	            .append("equipos", Arrays.asList("Girona", "Middlesbrough", "Espanyol")));


	    collection.insertMany(jugadoresGirona);
	}

	
	public static void InsertarJugadoresSevilla(MongoCollection<Document> collection) {
	    List<Document> jugadoresSevilla = new ArrayList<>();

	    jugadoresSevilla.add(new Document("nombre", "Álvaro Fernández")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 27)
	        .append("posicion", "Portero")
	        .append("equipos", Arrays.asList("AS Mónaco", "SD Huesca", "Brentford", "Espanyol", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Ørjan Nyland")
	        .append("nacionalidad", List.of("Noruega"))
	        .append("edad", 34)
	        .append("posicion", "Portero")
	        .append("equipos", Arrays.asList("Molde", "Ingolstadt", "Aston Villa", "Bournemouth", "Reading", "RB Leipzig", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Loïc Badé")
	        .append("nacionalidad", List.of("Francia", "Costa de Marfil"))
	        .append("edad", 25)
	        .append("posicion", "Defensa central")
	        .append("equipos", Arrays.asList("RC Lens", "Rennes", "Nottingham Forest", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Kike Salas")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 23)
	        .append("posicion", "Defensa central")
	        .append("equipos", Arrays.asList("Sevilla Atlético", "Sevilla FC", "CD Tenerife")));

	    jugadoresSevilla.add(new Document("nombre", "Marcão")
	        .append("nacionalidad", List.of("Brasil"))
	        .append("edad", 28)
	        .append("posicion", "Defensa central")
	        .append("equipos", Arrays.asList("Atlético Paranaense", "Chaves", "Galatasaray", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Tanguy Nianzou")
	        .append("nacionalidad", List.of("Francia", "Costa de Marfil"))
	        .append("edad", 22)
	        .append("posicion", "Defensa central")
	        .append("equipos", Arrays.asList("Paris Saint-Germain", "Bayern Múnich", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Ramón Martínez")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 22)
	        .append("posicion", "Defensa central")
	        .append("equipos", Arrays.asList("Sevilla Atlético", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Adrià Pedrosa")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 27)
	        .append("posicion", "Lateral izquierdo")
	        .append("equipos", Arrays.asList("RCD Espanyol", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "José Ángel Carmona")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 23)
	        .append("posicion", "Lateral derecho")
	        .append("equipos", Arrays.asList("Sevilla FC", "Elche CF", "Getafe CF")));

	    jugadoresSevilla.add(new Document("nombre", "Juanlu Sánchez")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 21)
	        .append("posicion", "Lateral derecho")
	        .append("equipos", Arrays.asList("Sevilla Atlético", "Sevilla FC", "CD Mirandés")));

	    jugadoresSevilla.add(new Document("nombre", "Lucien Agoumé")
	        .append("nacionalidad", List.of("Francia", "Camerún"))
	        .append("edad", 23)
	        .append("posicion", "Pivote")
	        .append("equipos", Arrays.asList("Sochaux", "Inter de Milán", "Stade Brestois", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Nemanja Gudelj")
	        .append("nacionalidad", List.of("Serbia", "Países Bajos"))
	        .append("edad", 33)
	        .append("posicion", "Pivote")
	        .append("equipos", Arrays.asList("NAC Breda", "AZ Alkmaar", "Sporting CP", "Guangzhou Evergrande", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Albert Sambi Lokonga")
	        .append("nacionalidad", List.of("Bélgica", "RD del Congo"))
	        .append("edad", 25)
	        .append("posicion", "Mediocentro")
	        .append("equipos",Arrays.asList("Anderlecht", "Arsenal", "Crystal Palace", "Luton Town")));

	    jugadoresSevilla.add(new Document("nombre", "Djibril Sow")
	        .append("nacionalidad", List.of("Suiza", "Senegal"))
	        .append("edad", 28)
	        .append("posicion", "Mediocentro")
	        .append("equipos", Arrays.asList("Borussia Mönchengladbach", "Young Boys", "Eintracht Frankfurt", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Saúl Ñíguez")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 30)
	        .append("posicion", "Mediocentro")
	        .append("equipos", Arrays.asList("Atlético de Madrid", "Rayo Vallecano", "Chelsea", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Manu Bueno")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 20)
	        .append("posicion", "Mediocentro")
	        .append("equipos", Arrays.asList("Sevilla Atlético", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Stanis Idumbo")
	        .append("nacionalidad", List.of("Bélgica", "RD del Congo"))
	        .append("edad", 19)
	        .append("posicion", "Mediocentro ofensivo")
	        .append("equipos", Arrays.asList("Sevilla Atlético", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Rubén Vargas")
	        .append("nacionalidad", List.of("Suiza", "República Dominicana"))
	        .append("edad", 26)
	        .append("posicion", "Extremo izquierdo")
	        .append("equipos", Arrays.asList("FC Luzern", "FC Augsburg", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Chidera Ejuke")
	        .append("nacionalidad", List.of("Nigeria"))
	        .append("edad", 27)
	        .append("posicion", "Extremo izquierdo")
	        .append("equipos", Arrays.asList("Heerenveen", "CSKA Moscú", "Hertha Berlín", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Dodi Lukébakio")
	        .append("nacionalidad", List.of("Bélgica", "RD del Congo"))
	        .append("edad", 27)
	        .append("posicion", "Extremo derecho")
	        .append("equipos", Arrays.asList("Anderlecht", "Watford", "Hertha Berlín", "Wolfsburgo", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Suso")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 31)
	        .append("posicion", "Extremo derecho")
	        .append("equipos", Arrays.asList("Liverpool", "Almería", "AC Milan", "Genoa", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Peque Fernández")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 22)
	        .append("posicion", "Mediapunta")
	        .append("equipos", Arrays.asList("FC Barcelona B", "Racing de Santander", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Isaac Romero")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 25)
	        .append("posicion", "Delantero centro")
	        .append("equipos", Arrays.asList("Sevilla Atlético", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "Akor Adams")
	        .append("nacionalidad", List.of("Nigeria"))
	        .append("edad", 25)
	        .append("posicion", "Delantero centro")
	        .append("equipos", Arrays.asList("Sogndal", "Lillestrom", "Montpellier HSC", "Sevilla FC")));

	    jugadoresSevilla.add(new Document("nombre", "García Pascual")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 22)
	        .append("posicion", "Delantero centro")
	        .append("equipos", Arrays.asList("Hércules CF", "Espanyol B", "Sevilla FC")));

	    collection.insertMany(jugadoresSevilla);
	}

	
	public static void InsertarJugadoresBetis(MongoCollection<Document> collection) {
	    List<Document> jugadoresBetis = new ArrayList<>();

	    jugadoresBetis.add(new Document("nombre", "Fran Vieites")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 26)
	        .append("posicion", "Portero")
	        .append("equipos", Arrays.asList("Betis Deportivo Balompié")));

	    jugadoresBetis.add(new Document("nombre", "Adrián")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 38)
	        .append("posicion", "Portero")
	        .append("equipos", Arrays.asList("Real Betis", "West Ham", "Liverpool FC")));

	    jugadoresBetis.add(new Document("nombre", "Natan")
	        .append("nacionalidad", List.of("Brasil"))
	        .append("edad", 24)
	        .append("posicion", "Defensa central")
	        .append("equipos", Arrays.asList("Red Bull Bragantino", "SSC Nápoles", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "Diego Llorente")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 31)
	        .append("posicion", "Defensa central")
	        .append("equipos", Arrays.asList("Real Madrid", "Rayo Vallecano", "Málaga", "Real Sociedad", "Leeds United", "AS Roma", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "Marc Bartra")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 34)
	        .append("posicion", "Defensa central")
	        .append("equipos", Arrays.asList("FC Barcelona", "Borussia Dortmund", "Real Betis", "Trabzonspor")));

	    jugadoresBetis.add(new Document("nombre", "Romain Perraud")
	        .append("nacionalidad", List.of("Francia"))
	        .append("edad", 27)
	        .append("posicion", "Lateral izquierdo")
	        .append("equipos", Arrays.asList("Nice", "Paris FC", "Stade Brestois", "Southampton FC", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "Ricardo Rodríguez")
	        .append("nacionalidad", List.of("Suiza", "Chile"))
	        .append("edad", 32)
	        .append("posicion", "Lateral izquierdo")
	        .append("equipos", Arrays.asList("VfL Wolfsburg", "AC Milan", "PSV", "Torino", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "Aitor Ruibal")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 29)
	        .append("posicion", "Lateral derecho")
	        .append("equipos", Arrays.asList("L'Hospitalet", "Cartagena", "Rayo Majadahonda", "Leganés", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "Héctor Bellerín")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 30)
	        .append("posicion", "Lateral derecho")
	        .append("equipos", Arrays.asList("Arsenal", "Watford", "Real Betis", "Sporting CP", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "Ángel Ortiz")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 20)
	        .append("posicion", "Lateral derecho")
	        .append("equipos", Arrays.asList("Betis Deportivo Balompié")));

	    jugadoresBetis.add(new Document("nombre", "Youssouf Sabaly")
	        .append("nacionalidad", List.of("Senegal", "Francia"))
	        .append("edad", 32)
	        .append("posicion", "Lateral derecho")
	        .append("equipos", Arrays.asList("PSG", "Evian", "Nantes", "Bordeaux", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "Johnny Cardoso")
	        .append("nacionalidad", List.of("Estados Unidos", "Italia"))
	        .append("edad", 23)
	        .append("posicion", "Pivote")
	        .append("equipos", Arrays.asList("Internacional", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "Marc Roca")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 28)
	        .append("posicion", "Pivote")
	        .append("equipos", Arrays.asList("Espanyol", "Bayern Múnich", "Leeds United", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "William Carvalho")
	        .append("nacionalidad", List.of("Portugal", "Angola"))
	        .append("edad", 33)
	        .append("posicion", "Pivote")
	        .append("equipos", Arrays.asList("Sporting CP", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "Giovani Lo Celso")
	        .append("nacionalidad", List.of("Argentina", "Italia"))
	        .append("edad", 29)
	        .append("posicion", "Mediocentro")
	        .append("equipos", Arrays.asList("Rosario Central", "PSG", "Real Betis", "Tottenham Hotspur", "Villarreal")));

	    jugadoresBetis.add(new Document("nombre", "Sergi Altimira")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 23)
	        .append("posicion", "Mediocentro")
	        .append("equipos", Arrays.asList("Sabadell", "Getafe", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "Mateo Flores")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 21)
	        .append("posicion", "Mediocentro")
	        .append("equipos", Arrays.asList("Betis Deportivo Balompié")));

	    jugadoresBetis.add(new Document("nombre", "Pablo Fornals")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 29)
	        .append("posicion", "Mediocentro ofensivo")
	        .append("equipos", Arrays.asList("Málaga", "Villarreal", "West Ham", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "Isco")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 33)
	        .append("posicion", "Mediocentro ofensivo")
	        .append("equipos", Arrays.asList("Valencia", "Málaga", "Real Madrid", "Sevilla", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "Abde Ezzalzouli")
	        .append("nacionalidad", List.of("Marruecos", "España"))
	        .append("edad", 23)
	        .append("posicion", "Extremo izquierdo")
	        .append("equipos", Arrays.asList("Hércules", "Barcelona", "Osasuna", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "Jesús Rodríguez")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 19)
	        .append("posicion", "Extremo izquierdo")
	        .append("equipos", Arrays.asList("Betis Deportivo Balompié")));

	    jugadoresBetis.add(new Document("nombre", "Antony")
	        .append("nacionalidad", List.of("Brasil"))
	        .append("edad", 25)
	        .append("posicion", "Extremo derecho")
	        .append("equipos", Arrays.asList("São Paulo", "Ajax", "Manchester United", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "Cucho Hernández")
	        .append("nacionalidad", List.of("Colombia", "España"))
	        .append("edad", 26)
	        .append("posicion", "Delantero centro")
	        .append("equipos", Arrays.asList("América de Cali", "Granada", "Huesca", "Mallorca", "Watford", "Columbus Crew", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "Chimy Ávila")
	        .append("nacionalidad", List.of("Argentina", "España"))
	        .append("edad", 31)
	        .append("posicion", "Delantero centro")
	        .append("equipos", Arrays.asList("San Lorenzo", "Huesca", "Osasuna", "Real Betis")));

	    jugadoresBetis.add(new Document("nombre", "Cédric Bakambu")
	        .append("nacionalidad", List.of("RD del Congo", "Francia"))
	        .append("edad", 34)
	        .append("posicion", "Delantero centro")
	        .append("equipos", Arrays.asList("Sochaux", "Bursaspor", "Villarreal", "Beijing Guoan", "Marseille", "Galatasaray", "Real Betis")));

	    collection.insertMany(jugadoresBetis);
	}

	
	public static void InsertarJugadoresPalmas(MongoCollection<Document> collection) {
	    List<Document> jugadoresPalmas = new ArrayList<>();

	    jugadoresPalmas.add(new Document("nombre", "Dinko Horkas")
	        .append("nacionalidad", List.of("Croacia", "Bosnia y Herzegovina"))
	        .append("edad", 26)
	        .append("posicion", "Portero")
	        .append("equipos", Arrays.asList("Dinamo Zagreb", "Varazdin", "Lokomotiv Plovdiv")));

	    jugadoresPalmas.add(new Document("nombre", "Jasper Cillessen")
	        .append("nacionalidad", List.of("Países Bajos"))
	        .append("edad", 36)
	        .append("posicion", "Portero")
	        .append("equipos", Arrays.asList("NEC Nijmegen", "Ajax", "FC Barcelona", "Valencia CF", "NEC Nijmegen")));

	    jugadoresPalmas.add(new Document("nombre", "Mika Mármol")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 23)
	        .append("posicion", "Defensa central")
	        .append("equipos", Arrays.asList("Barcelona B", "Andorra", "UD Las Palmas")));

	    jugadoresPalmas.add(new Document("nombre", "Scott McKenna")
	        .append("nacionalidad", List.of("Escocia"))
	        .append("edad", 28)
	        .append("posicion", "Defensa central")
	        .append("equipos", Arrays.asList("Aberdeen", "Nottingham Forest", "Copenhague")));

	    jugadoresPalmas.add(new Document("nombre", "Juanma Herzog")
	        .append("nacionalidad", List.of("España", "Alemania"))
	        .append("edad", 21)
	        .append("posicion", "Defensa central")
	        .append("equipos", Arrays.asList("Las Palmas Atlético")));

	    jugadoresPalmas.add(new Document("nombre", "Alex Suárez")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 32)
	        .append("posicion", "Defensa central")
	        .append("equipos", Arrays.asList("Las Palmas C", "Las Palmas Atlético", "UD Las Palmas")));

	    jugadoresPalmas.add(new Document("nombre", "Álex Muñoz")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 30)
	        .append("posicion", "Lateral izquierdo")
	        .append("equipos", Arrays.asList("Hércules", "Zaragoza", "Tenerife", "Levante UD")));

	    jugadoresPalmas.add(new Document("nombre", "Andy Pelmard")
	        .append("nacionalidad", List.of("Francia", "Guadalupe"))
	        .append("edad", 25)
	        .append("posicion", "Lateral derecho")
	        .append("equipos", Arrays.asList("Nice", "Basel", "Clermont Foot 63")));

	    jugadoresPalmas.add(new Document("nombre", "Viti Rozada")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 27)
	        .append("posicion", "Lateral derecho")
	        .append("equipos", Arrays.asList("Real Oviedo B", "Real Oviedo")));

	    jugadoresPalmas.add(new Document("nombre", "Marvin Park")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 24)
	        .append("posicion", "Lateral derecho")
	        .append("equipos", Arrays.asList("Trival Valderas", "Real Madrid Juvenil", "Real Madrid Castilla", "UD Las Palmas")));

	    jugadoresPalmas.add(new Document("nombre", "Dário Essugo")
	        .append("nacionalidad", List.of("Portugal", "Angola"))
	        .append("edad", 20)
	        .append("posicion", "Pivote")
	        .append("equipos", Arrays.asList("Sporting CP")));

	    jugadoresPalmas.add(new Document("nombre", "Stefan Bajcetic")
	        .append("nacionalidad", List.of("España", "Serbia"))
	        .append("edad", 20)
	        .append("posicion", "Pivote")
	        .append("equipos", Arrays.asList("Celta de Vigo", "Liverpool FC")));

	    jugadoresPalmas.add(new Document("nombre", "Javi Muñoz")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 30)
	        .append("posicion", "Mediocentro")
	        .append("equipos", Arrays.asList("Real Madrid Castilla", "Lugo", "Tenerife", "Oviedo", "Eibar", "UD Las Palmas")));

	    jugadoresPalmas.add(new Document("nombre", "Enzo Loiodice")
	        .append("nacionalidad", List.of("Francia"))
	        .append("edad", 24)
	        .append("posicion", "Mediocentro")
	        .append("equipos", Arrays.asList("Dijon", "Wolverhampton Wanderers", "UD Las Palmas")));

	    jugadoresPalmas.add(new Document("nombre", "José Campaña")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 31)
	        .append("posicion", "Mediocentro")
	        .append("equipos", Arrays.asList("Sevilla", "Crystal Palace", "Sampdoria", "Nürnberg", "Levante UD", "UD Las Palmas")));

	    jugadoresPalmas.add(new Document("nombre", "Alberto Moleiro")
	        .append("nacionalidad", List.of("España", "Cuba"))
	        .append("edad", 21)
	        .append("posicion", "Mediocentro ofensivo")
	        .append("equipos", Arrays.asList("UD Las Palmas")));

	    jugadoresPalmas.add(new Document("nombre", "Kirian Rodríguez")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 29)
	        .append("posicion", "Mediocentro ofensivo")
	        .append("equipos", Arrays.asList("UD Las Palmas B", "UD Las Palmas")));

	    jugadoresPalmas.add(new Document("nombre", "Manu Fuster")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 27)
	        .append("posicion", "Extremo izquierdo")
	        .append("equipos", Arrays.asList("CD Olímpic", "Guijuelo", "Albacete Balompié")));

	    jugadoresPalmas.add(new Document("nombre", "Benito Ramírez")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 29)
	        .append("posicion", "Extremo izquierdo")
	        .append("equipos", Arrays.asList("Las Palmas B", "UD Las Palmas")));

	    jugadoresPalmas.add(new Document("nombre", "Adnan Januzaj")
	        .append("nacionalidad", List.of("Bélgica", "Kosovo"))
	        .append("edad", 30)
	        .append("posicion", "Extremo derecho")
	        .append("equipos", Arrays.asList("Manchester United", "Borussia Dortmund", "Sunderland", "Real Sociedad", "Sevilla FC")));

	    jugadoresPalmas.add(new Document("nombre", "Fábio Silva")
	        .append("nacionalidad", List.of("Portugal"))
	        .append("edad", 22)
	        .append("posicion", "Delantero centro")
	        .append("equipos", Arrays.asList("FC Porto", "Wolverhampton Wanderers", "Anderlecht", "PSV Eindhoven")));

	    jugadoresPalmas.add(new Document("nombre", "Oli McBurnie")
	        .append("nacionalidad", List.of("Escocia", "Inglaterra"))
	        .append("edad", 28)
	        .append("posicion", "Delantero centro")
	        .append("equipos", Arrays.asList("Bradford", "Swansea", "Barnsley", "Sheffield United")));

	    jugadoresPalmas.add(new Document("nombre", "Sandro Ramírez")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 29)
	        .append("posicion", "Delantero centro")
	        .append("equipos", Arrays.asList("FC Barcelona", "Málaga", "Everton", "Sevilla", "Real Sociedad", "Huesca", "Getafe", "UD Las Palmas")));

	    jugadoresPalmas.add(new Document("nombre", "Marc Cardona")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 29)
	        .append("posicion", "Delantero centro")
	        .append("equipos", Arrays.asList("Eibar", "Barcelona B", "Osasuna", "Mallorca", "Go Ahead Eagles", "UD Las Palmas")));

	    jugadoresPalmas.add(new Document("nombre", "Jaime Mata")
	        .append("nacionalidad", List.of("España"))
	        .append("edad", 36)
	        .append("posicion", "Delantero centro")
	        .append("equipos", Arrays.asList("Lleida", "Girona", "Tarragona", "Valladolid", "Getafe CF")));

	    collection.insertMany(jugadoresPalmas);
	}

	
	public static void InsertarJugadoresOsasuna(MongoCollection<Document> collection) {
	    List<Document> jugadoresOsasuna = new ArrayList<>();
	    
	    collection.insertMany(jugadoresOsasuna);
	}

	
	public static void InsertarJugadoresCelta(MongoCollection<Document> collection) {
	    List<Document> jugadoresCelta = new ArrayList<>();

	    
	    collection.insertMany(jugadoresCelta);
	}

	
	public static void InsertarJugadoresEspanyol(MongoCollection<Document> collection) {
	    List<Document> jugadoresEspanyol = new ArrayList<>();

	   
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
