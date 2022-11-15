package abschnitt_6gSort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.lang.System.out;

/**
 * 6.g.i Comparator
 * Implementieren Sie eine Comparator-Klasse für die lexikographische
 * Sortierung von Loc-Objekten. Diese ist wie folgt definiert:
 *
 * a < b		genau dann wenn a.x < b.x oder (a.x = b.x und a.y < b.y)
 * a = b		genau dann, wenn a.x = b.x und a.y = b.y
 * a > b		sonst
 * 6.g.ii Comparator
 * Gegeben sei die rechts abgebildete Klasse Person. Implementieren Sie im
 * unten dargestellten Client-Programm eine anonyme Subklasse von Comparator<Person>,
 * die eine Sortierung nach absteigendem Alter ermöglicht.
 */
public class COMPlocale {
    public static void main(String[] args) {
        //g.ii
        // Client
        ArrayList<Person> lP= new ArrayList<Person>();
        Collections.addAll(lP,
                new Person("Frieda", 41),
                new Person("Gerd", 44),
                new Person("Mona", 23),
                new Person("Albert", 43));
        out.println(lP);

        // TODO: sortieren mit lokaler Comparator-Subklasse
        //   Collections.sort(list, ...);
        class MyLocaleComp implements Comparator<Person> {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAlter(), p2.getAlter());
            }
        }
        Collections.sort(lP, new MyLocaleComp());
        System.out.println(lP);
    }
}
