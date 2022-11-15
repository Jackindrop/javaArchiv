public class VierQuadrate1 {
    public static final int SIZE = 3;
    public static void main(String[] args) {
        drawL();
        drawM();
        drawL();
        drawM();
        drawL();
    }  
    public static void drawL() {
        for (int a = 1; a <= (SIZE+1); a++) {
            System.out.print("=");
        }
        System.out.print("+");
        for (int a = 1; a <= (SIZE+1); a++) {
            System.out.print("=");
        }
        System.out.println();
    }
    public static void drawM() {
        for (int c = 1; c <= SIZE; c++) {
            System.out.print("#");
            for (int d = 1; d <= SIZE; d++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int d = 1; d <= SIZE; d++) {
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();
        }
    }
}
            
        
    

   