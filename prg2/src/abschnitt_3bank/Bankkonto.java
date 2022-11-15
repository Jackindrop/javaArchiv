package abschnitt_3bank;

public class Bankkonto {
    private static int sumOfKontos= 0;
    private  int nr= 1000;
    private int kontoStand;
    /** Der einzige Konstruktor erhält Kontonr. als Parameter */
    public Bankkonto() {
        this.nr+= getSumOfKontos();
        kontoStand = 0;
        sumOfKontos++;
    }
    /** Belastung aufzeichnen */
    public void belasten(Belastung b) {
        kontoStand -= b.getLast();
    }
    /** Gutschrift aufzeichnen */
    public void gutschreiben(Gutschrift g) {
        kontoStand += g.getErtrag();
    }
    /** liefert den Kontostand in Cents */
    public int getKontostand() {
    return kontoStand;
    }
    public static int getSumOfKontos() {return sumOfKontos;}
    public int getNr() {return this.nr;}

}

