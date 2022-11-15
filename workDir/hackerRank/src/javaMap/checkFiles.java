package javaMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class checkFiles {
    private File rightReso;
    private File myReso;
    private int diff; // if negativ are files missing in my result, 0 if correct

    public checkFiles(File gR, File mR) throws FileNotFoundException {
        rightReso= gR;
        myReso= mR;

        aufUnterschiede();
    }

    public void aufUnterschiede() throws FileNotFoundException {
        Scanner gRes= new Scanner(rightReso);
        Scanner mRes= new Scanner(myReso);
        sameLengths();
        int row= 1;
        if (diff == 0) {
            while (gRes.hasNextLine()) {
                String tmpG= gRes.nextLine(), tmpM= mRes.nextLine();
                if (!tmpG.equals(tmpM)) {
                    System.out.println("Fehler Zeile "+ row);
                    System.out.println("Sollte sein: "+ tmpG);
                    System.out.println(" ist aber :     "+ tmpM);
                    row++;
                } else { row++; }
            }
        }
    }

    public void sameLengths() {
        if (rightReso.length()==  myReso.length()) {
            this.diff= 0;
        } else if (rightReso.length()>  myReso.length()) {
            this.diff= (int) (rightReso.length()-  myReso.length())*-1;
            System.out.println("Fehler diff= "+ diff);
        }
        else if (rightReso.length()>  myReso.length()) {
            this.diff= (int) (myReso.length()-  rightReso.length());
            System.out.println("Fehler diff= "+ diff);
        }
    }

}
