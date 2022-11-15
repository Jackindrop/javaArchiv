public class BitWieBitter { //Informationen in Dualzahlen
                            //              formulieren
    
    public static final int BLOND= 0;
    public static final int ROT= 1;
    public static final int SCHWARZ= 2;
    public static final int BRUENETT= 3; //default
    public static final int STUDENT= 1<<6; // 00100000
    public static final int LEDIG= 1<<7;   // 01000000
    public static final int WEIBLICH= 1<<8;// 10000000
    
    public static void main(String[] args) {
        int merkmale = encode(49, SCHWARZ, STUDENT | LEDIG);
        // ergebniss code to Dualzahl -> 011   10   1101
                    // Status Haarfarbe Schuggroesse 
        //Status=0 1 1=män Led Std
        System.out.println(merkmale);
        // outprint = 237 = 0 1110 1101
        decode(merkmale);       
    }
    
    public static int encode(int schuhgroesse, int haarfarbe, int status) {
        
        
        int merkmale = schuhgroesse-36; // 000001101
                      //  haarfarbe = 000000010
        merkmale = merkmale | (haarfarbe <<4);// 000101101        merkmale = merkmale | status;
                      // Status = 011
        merkmale = merkmale | status;
                        // merkmale 011101101
        return merkmale;
    }
    
    public static void decode(int merkmale) {
        // Die Bits 0 und 4 enthalten die Schuhgroesse:
        int mask= 15; // 000001111 ersten 4 0 abstreichenzum
        int schuhgroesse= merkmale & mask;  // isolieren
        schuhgroesse += 36; // 000001101  // decodiert
        
        // Die Bits 4 und 5 enthalten die Haarfarbe:
        mask= 3 << 4; // = 000110000
        int haarfarbe= merkmale & mask;
        haarfarbe >>= 4; // vier 0en rechts abstreichen
        
        boolean istStudent= (merkmale & STUDENT) != 0;
        boolean istLedig= (merkmale & LEDIG) != 0;
        boolean istWeiblich= (merkmale & WEIBLICH) != 0;
        
        System.out.println("Schuhgröße " + schuhgroesse);
        
        String f;
        switch (haarfarbe) { // 10
        case BLOND:
            f= "blond"; break; // 00
        case ROT:
            f= "rot"; break;   // 01
        case SCHWARZ: f= "schwarz"; break; // 10
        default:
            f= "brünett"; break;        // 11
        }
        System.out.println(f);
        System.out.println("Student: " + istStudent);
        System.out.println("ledig: " + istLedig);
        System.out.println("weiblich: " + istWeiblich);
    }
}