import java.util.*;         
public class ST1_2hZuschlag {
    public static void main(String[] args) {
        System.out.println(zuschlag(100.0, "H4"));
        System.out.println(zuschlag(85.3, "N"));
        System.out.println(zuschlag(101.0, "N"));
        System.out.println(zuschlag(60.32, "H2"));
        System.out.println(zuschlag(110.5, "A2"));
        System.out.println(zuschlag(95.4, "A3"));
        System.out.println(zuschlag(195.4, "A3"));
        
        System.out.println(zuschlag2(100.0, "H4"));
        System.out.println(zuschlag2(85.3, "N"));
        System.out.println(zuschlag2(101.0, "N"));
        System.out.println(zuschlag2(60.32, "H2"));
        System.out.println(zuschlag2(110.5, "A2"));
        System.out.println(zuschlag2(95.4, "A3"));
        System.out.println(zuschlag2(195.4, "A3"));
    }
    public static double zuschlag(double fahrpreis, String strecke) {
        if (fahrpreis >= 100.0) return 0.0;
        char art= strecke.charAt(0);
        if (art == 'H') {
            return fahrpreis * 0.2;
        }
        if (art == 'N') {
            return 0.0;
        }
        // Ausweichstrecke:
        char klasse= strecke.charAt(1);
        if (klasse>='3') {
            return 5.0;
        }
        return 0.0;
        }
        public static double zuschlag2(double preis, String tarif) {
        if (preis >= 100.0) {
            return 0.0;
        } else if (tarif.charAt(0)== 'H') {
            return preis*0.2;
        } else if (tarif.charAt(0)== 'A' && tarif.charAt(1)>= '3') {
            return 5.0;
        }
        return 0.0;
    }
}