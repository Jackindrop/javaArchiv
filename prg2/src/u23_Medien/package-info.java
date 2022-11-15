package u23_Medien;
/**
 * Lesen Sie bitte zunächst im Skript PR2_06_Anlage/PR2_06_L.drvd.pdf die Abschnitte L.6.6 und L.6.7.
 * Implementieren Sie mehrere Klassen zur Repräsentation verschiedener Medien: Buch, CD, Zeitschrift.
 * Die Medien sind verwandt, weil sie gemeinsame Eigenschaften haben, aber sie besitzen auch jeweils
 * spezielle Eigenschaften.
 *
 * Klasse	Gemeinsame Eigenschaften	Spezielle Eigenschaften
 * Buch	getTitel, getErscheinungsjahr (>=0)	getVerlag, getAutor
 * CD	getTitel, getErscheinungsjahr (>=0)	getKuenstler, getGesamtspielzeit (Minuten, >= 1)
 * Zeitschrift	getTitel, getErscheinungsjahr (>=0)	getNummer (>=1)
 * Programmieren sie die drei Klassen und eine nicht instanziierbare Superklasse Medium im anonymen Default-Package.
 *
 * Einschub (falls Sie auf die Idee kommen sollten, Medium als Interface zu realisieren): Medium soll nicht als
 * Interface, sondern als nicht instanziierbare Klasse realisiert werden. Es ist zwar ab Java 9 möglich, so etwas a
 * uch als Interface mit default- und private-Methoden zu realisieren. Das ist jedoch kein besonders guter
 * Programmierstil, denn default-Methoden haben als eigentlichen Einsatzzweck die nachträgliche Erweiterung
 * eines Interfaces unter Beibehaltung der Rückwärtskompatibilität mit bereits bestehenden Subklassen. (Einschub-Ende)
 *
 * Implementieren Sie die gemeinsamen Eigenschaften in der Superklasse. Schreiben Sie für jede Eigenschaft
 * jeweils einen Getter und einen die Gültigkeit der übergebenen Werte prüfenden Setter. String-Parameter
 * sind darauf zu prüfen, ob sie null oder leer sind. Der leere String ist "" und besitzt keine Leerzeichen
 * zwischen den Anführungszeichen. Schreiben Sie außerdem je einen Konstruktor pro Klasse, der alle Attribute
 * mit übergebenen Daten initialisiert, und jeweils eine toString-Methode (in Subklassen und Superklasse).
 * Vermeiden Sie Coderedundanz wo immer es geht!
 *
 * Medien-Objekte werden in einer Bibliothek ausgeliehen. Die Leihfrist ist unterschiedlich je nach Medientyp:
 *
 * Klasse	Leihfrist (Tage)
 * Buch	28
 * CD	14
 * Zeitschrift	7
 * Implementieren Sie eine Methode getLeihFrist() derart, dass sie polymorph für beliebige Medien aufrufbar ist.
 * Es gibt keine allgemein gültige Leihfrist, d. h. in der Superklasse Medium kann keine Leihfrist implementiert
 * werden. Sie sollen kein Attribut für die Leihfrist implementieren, da dies bei vielen Medienobjekten zu
 * unnötigem Speicherplatzverbrauch führen würde.
 *
 * Orientieren Sie sich bitte an der gewünschten Ausgabe des folgenden Hauptprogramms:
 *
 * /**
 *  * Testet Subklassen von <code>Medium</code> und deren Leihfrist.
 *  */

/**


public class MedienMain {
 *     Hauptroutine


    public static void main(String[] args) {
 *Medium[] medien = {
                * new Buch("Building Java Programs - A Back to Basics Approach",
                * 2007, "Addison Wesley", "Stuart Reges, Marty Stepp"),
 *new CD("Are you Experienced?", 1967, "Jimi Hendrix", 40),
 *new Zeitschrift("Der Spiegel", 2010, 3)
                *         };
 *
 *for (Medium m : medien) {
 *System.out.println(m);
 *System.out.println("  Leihfrist: " + m.getLeihFrist());
 *}
 *}
 *
}
 *Gewünschte Ausgabe:
         *
         *Stuart Reges,Marty Stepp:Building Java Programs-A Back to Basics Approach(2007)Addison Wesley
         *Leihfrist:28
         *Jimi Hendrix:Are you Experienced?(1967)40Minuten
         *Leihfrist:14
         *Der Spiegel(3/2010)
         *Leihfrist:7
 */