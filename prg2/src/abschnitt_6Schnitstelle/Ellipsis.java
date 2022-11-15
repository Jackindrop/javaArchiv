package abschnitt_6Schnitstelle;

public class Ellipsis extends Shape implements ConicSection {
    private double a, b;
    public Ellipsis(double a, double b) {
        this.a= a;
        this.b= b;
    }
    @Override public String toString() {
        return "Ellipsis";
    }
    @Override public double area() {
        return Math.PI*(this.a+this.b);
    }

    @Override public double perimeter() {
        return Math.PI*this.a*this.b;
    }

    @Override public String getConicType() {
        return null;
    }
}
