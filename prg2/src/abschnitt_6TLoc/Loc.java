package abschnitt_6TLoc;

import java.awt.Graphics;

public class Loc implements Comparable<Loc>{
    private int x;
    private int y;

    public Loc(int initialX, int initialY) {
        this.setLocation(initialX, initialY);
    }

    public Loc() {
        this(0, 0);
    }

    public Loc(Loc loc) {
        this.x = loc.x;
        this.y = loc.y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void draw(Graphics g) {
        g.fillOval(this.x, this.y, 3, 3);
        g.drawString("(" + this.x + ", " + this.y + ")", this.x, this.y);
    }

    public void setLocation(int newx, int newy) {
        this.x = newx;
        this.y = newy;
    }

    public void translate(int dx, int dy) {
        this.setLocation(this.x + dx, this.y + dy);
    }

    public double distance(Loc other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt((double)(dx * dx + dy * dy));
    }

    public double distanceFromOrigin() {
        Loc origin = new Loc();
        return this.distance(origin);
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    @Override public boolean equals(Object o){
        if (o!=null && o.getClass()==getClass()) {
            Loc loc = (Loc) o;
            return (x == loc.x && y == loc.y);
        }
        return false;
    }
    @Override public int hashCode() {
        return java.util.Objects.hash(x, y);
    }

    @Override public int compareTo(Loc other) {
        int cmp= Integer.compare(this.getX(), other.getX());
        if (cmp != 0) {
            return cmp;
        }
        return Integer.compare(this.getY(), other.getY());
    }
}
