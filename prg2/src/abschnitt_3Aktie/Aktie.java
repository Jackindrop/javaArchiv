package abschnitt_3Aktie;

public class Aktie {

    private String isin;
    private int gesamtAnzahl;
    private double gesamtKosten;

    /** Initialisiert eine neue Aktie.
     * Vorbdg.: isin != null */
    public Aktie(String isin) {
        if (isin == null) {
            throw new NullPointerException("isin darf nicht null sein");
        }
        this.isin= isin;
        gesamtAnzahl= 0;
        gesamtKosten= 0.0;
    }

    /** Liefert den gesamten Gewinn oder Verlust, der mit
     * dieser Aktie verdient wurde, abhängig vom aktuellen
     * Kurswert.
     * Vorbdg.: aktuellerKurs &gt;= 0.0 */
    public double getGewinn(double aktuellerKurs) {
        if (aktuellerKurs < 0) {
            throw new IllegalArgumentException("aktuellerKurs muss >= 0 sein");
        }

        double marktWert= gesamtAnzahl * aktuellerKurs;
        return marktWert - gesamtKosten;
    }

    /** Vorbdg.: anzahl und kaufKurs &gt;= 0 */
    public void kaufe(int anzahl, double kaufKurs) {
        if (kaufKurs < 0) {
            throw new IllegalArgumentException("kaufKurs muss >= 0 sein");
        }
        if (anzahl < 0) {
            throw new IllegalArgumentException("anzahl muss >= 0 sein");
        }
        gesamtAnzahl += anzahl;
        gesamtKosten += anzahl * kaufKurs;
    }

    public String getIsin() {
        return isin;
    }

    public int getGesamtAnzahl() {
        return gesamtAnzahl;
    }
}