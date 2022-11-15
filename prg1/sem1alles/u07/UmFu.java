public class UmFu {
    public static void main(String[] args) {
        int x = 1;
        while (f(x) < 100) {
            x++;
    }
    System.out.println(x);
    }
    public static double f(double x) {
        return 4.3*x*x - 5.2*x + 10.1;
    }
}