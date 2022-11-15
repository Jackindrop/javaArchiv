import java.util.*;
public class Sentinel {
    public static final int SENTINEL = -1;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int inputNumber = readNumber(console);
        while (inputNumber != SENTINEL) {
            sum += inputNumber*inputNumber;
            System.out.println("Sum of squares: "+sum);
            inputNumber = readNumber(console);
        }
        System.out.println("Total sum of squares: "+sum);
    }
    public static int readNumber(Scanner console) {
        System.out.print("Enter a number (-1 to quit): ");
        return console.nextInt();
    }
}
