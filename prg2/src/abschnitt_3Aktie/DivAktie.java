package abschnitt_3Aktie;

public class DivAktie extends Aktie {
    private double gesamtDividende;

    /** Initialisiert eine neue Aktie.
     * Vorbdg.: isin != null */
    public DivAktie(String isin) {
        super(isin);
        gesamtDividende= 0.0;
    }

    /** Vorbdg.: dividendeProAktie &gt;= 0.0 */
    public void zahleDividende(double dividendeProAktie) {
        if (dividendeProAktie < 0) {
            throw new IllegalArgumentException("dividendeProAktie muss >= 0 sein");
        }
        gesamtDividende += dividendeProAktie * getGesamtAnzahl();
    }

    /** Liefert den gesamten Gewinn oder Verlust, der mit
     * dieser Aktie verdient wurde, und zwar inklusive
     * Dividende, abhängig vom aktuellen Kurswert.
     * Vorbdg.: aktuellerKurs &gt;= 0.0 */
    @Override public double getGewinn(double aktuellerKurs) {
        return super.getGewinn(aktuellerKurs) + gesamtDividende;
    }
}
