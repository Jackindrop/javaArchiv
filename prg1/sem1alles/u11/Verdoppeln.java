/**import für ArrayList funktion*/
import java.util.*;
/**aufrug der klassen datei*/
public class Verdoppeln { 
    /**aufruf der main methode, erstellt und übergibt
    die geforderte ArrayList*/
    public static void main(String[] args) {        
        ArrayList<String> names= new ArrayList<String>();
        Collections.addAll(names, "Ich", "studiere", "in", "Hannover");
        System.out.println("Vorher: " + names);
        verdoppeln(names);
        System.out.print("Nacher: " + names);
    }
    /**methode verdoppelt elemente und ordnet sie hinter-
    einander an*/
    public static void verdoppeln(ArrayList<String> names) {
        for (int i= names.size()-1; i >= 0; i--) {       
            names.add(i+1, names.get(i));
        }
    }
}
            
                