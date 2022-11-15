package u17;
import java.io.File;
import java.io.FileInputStream;

/**
 * Class to analyze and identify file
 * as ZipArchive.
 */
public class DetectZip {
    public static void main(String[] args) {
        if (args.length== 1) {
            validation(args[0]);
        } else {
            System.out.println("error");
        }
    }
    /**
     * Identify file over Pathname and call
     * second method to analyze file as ZipArchive
     * @param s= filename, -path
     * @return True if s is an existing File
     */
    public static boolean validation(String s) {
        try {
            if(!new File(s).exists() && new File(s).isDirectory()) { return false;}
            if (istZip(new FileInputStream(s))) {
                System.out.println("zip");
            } else {
                System.out.println("no zip");
            }
        } catch (Exception e) {
            System.out.println("error");
        }
        return false;
    }

    /**
     *Method gets and analyze the first two bits of fis,
     * ZipArchiv Byte Code have always the same.
     * Catch some spezific Files with equal bytecode start.
     *Byte 1= 50/hex= 80/dec
     *Byte 2= 4B/hex= 75/dec
     * @param fIn
     * @return
     */
    public static boolean istZip(FileInputStream fIn) {
        byte[] bytes = new byte[2];
        try {
            while(fIn.read(bytes) != 2) {}
                return (bytes[0]== 80 && bytes[1]== 75) ;
        } catch (Exception e) {}
        return false;
    }
}

