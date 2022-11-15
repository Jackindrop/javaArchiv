import java.util.*;         // sT 2.a Protokoll
public class SelbstTest1 {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        int kaWe= intIn(console);
        while (kaWe< 1 || 52< kaWe) {    
            System.out.println("Falsche KW");
            kaWe= intIn(console);
        }
        int person= kaWe%5 + 1;
        System.out.println("Person P" + person);
    }
    public static int intIn(Scanner console) {
        System.out.println("KW? ");
        return console.nextInt();
    }
}