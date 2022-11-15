
package spielLogik;

public class Spielfeld
{
    // Eigenschaften
    Gebiet[][] feld;


    // Konstruktor
    public Spielfeld(int x, int y) {
        feld = new Gebiet[x][y];
        // Anfangswerte setzen f�r alle 100 Felder
        for (int i=0;i<x;i++){ // senkrecht
            for (int j=0;j<y;j++){ //waagerecht
                feld[j][i]=new Gebiet();
            }
        }
    }

    // Methoden
    public void setzeSchiff(int x, int y) {
        feld[x][y].setzeVorlesung();
    }
    public String schiesse(int x, int y){
        if (feld[x][y].beschiesseFeld()) return "Treffer";
        else return "Daneben";
    }

    public void gibSpielfeldAufKonsoleAus(int x, int y){
        System.out.print("\n  "); // Leerzeile + Beschriftung
        for (int s = 0; s < x; s++) {
            System.out.print(s);
        }
        System.out.println();
        for (int i=0;i<x;i++){
            System.out.print(i+" ");
            for (int j=0;j<y;j++){
                if (feld[j][i].isFeldWurdeBeschossen()) System.out.print("*");
                else {
                    if (feld[j][i].isSchiff()) System.out.print("X");
                    else System.out.print("-");
                }
            }
            System.out.println(); // Zeilenwechsel
        }
    }

} // Ende der Klasse