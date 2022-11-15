import java.util.*;
/**
 * Simuliert und zählt Lottoziehungen (6 aus 49), bis die erste
 * Ziehung gefunden wird, die für meinen Tipp N Richtige hat.
 * N kann man verändern.
 */
public class Lotto {
    public static void main(String[] args) {
        int N = 6;
        int richtige;
        int anzahl= 0;
        do {
            HashSet<Integer> meinTipp= new HashSet<>();
            Collections.addAll(meinTipp, 3, 6, 13, 43, 44, 49);
            HashSet<Integer> ziehung = ziehung();
            richtige = lotto(ziehung, meinTipp);
            //System.out.println(richtige);
            anzahl++;
        } while (richtige < N);
        System.out.println(anzahl);
    }
    
    public static HashSet<Integer> ziehung() {
        Random rand= new Random();
        HashSet<Integer> ziehung = new HashSet<>();
        while (ziehung.size() < 6) {
            ziehung.add(rand.nextInt(49)+1);
        }
        return ziehung;
    }
    
    public static int lotto(HashSet<Integer> ziehung, HashSet<Integer> tipp) {
        int anzahl = 0;
        for (int t : tipp) {
            if (ziehung.contains(t)) {
                anzahl++;
            }
            // Alternativ:
            /*for (int z : ziehung) {
                if (t == z) {
                    anzahl++;
                    break;
                }
            }*/
        }
        return anzahl;
    }
}