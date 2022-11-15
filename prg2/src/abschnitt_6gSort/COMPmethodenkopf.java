package abschnitt_6gSort;

import abschnitt_6TLoc.Loc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class COMPmethodenkopf implements Comparator<Loc> {
    @Override public int compare(Loc l1, Loc l2) {
        if (l1.getX() < l2.getX())
            return -1;
        if (l1.getY() > l2.getY())
            return 1;
        if (l1.getY() < l2.getY())
            return 1;
        if (l1.getY() > l2.getY())
            return 1;
        return 0;
    }
    public static void main(String[] args) {
    //g.i
    ArrayList<Loc> lL= new ArrayList<Loc>();
        Collections.addAll(lL, new Loc(6,5),
                new Loc(2, 7),
                new Loc(4,2));
        System.out.println("before sort,              list= "+ lL);

        Collections.sort(lL, new COMPmethodenkopf());
        System.out.println("after lexicographic-sort, list= "+ lL);
        /**
         * out:
         * before sort,              list= [(6, 5), (2, 7), (4, 2)]
         * after lexicographic-sort, list= [(2, 7), (4, 2), (6, 5)]
         */
    }
}
