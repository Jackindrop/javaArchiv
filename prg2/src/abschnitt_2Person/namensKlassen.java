/**
 *
 */
package abschnitt_2Person;

public class namensKlassen {
    public static void main(String[] args) {

        Person p1= new Person();
        System.out.println(p1.getFull());
        System.out.println(p1.getRev());
        System.out.println(p1.getAdresse());

        Person p2= new Person("Felix", "Kroecher");
        System.out.println(p2.getFull());
        System.out.println(p2.getRev());
        System.out.println(p2.getAdresse());

    }
}
