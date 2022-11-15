import java.util.*;         
public class ST1_2dCollatz { // 2.e / 2.f
    public static final int intMaxValue= 2147483647; // called by 2f
    public static void main(String[] args) {
        System.out.print("Startwert: ");
        Scanner console= new Scanner(System.in);
        int n= console.nextInt();
        System.out.println(pfadLänge(n));//___ 2d
        
        int pfadMax= pfadMax(n);
        System.out.println("Maximale Pfadlänge für Startwert "+
            pfadMax+": "+pfadLänge(pfadMax)); //____ 2e
        
    }
    public static int pfadMax(int n) { // 2e
        int nmax= n;
        int pmax= pfadLänge(n);
        for (int i= 1; i< n; i++) {
            int temp= pfadLänge(i);
            if (temp > pmax) {
                pmax= temp;
                nmax= i;
            }
        }
        return nmax;
    }
    public static int pfadLänge(int n) { // 2d
        int pfad= 1;
        while (n != 4) {
            n= collatz(n);
            pfad++;
        }
        return pfad;
    }
    public static int collatz(int n) { // 2d
        if (n > (intMaxValue/3)) { //-----------------------------------
            throw new ArithmeticException("int overflow "+n); //-----2.f
        } //------------------------------------------------------------
        if (n%2 != 0) {
            return 3*n+1;
        } else {
            return n/2;
        }
    }
}