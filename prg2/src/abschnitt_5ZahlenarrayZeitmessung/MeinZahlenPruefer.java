package abschnitt_5ZahlenarrayZeitmessung;

import de.hsh.prog.zahlenarray.ZahlenPruefer;
import de.hsh.prog.zahlenarray.Zahlenarray;

public class MeinZahlenPruefer extends ZahlenPruefer {

    public static int anzahlVerschiedene(Zahlenarray array) {
        int cnt = 0;

        for (int i = 0; i < array.getMax(); ++i) {
            if (array.istEnthalten(i)) {
                ++cnt;
            }
        }

        return cnt;
    }
}