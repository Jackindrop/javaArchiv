package abschnitt_3meteredLoc.abschnitt_3mHatten;

public class MeteredLoc extends Loc {

    private double totalDistance;

    public MeteredLoc(int x, int y) {
        super(x, y);
        totalDistance= 0.0;
    }

    public double getTotalDistance() {return totalDistance;}

    @Override public void setLocation(int x, int y) {
        totalDistance += distance(new Loc(x,y));
        super.setLocation(x, y);
    }
}
