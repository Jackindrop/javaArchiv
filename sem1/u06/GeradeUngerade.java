import java.util.Scanner;
public class GeradeUngerade {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Bitte Zahl eingeben: ");
        int zahl= scanner.nextInt();

        if ( zahl % 2 == 0) {
            System.out.println("Ihre Zahl ist gerade");
        } else {
            System.out.println("Ihre Zahl ist ungerade");
        }

    }
}