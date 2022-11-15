package abschnitt_3ballSpiele;

public class Wertung {
    public static void main(String[] args) {
        Ballspiele s= new Ballspiele();
        System.out.println("Ballspiel: ");
        System.out.println("  Mannschaften: " + s.getTeams());
        System.out.println("  Spieldauer  : " + s.getSpieldauer());
        System.out.println("  Bälle       : " + s.getBaelle());
        Fussball f= new Fussball();
        System.out.println("Fussball: ");
        System.out.println("  Mannschaften: " + f.getTeams());
        System.out.println("  Spieldauer  : " + f.getSpieldauer());
        System.out.println("  Bälle       : " + f.getBaelle());
        System.out.println("  Einwurf     : " + f.einwurfRegel());
        System.out.println("  Ecke        : " + f.eckRegel());
        // entsprechend für die weiteren Klassen
    }

}
