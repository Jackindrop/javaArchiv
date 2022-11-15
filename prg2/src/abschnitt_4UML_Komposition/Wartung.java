package abschnitt_4UML_Komposition;

public class Wartung {
    public static void main(String[] args) {
        Rechnung r1= new Rechnung(1234);
        r1.addPos(23, 44.22);
        System.out.println(r1.getPreis(0)+
                "\n"+ r1.getArtikelnummer(0));
    }
}
