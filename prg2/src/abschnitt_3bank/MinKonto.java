package abschnitt_3bank;

public class MinKonto extends Bankkonto{
    private int min;

    public MinKonto() {
        super();
        min= getKontostand();
    }

    @Override public void belasten(Belastung g) {
        super.belasten(g);
        if (min > getKontostand()) {
            min= getKontostand();
        }
    }

    public int getMin() {return min;}
}
