package abschnitt_3Linie;
import de.hsh.prog.klassedashedline.Loc;

import java.awt.*;

/**
 * u08
 */
public class Linie {
    private Loc p1;
    private Loc p2;

    public Linie(Loc l1, Loc l2) {
        this(l1.getX(), l1.getY(), l2.getX(), l2.getY());
    }

    public Linie(int p1x, int p1y, int p2x, int p2y) {
        this.p1 = new Loc(p1x, p1y);
        this.p2 = new Loc(p2x, p2y);
    }

    public Linie(Linie nl1, boolean toggle) {
        if (toggle) {
            p1 = new Loc(nl1.getP1());
            p2 = new Loc(nl1.getP2());
        } else {
            p1 = nl1.p1;
            p2 = nl1.p2;
        }
    }

    public double getLength() {
        return Math.abs(this.p1.distance(this.p2));
    }

    public Loc getP1() {
        return p1;
    }

    public Loc getP2() {
        return p2;
    }

    public void draw(Graphics g) {
        g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }


    public String toString() {
        return "[" + p1 + "," + p2 + "]";
    }

}

