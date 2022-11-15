package abschnitt_6gAktie;

public class Aktie extends AnteilAnlage {
  private int gesamtAnzahl;
    
  public Aktie(String isin) {
    super(isin);
    gesamtAnzahl= 0;
  }
  @Override public double getMarktwert(double aktuellerKurs) {
    return gesamtAnzahl * aktuellerKurs;
  }
  public void kaufe(int anzahl, double kaufKurs) {
    gesamtAnzahl += anzahl;
    addiereKosten(anzahl * kaufKurs);
  }
  public int getGesamtAnzahl() {
    return gesamtAnzahl;
  }
}

