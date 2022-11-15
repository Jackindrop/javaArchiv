package abschnitt_6Schnitstelle;

public abstract class Shape implements HasArea{
    public double compactness() {
        double peri= perimeter();
        return (4.0*Math.PI*area()/peri*peri);
    }
    public abstract double perimeter();
    @Override public abstract double area();
}
