public class ForWhile {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " squared = " + (i * i));
        }
        int x = 1;
        while (x <= 10) {
            System.out.println(x + " squared = " + (x * x));
            x++;
        }
    }
}