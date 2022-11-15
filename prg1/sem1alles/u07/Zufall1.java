public class Zufall1 {
    public static void main(String[] args) {
        int zahl = 91;
        int kandidat = 2;
        while (zahl % kandidat != 0) {
            kandidat++;
        }
        System.out.println("Erster Teiler: "+kandidat);
    }
}
        