package abschnitt_6Schnitstelle;

public class Rectangle extends Shape {
    private double width;
    private double height;
    /** Constructs a new rectangle with the given dimensions. */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override public String toString() {
        return "Rectangle";
    }
    /** Returns the area of this rectangle. */
    public double area() {
        return width * height;
    }
    /** Returns the perimeter of this rectangle. */
    public double perimeter() {
        return 2.0 * (width + height);
    }
}