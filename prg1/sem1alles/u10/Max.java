/** aufruf der Scanner methode*/
import java.util.*;
/** aufruf der klassen datei*/
public class Max {
    /**aufruf der main methode welche genau 3
    ganze Zahlen auswertet und Fehler meldet bei 
    falschem Datantyp oder Anzahl der Parameter*/
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner input = new Scanner(args[0]+" "+args[1]+" "+args[2]);
            int max = -9000;
            int numb1= input.nextInt();
            int numb2= input.nextInt();
            int numb3= input.nextInt();
            input.close();
            if (numb1 > max) {
                max = numb1;
            }
            if (numb2 > max) {
                max = numb2;
            }
            if (numb3 > max) {
                max = numb3;
            }
            if (args.length == 3) {
                System.out.println("Maximum: " + max);
            } else {
                System.out.println("Bitte genau 3 Parameter angeben");     
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bitte genau 3 Parameter angeben");
        } catch (InputMismatchException e) {
            System.out.println("Ungültige Parameter");
        }
    }
}
