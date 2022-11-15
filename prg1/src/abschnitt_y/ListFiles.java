package abschnitt_y;

import java.io.*;
public class ListFiles {
    public static void main(String[] args) {
        File[] files = listFiles(args[0]); // java ListFiles /home
        for (int i= 0; i < files.length; i++) {
            File f= files[i];
            System.out.print(f.getName());
            if (f.isDirectory()) {
                System.out.println(" (directory)");
            } else {
                System.out.println(" (" + f.length() + " bytes)");
            }
        }
    } // scannt alle datein im pfad und gibt sie zurück
    public static File[] listFiles(String pathName) {
        File path= new File(pathName);
        String[] elements= path.list(); // .list methode
        // 1 Phase
        File[] result= new File[elements.length];
        // 2 Phase
        for (int i= 0; i < result.length; i++) {
            result[i]= new File(pathName + "/" + elements[i]);
        }
        return result;
    }
}
