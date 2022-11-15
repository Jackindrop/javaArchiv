package abschnitt_3bank;

public class geldDrucken {
    public static void main(String[] args) {
        Bankkonto konto= new Bankkonto();
        konto.gutschreiben(new Gutschrift(8000));
        konto.belasten(new Belastung(5000));
        konto.belasten(new Belastung(3400));
        konto.gutschreiben(new Gutschrift(1000));
        System.out.println("Diese KontoNummer: "+ konto.getNr());
        System.out.println("Letzter Kontostand: "+konto.getKontostand());

        MinKonto minKonto= new MinKonto();
        minKonto.gutschreiben(new Gutschrift(8000));
        minKonto.belasten(new Belastung(5000));
        minKonto.belasten(new Belastung(3400));
        minKonto.gutschreiben(new Gutschrift(1000));
        System.out.println("Diese KontoNummer: "+ minKonto.getNr());
        System.out.println("Letzter Kontostand: "+minKonto.getKontostand());
        System.out.println("Niedrigster Kontostand: "+minKonto.getMin());
        System.out.println("Summe aller Bankkonto-Objekte= "+ Bankkonto.getSumOfKontos());
    }
}
