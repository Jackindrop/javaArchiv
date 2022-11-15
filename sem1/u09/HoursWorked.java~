import java.io.*; // andere Exception
import java.util.*; // try catch
public class HoursWorked {   
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        Scanner input = null; // referenz für kein objekt
       
        do { //-----------------------------------------------
            System.out.print("Dateiname: "); // kürzester weg, alle eingaben
            String nameInput = console.nextLine(); // abzufangen
            try { //++++++++++++++++++++++++++++++++++++++++++
                input = openFile(nameInput); //++++++++++++++++++++++++++++++++++
            } catch (FileNotFoundException e) { //++++++++++++
                System.out.println("Datei nicht gefunden");
            }
        } while (input == null); //----------------------------
        
        while (input.hasNextLine()) {
            String line = input.nextLine();
            processLine(line);
        }
        input.close();
    }
    // standard methode von eingabe um exceptions abzufangen +++++++++++++++
    public static Scanner openFile(String nameInput) throws FileNotFoundException {
        return openFile2(new File(nameInput)); // vom nutzer eingegebene gesuchte 
    }
    
    public static Scanner openFile2(File file) throws FileNotFoundException {
        return new Scanner(file); // reagiert bei vorhandener <datei>.txt
    }
    public static void processLine(String line) {
        Scanner lineScan = new Scanner(line);
        lineScan.useLocale(new Locale("en", "US"));
        int nr = lineScan.nextInt();
        String name = lineScan.next();
        System.out.print(name + " (Nr. " + nr + ") arbeitete ");
        processHours(lineScan);
        lineScan.close();
    }  
    public static void processHours(Scanner lineScan) {
        double sum = 0.0;
        int count = 0;
        while (lineScan.hasNextDouble()) {
            sum += lineScan.nextDouble();
            count++;
        }
        double average = sum / count;
        System.out.println(sum + " Stunden (" + average + " Std/Tage) " );
    }
    public static Scanner getScanner() throws FileNotFoundException {
        Scanner datei = new Scanner(new File("dataEx.txt"));
        return datei;
    }
}