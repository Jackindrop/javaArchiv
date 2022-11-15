import java.util.*;         // sT 2.b Figuren Zeichnen
public class ST1_2bFigur {
    public static void main(String[] args) {
        System.out.print("Größe der Figur: ");
        Scanner console= new Scanner(System.in);
        int n= console.nextInt();
        int mitte= (n-1)/2;
        int steg;
        if (n%2 != 0) {
            steg= 1;
        } else {
            steg= 2;
        }
        zeichne(mitte, steg);
    }
    public static void zeichne(int mitte, int steg) {
        //obere hälfte
        for (int i= 0; i< mitte; i++) {
            zeichneZeile(mitte, steg, i);
        } // mitte steg waagerecht
        for (int i= 0; i< steg; i++) {
            zeichneZeichen('-', mitte);
            zeichneZeichen('+', steg);
            zeichneZeichen('-', mitte);
            System.out.println();
        }
        for (int i= mitte-1; i>= 0; i--) {
            zeichneZeile(mitte, steg, i);
        }
    }
    public static void zeichneZeile(int mitte, int steg, int n) {
        zeichneZeichen(' ', mitte-n-1);
        System.out.print("#");
        zeichneZeichen('*', n);
        zeichneZeichen('|', steg);
        zeichneZeichen('*', n);
        System.out.println("#");
    }
    public static void zeichneZeichen(char c, int n) {
        for (int i= 1; i<= n; i++) {
            System.out.print(c);
        }
    }
}