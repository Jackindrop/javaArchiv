import java.io.*; 
import java.util.*;
public class ContinueState {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number= 0;   // code liest zahlen ein und gibt
         int summe= 0;   // die durch 5 teilbare summe 
        int summe= 0;   // summe seiner eingabe aus
        
        while(input.hasNextLine()) {
            int inputInt= ganzZahl(input, number);
            if (inputInt != -1) { //-1 abbruchbedingung 
                if (inputInt % 5   == 0) { // nimmt kandidaten 
                    summe = summe + inputInt; // in summe auf
                    continue;   // kp..
                }
            } else  // wenn -1 dann
            break;  // abbruch
        }
        System.out.println("Summe: "+summe);
    } // methode liest ganze Zahlen ein 
    public static int ganzZahl(Scanner input, int prompt) {
        while (input.hasNextLine()) {
            if (input.hasNextInt()) {
                prompt = input.nextInt();
                return prompt;
            } else 
                input.next();
                System.out.println("Bitte ganze Zahl eingeben.");              
            }
            return prompt;
        }
    }


            
            