/** Der Graphic code nummer 1 */
public class Graphic { 
    /** para-meth. für spaces */
    public static void sp(int s) { 
        for (int i = 1; i <= s; i++) {
            System.out.print(" ");
        }
    }
    /**Code für Grafik*/
    public static void main(String[] args) { 
        sp(2);
        for (int x = 1; x <= 7; x++) {
            System.out.print("_");
        }
        System.out.println();
        sp(1);
        System.out.print("/");
        sp(7);
        System.out.print("\\");
        System.out.println();
        System.out.print("/");
        sp(9);
        System.out.print("\\");
        System.out.println();
        System.out.println("-\"-'-\"-'-\"-");
        System.out.print("\\");
        sp(9);
        System.out.print("/");
        System.out.println();
        sp(1);
        System.out.print("\\");
        for (int x = 1; x <= 7; x++) {
            System.out.print("_");
        }
        System.out.print("/");
        System.out.println();
    }
}
            
        
