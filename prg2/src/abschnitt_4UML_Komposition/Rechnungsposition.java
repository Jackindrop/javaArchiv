package abschnitt_4UML_Komposition;

public class Rechnungsposition {
    private int artikelnummer= 0;
    private double preis= 0.0;

    Rechnungsposition(int n, double p) {
        this.artikelnummer= n;
        this.preis= p;
    }

     int getArtikelnummer() {
        return this.artikelnummer;
    }

    double getPreis() {
        return this.preis;
    }
}
