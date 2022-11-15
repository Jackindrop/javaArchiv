import java.io.*;
import java.util.*;
public class AddTextToFile {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        PrintStream output = null;
        Scanner input = null;
        
        String eingabeDatei = null;
        
        do {
            System.out.println("im in");
            System.out.print("Dateiname? : ");
            eingabeDatei = console.nextLine();
            System.out.println(eingabeDatei);
            try {
                input = openFile(eingabeDatei);
            } catch (FileNotFoundException e) {
                System.out.println("Datei nicht gefunden");
            }
        }while (input == null);    
            System.out.println("anzuhängender Text: ");
            String line = console.nextLine();
            try{
                 output= new PrintStream(
                new FileOutputStream(
                    new File(eingabeDatei),
                    true));
                 output.println(line);
                 System.out.println(line);
                System.out.println("done");
            }catch(FileNotFoundException e){
                System.out.println("ex1");
        }
    }
    
                
    public static Scanner openFile(String nameInput) throws FileNotFoundException {
        return openFile2(new File(nameInput));
    }              
            
    public static Scanner openFile2(File file) throws FileNotFoundException {
        return new Scanner(file);
    }
}
 