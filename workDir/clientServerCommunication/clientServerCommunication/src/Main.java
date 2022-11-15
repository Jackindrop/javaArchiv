import spielLogik.*;

public class Main {
    public static void main(String[] args) {

        testPlayerBank();

    }

    public static void testPlayerBank() {
        // Datenbannk Objekt anlegen zum späteren abfragen
        PlayerData pD= new PlayerData();
        // testpersonen für Datenbank
        String p1 = "Gerald";
        String p2 = "Marie";
        String p3 = "Rüdiger";
        String p4 = "Dagobert";
        // initialisierung der Spieler .getPlayerData
        // prüft hier ob ein vorhandener Datensatz vorliegt
        // und initialisiert ggf. ein neues Spieler-Objekt mit den Daten
        Spieler player1= pD.getPlayerData(p1);
        Spieler player2= pD.getPlayerData(p2);
        Spieler player3= pD.getPlayerData(p3);
        Spieler player4= pD.getPlayerData(p4);

        pD.showPlayerData();
        player1.showSpielerFeld();
        player2.showSpielerFeld();
        player3.showSpielerFeld();


    }
}