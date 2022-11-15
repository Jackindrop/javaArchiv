package abschnitt_6gSort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
public class COMPanonym {
    public static void main(String[] args) {
        //g.ii
        // Client
        ArrayList<Person> lP= new ArrayList<Person>();
        Collections.addAll(lP,
                new Person("Frieda", 41),
                new Person("Gerd", 44),
                new Person("Mona", 23),
                new Person("Albert", 43));
        System.out.println(lP);

        Comparator cmp= new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                //Achtung: das Alter von b wird als erster Parameter
                // weiter gereicht! Dadurch umgekehrte Sortierung
                return Integer.compare(b.getAlter(), a.getAlter());
            }
        };

        Collections.sort(lP, cmp);


        System.out.println(lP);
    }
}
