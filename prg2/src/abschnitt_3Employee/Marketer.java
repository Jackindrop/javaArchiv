package abschnitt_3Employee;

/**
 * Subklasse
 */
public class Marketer extends Employee {

    public Marketer(int years) {super(years);}

    @Override public double getSalary() {
        return super.getSalary()+ 10000.0;
    }
    public void advertise() {
        System.out.println("Act now while supplies last!");
    }
}
