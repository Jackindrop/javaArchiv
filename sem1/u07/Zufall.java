import java.util.*;
public class Zufall {
    public static void main(String[] args) {
        Random rand= new Random();
        /** zufallszahl zwischen 4 & 17 ink.
        17-4= 14, +4 für untere grenze */
        int z= rand.nextInt(14) + 4;
        /** zufalls Vocal ausgeben
        mit vocal length als Obergrenze*/
        String text = "AEIOU";
        int y= rand.nextInt(text.length());
        System.out.println("AEIOU".charAt(y));
    }
}
        