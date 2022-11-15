package probeKlausur;

public class Main {
    public static void main(String[] args) {
        checkBitCasting();
        Shift2 s2= new Shift2();
        System.out.println(s2.halb(21));
/**
        Calculator[] arr= { new Div2(), new Shift2(), new Decrementer() };
        for (Calculator c : arr) {
            System.out.println(c.type());
        }
*/
    }

    public static void checkBitCasting() {
        int i= 21;
        String s = "10101";
        int ii = Integer.parseInt(s);
        int iii = Integer.parseInt("10101", 2);

        System.out.println("i= " + i + "\ns= " + s +
                "\nii= " + ii + "\niii= " + iii);
    }
}
