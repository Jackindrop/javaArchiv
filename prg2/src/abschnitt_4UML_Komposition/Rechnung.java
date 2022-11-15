package abschnitt_4UML_Komposition;

import java.util.ArrayList;

public class Rechnung {

    private int nummer;
    private ArrayList<Rechnungsposition> positionen=
            new ArrayList<>();

    public Rechnung(int nummer) {
        this.nummer= nummer;
    }

    public void addPos(int artikelnummer, double preis) {
        this.positionen.add(new Rechnungsposition(artikelnummer,
            preis));
    }

    public int getArtikelnummer(int pos) {
        if (this.positionen.size()== 0) {
            throw new RuntimeException("Kein passender Artikel gefunden");
        }
        return this.positionen.get(pos).getArtikelnummer();
    }
    public double getPreis(int pos) {
        if (this.positionen.size()== 0) {
            throw new RuntimeException("Kein passender Artikel gefunden");
        }
        return this.positionen.get(pos).getPreis();
    }
}
