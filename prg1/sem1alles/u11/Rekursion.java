public class Rekursion {
    public static void main(String[] args) {
        int wertA= 128;
        int wertB= 12;
        ggt(wertA, wertB);
    }
    public static int ggt(int a, int b) {
        if (b == 0) {
            System.out.println("ggt: " + a);
            return a;
        }
        System.out.println(b);
        return ggt(b, a%b);
    }
}
        