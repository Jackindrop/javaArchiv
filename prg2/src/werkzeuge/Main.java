package werkzeuge;

/**
 * U16 Werkzeuge
 *
 * Teilaufgabe Javadoc
 * Dokumentieren Sie alle Klassen und Methoden mit einigen
 * Javadoc-Kommentaren. Nutzen Sie dazu mindestens die
 * Javadoc-Tags für Parameter und Rückgabewerte.
 *
 * Teilaufgabe Jar-File
 * Erstellen Sie mit eclipse ein JAR-Archiv, welches genau
 * die folgenden Dateien in geeigneten Unterordnern
 * enthält:
 * Main.class SomeClass.class und die Manifest-Datei.
 * Legen Sie das JAR_File unter dem Namen werkzeuge.jar
 * direkt in der obersten Verzeichnisebene des
 * Projektordners ab. Das JAR-Archiv soll mit dem Kommando
 * java -jar werkzeuge.jar ausführbar sein.
 */
public class Main {
    /**
     * Main-Method generate new Object from SomeClass
     * and void his Method.
     * @param args no command-line arguments needed.
     */
    public static void main(String[] args) {
        /**
         * New SomeClass Object s
         */
        SomeClass s= new SomeClass();
        /**
         * Give the @Override invisible called method
         * toString() into the System.out Stream
         */
        System.out.println(s);
    }
}