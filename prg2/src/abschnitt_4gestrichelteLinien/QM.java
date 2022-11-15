package abschnitt_4gestrichelteLinien;


import de.hsh.prog.klassedashedline.Loc;

import java.awt.*;

import static abschnitt_3Linie.Main.erzeugeZeichenbereich;


public class QM {
    public static void main(String[] args) {
        Graphics g= erzeugeZeichenbereich();
        int[] dashes= { 15, 25 };
        DashedLine dl= new DashedLine(new Loc(10, 10), new Loc(190, 10), dashes);
        dl.draw(g);
        dashes= new int[] { 15, 25, 5, 35 };
        dl= new DashedLine(new Loc(10, 20), new Loc(190, 20), dashes);
        dl.draw(g);
        DashedStar.draw(); // TODO FIX?!

    }
}
