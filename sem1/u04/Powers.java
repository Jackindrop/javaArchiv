public class Powers {
    public static final double FACTOR= 2.0;
    public static final int EXPONENT= 4;
    public static void main(String[] args) {
        double product= FACTOR;
        System.out.print(product);
        for (int i=2; i <= EXPONENT; i++) {
            product *= FACTOR;
            System.out.print(", " + product);
        }
        System.out.println();
    }
} 