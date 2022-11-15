/** import macht Scanner Objekt nutzbar */
import java.util.*;
/** Aufruf der Class-Datei */
public class Teiler {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Ganze Zahl eingeben: ");
        int nummer = console.nextInt();
        System.out.println("Summe ganzzahliger Teiler: "+countFactors(nummer));
    }
    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n/2; i++) {
            System.out.println("durchlauf "+i);
            if (n % i == 0) {
                count++;
                System.out.println("Teiler "+count);
            }
        }
        count ++;
        return count;
    }
}