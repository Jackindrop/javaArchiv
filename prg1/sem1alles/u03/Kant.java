/** u03, Zeile 1000 mal ausgeben ohne schleife */
public class Kant {
    /** Zeile wird 10* ausgegeben */
    public static void mnr1() {
        System.out.println("Habe Mut dich deines eigenen Verstandes zu bedienen!");
        System.out.println("Habe Mut dich deines eigenen Verstandes zu bedienen!");
        System.out.println("Habe Mut dich deines eigenen Verstandes zu bedienen!");
        System.out.println("Habe Mut dich deines eigenen Verstandes zu bedienen!");
        System.out.println("Habe Mut dich deines eigenen Verstandes zu bedienen!");
        System.out.println("Habe Mut dich deines eigenen Verstandes zu bedienen!");
        System.out.println("Habe Mut dich deines eigenen Verstandes zu bedienen!");
        System.out.println("Habe Mut dich deines eigenen Verstandes zu bedienen!");
        System.out.println("Habe Mut dich deines eigenen Verstandes zu bedienen!");
        System.out.println("Habe Mut dich deines eigenen Verstandes zu bedienen!");
    }
    /** durch das 10 fache wiederholen der ersten Methode=mnr1 wird die Zeile
    100 mal ausgegeben */
    public static void mnr2() {
        mnr1();
        mnr1();
        mnr1();
        mnr1();
        mnr1();
        mnr1();
        mnr1();
        mnr1();
        mnr1();
        mnr1();
    }
    /** durch das 10 fache wiederholen der zweiten Methode=mnr2 wird die Zeile
    10*100=1000 mal ausgegeben */
    public static void mnr3() {
        mnr2();
        mnr2();
        mnr2();
        mnr2();
        mnr2();
        mnr2();
        mnr2();
        mnr2();
        mnr2();
        mnr2();
    }
    /** main methode startet mnr3 welche die Zeile 1000 mal ausgibt */
    public static void main(String[] args) {
        mnr3();
    }
}