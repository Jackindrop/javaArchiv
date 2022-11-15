import java.util.*; //vergleicht ob zwei strings gleiche zeichen
public class ArrayOne { // enthalten und gibt boolean aus
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] array= {"77", "28", "12", "43", "57"}
        System.out.print("String 1: ");
        String eingabe1 = console.nextLine();
        System.out.print("String 2: ");
        String eingabe2 = console.nextLine();
        System.out.println(areAnagrams(eingabe1, eingabe2));
        console.close();
    }
    public static boolean areAnagrams(String zeile1, String zeile2) {
        char[] zeile11 = zeile1.toCharArray();
        char[] zeile22 = zeile2.toCharArray();
        Arrays.sort(zeile11);
        Arrays.sort(zeile22);
        boolean result = Arrays.equals(zeile11, zeile22);
        return result;
    }
}
        