package abschnitt_6gSort;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.out;

public class COMPmethodenkopfCompareTo{
        private String name;
        private int alter;

        public COMPmethodenkopfCompareTo(String name, int alter) {
            this.name = name;
            this.alter = alter;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAlter() {
            return alter;
        }
        public void setAlter(int alter) {
            this.alter = alter;
        }
        @Override public String toString() {
            return name + " (" + alter + ")";
        }

        public static void main(String[] args) {
            ArrayList<Person> lP= new ArrayList<Person>();
            Collections.addAll(lP,
                    new Person("Frieda", 41),
                    new Person("Gerd", 44),
                    new Person("Mona", 23),
                    new Person("Albert", 43));
            out.println(lP);
            /**
             * folgende C.sort methode stützt sich auf compareTo implewmentierung in
             * der Klasse TLoc
             */
            Collections.sort(lP);
            out.println(lP);

        }
    }