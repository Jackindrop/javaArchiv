package abschnitt_4gestrichelteLinien;

import abschnitt_3Linie.Linie;
import java.awt.*;
import java.util.Arrays;
import de.hsh.prog.klassedashedline.Loc;

public class DashedLine extends Linie {

    private int[] muster;

    public DashedLine(Loc p1, Loc p2, int[] dashes) {
        super(p1, p2);
        muster= dashes;
    }
    @Override public void draw(Graphics g) {
        double x= this.getP1().getX();
        double y= this.getP1().getY();
        double dX= this.getP2().getX()-this.getP1().getX();
        double dY= this.getP2().getY()-this.getP1().getY();
        double nextX;
        double nextY;
        double currentLength= 0;
        double totalLength= this.getLength();
        int i= 0;

        while (currentLength < totalLength) {
            int dashLen= muster[i%muster.length];
            if ((dashLen+currentLength)> totalLength) {
                dashLen = (int) (totalLength - currentLength);
            }
            nextX= (x+ dX * dashLen/totalLength);
            nextY= (y+ dY * dashLen/totalLength);
            currentLength= currentLength+ dashLen;

            if (i%2== 0) {
                Linie teilline = new Linie((int)x, (int) y,(int)nextX, (int) nextY);
                teilline.draw(g);
            }

            x= nextX;
            y= nextY;
            i++;


        }
    }
    @Override public String toString() {
        return super.toString()+ "dashes= "+ Arrays.toString(muster);
    }
}

