package RunAlgoMain;

import java.util.Random;

/**
 * class build an n-length int.Array
 * from min.val -1000 to max.val 1000
 */
public class ArrayPacker {

    public static int[] nNumbers(int n) {
        int[] result= new int[n];
        for (int s= 0; s< result.length; s++) {
            result[s]= randomNumber(); //init. Array
        }							  // with Values
        return result;
    }

    public static int randomNumber() {
        Random rand= new Random(); // kann nur pos.int.werte ausgeben
        int numb= rand.nextInt(11)+ 0;
        double pol= Math.random();// zufalls double 0.0-1.0
        if (pol<= 0.5) {		// 50/50 ob next.rand.Number + oder -
            numb= numb* -1;
        }
        return numb;
    }
    // UNUSED
    public static void testRandNumber(int n) {
        int min= -1000, max= 1000, getTop= 0, getBot= 0;

        for (int s=1; s<= n; s++) {
            int tmpNumb= randomNumber();
            if (tmpNumb== min) {
                getBot++;
            }
            if (tmpNumb== max) {
                getTop++;
            }
        }
        System.out.println("get "+ getTop+ " x biggest value");
        System.out.println("get "+ getBot+ " x lowest value");
    }

}