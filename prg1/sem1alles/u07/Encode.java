public class Encode {
    public static void main(String[] args) {
        encode("Hallo");
        decode("Ibmmp");
    }
    public static String encode(String en) {
        char[] chars = en.toCharArray();
        String s = "";
        for (int i = 0; i <= chars.length - 1; i++) {
            char temp = (char)(((int)chars[i]) + 1);
            s = s + temp;
        }
        System.out.println(s);
        return s;
    }
    public static String decode(String en) {
        char[] chars = en.toCharArray();
        String s = "";
        for (int i = 0; i <= chars.length - 1; i++) {
            char temp = (char)(((int)chars[i]) -1);
            s = s + temp;
        }
        System.out.println(s);
        return s;
    }
}