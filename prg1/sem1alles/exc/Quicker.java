import java.io.*;
import java.util.*;
public class Quicker {

    public static void main(String[] args) {
        int ref= 0;
        boolean onOff= true;
        File qkTempTxt= new File("qkTempTxt.txt");
        String fileP= qkTempTxt.getAbsolutePath();
        System.out.println("wdtl?");
        String pwd= "/home/PRuebungen" + getDir();
        System.out.println(pwd);
        lookDir(pwd);
        runTerminal();

        
        }
    
    
    public static void lookDir(String s) { // ohne filter 
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
    
    public static void runTerminal() {
        
        
     /**    Runtime runtime = Runtime.getRuntime();     //getting Runtime object
        try
        {
            //OR runtime.exec("notepad.exe");        //opens new notepad instance
            runtime.exec("gnome-terminal test");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } */
    }
    
    public static String getDir() {
        Scanner input= new Scanner(System.in);
        String pwd= "";
        try { 
            pwd+= input.next();
        } catch (Exception e) {
            System.out.println("Alarm -> getDir()");
            
        } finally {
            input.close();
        }
        input.close();
        return pwd;
    }
}

