/** aufruf scanner funktion*/
import java.util.*;
import java.util.Scanner;
/** aufruf class datei*/
public class Jahreszeit {
    /** aufruf der main methode, lässt eingabe prüfen und verwertet eine
    angemessene eingabe aus*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");       
        while (true) {
            String sday = "Tag";
            String smonth = "Monat";
            String dummy = " ";
            int min = 0;
            int max = 31;
            int prompt = 0; 
            int day = 0;
            int month = 0;
            System.out.print("Tag  (1-31): ");      
            day = ganzzahlInBereichLesen(input, prompt, min, max, sday);
            max = 12;
            System.out.print("Monat (1-12): ");
            month = ganzzahlInBereichLesen(input, prompt, min, max, smonth);
            if ((month == 12 && day >= 21 && day <= 31) || (month == 2 && day < 30)  
                || (month == 1 && day <= 31) || (month == 3 && day <=19)) {
                System.out.println("Winter");
                break;
            } else if ((month == 3 && day >= 20 && day <= 31) || (month == 4 && day <= 30) 
                || (month == 5 && day <= 31) || (month == 6 && day <=20)) {
                System.out.println("Frühling");
                break;
            } else if ((month == 6 && day >= 21 && day <= 30) || (month == 7 && day <= 31) 
                || (month == 8 && day <= 31) || (month == 9 && day <=21)) {
                System.out.println("Sommer");
                break;
            } else if ((month == 9 && day >= 22 && day <= 30) || (month == 10 && day <= 31) 
                || (month == 11 && day <= 30) || (month == 12 && day <=20)) {
                System.out.println("Herbst");
                break;
            } 
            System.out.println("Datum ist ungültig. Wiederholen.");
        }
   
    }
    /** checkt ob die zahl im geforderten bereich ist*/
    public static int ganzzahlInBereichLesen(Scanner input, int prompt, int min, int max, String s) {                  
        while (input.hasNextLine()) {
            int day = ganzzahlLesen(input, prompt, max, s);
            if (day > min && day <= max) {
                prompt = day;
                return prompt;
            } else {
                System.out.println("Nicht im geforderten Bereich.");
                System.out.print(s + " (1-" + max + "): "); 
            }
        }    
        return prompt;
    } 
    /** checkt eingabe auf ganze zahl*/
    public static int ganzzahlLesen(Scanner input, int prompt, int max, String s) {
        
        while (input.hasNextLine()) {
            if (input.hasNextInt()) {
                prompt = input.nextInt();
                return prompt;
            } else {
                input.next();
                System.out.println("Bitte eine ganze Zahl eingeben.");
                System.out.print(s +" (1-" + max +"): ");                
            }
        }
        return prompt;
    }
}
    
            
            
                
        
        
    

        
        
    


    

           

    
        