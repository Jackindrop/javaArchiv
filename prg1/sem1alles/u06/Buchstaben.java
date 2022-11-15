import java.util.Scanner;
public class Buchstaben {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Bitte Wort eingeben: ");
        String s= scanner.next();

        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                x++;
            }
        }
        System.out.println("Buchstaben: "+x);
    }
}