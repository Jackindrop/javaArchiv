public class Drawbox {
    
    public static void main(String[] args) {
        drawBox(4, 1);
    }
    
    public static void drawBox (int breite, int höhe) {
        for (int i = 1; i <= breite; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int d = 1; d <= höhe; d++) {
            spaces(breite);
        }
        for (int i = 1; i <= breite; i++) {
            System.out.print("*");
        }
        System.out.println();
        }
        
        public static void spaces(int breite) {
            System.out.print("*");
            for (int y = 1; y <= breite -2; y++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
}