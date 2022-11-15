import java.util.*;         
public class ST1_2cEncode {
    public static void main(String[] args) {
        System.out.println(encode("BodenSee"));
        System.out.println(encode(encode("BodenSee")));
    }
    public static String encode(String s) {
        String result= "";
        for (int i= 0; i<= s.length()-1; i++) {
            result= result + ((char) ('A'+('Z'- s.charAt(i))));
        }
        
        return result;
    }
}