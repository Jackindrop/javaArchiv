import java.util.*;
public class ST2_2mRandomElementEinerMenge {          
    public static final int[] VALUES= {0, 1, 2, 3, 4, 5, 6, 7, 8 , 9};
    public static final int[] VALUESCount= {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    // methode soll "zufälliges" Element von Set zurück geben
    // jedes Element soll gleiche Chance haben (rem. Set keine sor.)
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<Integer>();
        Collections.addAll(set, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        for (int i= 0; i<= 10000; i++) {
            int temp= randomIntSet(set);
            
            for (int k= 0; k< VALUES.length; k++) {
                if (VALUES[i] == temp) {
                    VALUESCount[i]++;
                }
            }
        }
    }
    //
    public static Integer randomIntSet(Set<Integer> set) {
        int index= new Random().nextInt(set.size());
        int i= 0;
        
        for (Integer iobj : set) {
            if (i == index) {
                return iobj;
            }
            i++;
        }
        return null; // never executed
    }
}