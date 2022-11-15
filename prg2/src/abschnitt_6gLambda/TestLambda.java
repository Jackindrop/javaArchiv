package abschnitt_6gLambda;

import abschnitt_6Schnitstelle.Circle;
import abschnitt_6Schnitstelle.HasArea;
import abschnitt_6Schnitstelle.Rectangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestLambda {
    public static void main(String[] args) {
        ArrayList<HasArea> list= new ArrayList<>();
        list.add(new Circle(1.0));
        list.add(new Rectangle(1, 1));
        System.out.println("Vorher: "+ list);
            Comparator<HasArea> cmp=
                (a1, a2) -> Double.compare(f(a1.area()),
                        f(a2.area()) );
        Collections.sort(list, cmp);
        System.out.println("nacher: "+ list);
    }
    private static double f(double area) {
        return area+Math.sin(4*area);
    }
}
