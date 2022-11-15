package abschnitt_6TLoc;

import java.util.Set;

public class Client {
    /** Gibt true auf der Console aus, wenn loc in s enthalten ist */
    public static void test(Loc loc, Set<Loc> s) {
        System.out.println(s.contains(loc));
    }

    public static void main(String[] args) {
        Loc loc= new Loc(5, 15);
        Loc l2 = new Loc(15, 5);

        System.out.println(loc.equals(l2));
        l2.setLocation(5, 15);
        System.out.println(loc.equals(l2));

        TLoc loc3= new TLoc(12, 7, "text");
        Loc loc2= new Loc(12, 7);
        System.out.println(loc3.equals(loc2)); // false
        System.out.println(loc2.equals(loc3)); // true
    }
}
