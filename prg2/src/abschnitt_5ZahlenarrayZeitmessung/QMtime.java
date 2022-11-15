package abschnitt_5ZahlenarrayZeitmessung;
import de.hsh.prog.zahlenarray.ZahlenPruefer;
import de.hsh.prog.zahlenarray.Zahlenarray;

import static abschnitt_5ZahlenarrayZeitmessung.MeinZahlenPruefer.anzahlVerschiedene;

public class QMtime {
    public static void main(String[] args) {
        teilAufgabeB1();
        teilAufgabeB2();

    }
    public static  void teilAufgabeB2() {
        MeinZahlenArray array= new MeinZahlenArray(10000, 500000);
        // ↑ Änderung: MeinZahlenarray ↑ statt Zahlenarray
        int anzahl= ZahlenPruefer.anzahlVerschiedene(array);
        System.out.println("Anzahl: "+anzahl);
        // ↓ Änderung: zusätzliche Anweisung:
        System.out.println("istEnthalten verbraucht durchschnittlich "
                +1000*array.getDurchschnittlicheAbfragezeit()+" us");
    }
    public static  void teilAufgabeB1() {
        // standard .istEnthalten() methode
        Zahlenarray array= new Zahlenarray(10000, 500000);
        MeinZahlenArray arrayMeins= new MeinZahlenArray(10000, 500000);
        Zeitmesser watchDog1= new Zeitmesser();
        watchDog1.start();
        int anzahl= ZahlenPruefer.anzahlVerschiedene(array);
        watchDog1.stop();
        System.out.println("Anzahl: "+anzahl+"\n"+
                "t/n: "+ (anzahl/watchDog1.getGemesseneGesamtzeit()));
        // eigene .istEnthalten() methode
        Zeitmesser watchDog2= new Zeitmesser();
        watchDog2.start();
        int anzahl2= anzahlVerschiedene(arrayMeins);
        watchDog2.stop();
        System.out.println("Anzahl: "+anzahl2+"\n"+
                "t/n: "+ (anzahl2/watchDog2.getGemesseneGesamtzeit()));
    }
}
