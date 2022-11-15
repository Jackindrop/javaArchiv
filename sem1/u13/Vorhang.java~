public class Vorhang {
    public static void main(String[] args) {
        vorhang(3, "|----");
    }

    /** Zeichnet einen "tiefe" breiten Teil des Lichtervorhangs.
        Der Vorhang wird links jeweils um eine feste Zeichenfolge 
        (angegeben in prefix) verlängert.
        Beispiel:  vorhang (1, "|--------");
        Ausgabe:
        |--------O
        Beispiel:  vorhang (2, "irgendwas");
        Ausgabe:
        irgendwas---O
        irgendwasO
        irgendwas---O
        Beispiel:  vorhang (3, "|--");
        Ausgabe:
        |--------O
        |-----O
        |--------O
        |--O
        |--------O
        |-----O
        |--------O   */
    public static void vorhang(int tiefe, String prefix) {
        if (tiefe == 1) {
            System.out.println(prefix + "O");
        } else {
            vorhang(tiefe-1, prefix+"---");
            System.out.println(prefix + "O");
            vorhang(tiefe-1, prefix+"---");
        }
    }
}