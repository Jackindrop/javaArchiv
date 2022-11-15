package u30_FX_SuchDialog;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Klasser dient der Aufbereitung eines elementaren
 * .txt_Files welches nachlässig editiert wurde,
 * alle Umlaute sind mit spez.charatern vertauscht.
 * Gklücklicherweise immer der selbe ---------------->>>"�"
 */

public class TXTcleaner {
    public static File f;

    /**
     * übergebe Scanner und zwei Dateinamen
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        File clean = new File("ggClean.txt");
        cleaner(input, clean, "gg.txt");
    }

    /**
     * cleaner feed the new File with the correct Text.
     * @param input
     * @param f
     * @param destFile
     */
    public static void cleaner(Scanner input, File f, String destFile) {
        OutputStream oS= null;
        try {
            oS = new FileOutputStream(f.getName());
            PrintStream printSTR = new PrintStream(oS);
            input = new Scanner(new File(destFile));
            while (input.hasNextLine()) {
                String[] e= input.nextLine().split("�");
                String s = String.join("_", e);
                printSTR.print(s);
            }
        } catch (Exception e) {
            out.println(".printer() ERR \n"+e.getMessage());
        }
    }


}
