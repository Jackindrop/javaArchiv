package abschnitt_6gAktie;

public abstract class AnteilAnlage {
  private String isin;
  private double gesamtKosten;
    
  public AnteilAnlage(String isin) {
    this.isin= isin;
    gesamtKosten= 0.0;
  }
  public void addiereKosten(double kosten) {
    gesamtKosten += kosten;
  }
  public String getIsin() {
    return isin;
  }
  public double getGesamtKosten() {
    return gesamtKosten;
  }
  public double getGewinn(double aktuellerKurs) {
    return getMarktwert(aktuellerKurs) - getGesamtKosten();
  }
  public abstract double getMarktwert(double aktuellerKurs);
}
