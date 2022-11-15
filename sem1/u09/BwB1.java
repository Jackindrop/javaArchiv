/** Übungsaufgabe L.5.6.7 
Schreiben Sie eine Methode getBit, die für eine 
gegebene ganze Zahl und eine gegebene
Bit-Position prüft, ob an dieser Stelle in der 
Dualdarstellung der Zahl eine 0 oder 1 vorliegt. */
public class BwB1 {
    public static void main(String[] args) {
        int fHase = 546; // 0000...1 0000
        int bitPos = 4;        
        System.out.println(getBit(fHase, bitPos));//true
        getBiteCode(fHase);

    } 
    //prüft ob an bitposition von fHase 1 oder 0 vorliegt
    public static boolean getBit(int zahl, int pos) {
        int mask= (1<<pos);
        return ((zahl & mask) != 0);
    }
    //schreib dualzahl von Dezimalzahl ausgabe 32 -Bit
    public static void getBiteCode(int fHase) {
        for (int pos= 31; pos >= 0; pos--) {
            boolean bit = getBit(fHase, pos);
            if (bit) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
    }
}


    