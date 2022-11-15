public class Quadrat {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int x = i*i;
            if (x <= 6000) {
            System.out.println(x);
            } else if (x >= 8000) {
                System.out.println(x);
            }
        }
    }
}