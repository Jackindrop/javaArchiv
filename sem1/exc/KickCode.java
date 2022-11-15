import java.io.*;
import java.util.*;
public class KickCode {

    public static void main(String[] args) {
       
        System.out.println("wdtl?");
        String pwd= getDir();
        
        
        
        // Creates an array in which we will store the names of files and directories
        String[] pathnames;

        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname
        File f = new File("/home/marius/PRuebungen/exc");

        // Populates the array with names of files and directories
        pathnames = f.list();

        // For each pathname in the pathnames array
        for (String pathname : pathnames) {
            // Print the names of files and directories
            System.out.println(pathname);
        }
    }
    
    public static String getDir() {
        Scanner input= new Scanner(System.in);
        String pwd= "";
        try { 
            pwd+= input.next();
        } catch (Exception e) {
            System.out.println("Alarm -> getDir()");
        
        }
        return pwd;
    }
}

