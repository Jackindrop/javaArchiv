package abschnitt_5ZahlenarrayZeitmessung;

import de.hsh.prog.zahlenarray.Zahlenarray;

import java.util.ArrayList;

/**
 * TODO besprechen mit johannes
 */
public class MeinZahlenArray extends Zahlenarray {
    private int anzahl;
    private ArrayList<Integer> arr= new ArrayList<>();
    private static ArrayList<Zeitmesser> arrTime= new ArrayList<>();
    private Zeitmesser timeMess= new Zeitmesser();

    public MeinZahlenArray(int anzahl, int max) {
        super(anzahl, max);
        this.anzahl= anzahl;
        // convert array to list
        for (int y : super.getZahlenArray()) {
            arr.add(y);
        }
    }

    @Override
    public boolean istEnthalten(int zahl) {
        timeMess.start();
        for(int i = 1; i < this.arr.size(); i++) {
            if (this.arr.get(i) == zahl) {
                timeMess.stop();
                return true;
            }
        }
        timeMess.stop();
        return false;
    }
    public int getDurchschnittlicheAbfragezeit() {
        return anzahl/(int) timeMess.getGemesseneGesamtzeit();
    }
}
