package abschnitt_6u20;

public class U20MAIN {
    public static void main(String[] args) {
        Bruch b= new Bruch(3, 4);
        Bruch bb= new Bruch(6, 8);
        System.out.println(b.zahl());
        System.out.println(bb.zahl());
        System.out.println(b.equals(bb));
    }
}
