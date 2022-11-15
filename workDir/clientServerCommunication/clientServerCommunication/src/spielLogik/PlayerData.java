package spielLogik;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PlayerData {

    private File playerData;
    //initialisiert die Datei mit vorhandenen Spielerdaten
    public PlayerData() {
        playerData = new File("clientServerCommunication/playerData.txt");
        System.out.println("PlayerData.txt found: " +playerData.exists());
    }

    public Spieler getPlayerData(String name) {
        Scanner input= null;
        try {
            input = new Scanner(playerData);
        } catch (FileNotFoundException e) {
            System.out.println("Fehler beim scannen der PlayerDatas");
        }
        // suche nach Vorhandenem Player Namen
        while (input.hasNextLine()) {
            String tmpName= input.next();
            int uid= input.nextInt();
            int semester= input.nextInt();
            // wenn gefunden, rückgabe neues Objekt initialisiert mit vorhandenen daten
            if (name.equals(tmpName)) {
                input.close();
                return new Spieler(tmpName, uid, semester);
            }
        }
        //wurde kein Datensatz gefunden und zurück gegeben wird der Spieler gespeichert
        Spieler newPlayer = new Spieler(name);
        legeSpielerAb(newPlayer);
        input.close();
        return newPlayer;
    }

    // ablegen des neuen Spielernamen
    public void legeSpielerAb(Spieler s) {
        PrintStream output= null;
        try {
            output = new PrintStream(
                    new FileOutputStream(playerData, true));
            output.print("\n"+s.getName()+" "+s.getUID()+" "+s.getSemester());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage() +
                    "\ncant write player in Datafile");
        } finally {
            output.close();
        }
    }
    // kontrollmethode
    public void showPlayerData() {
        Scanner input= null;
        try {
            input = new Scanner(playerData);
        } catch (FileNotFoundException e) {
            System.out.println("Fehler beim scannen der PlayerDatas");
        }
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
        input.close();
    }
}
