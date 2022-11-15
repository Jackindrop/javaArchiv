package RunAlgoMain;
/**
 * -------------->Int.Array= {31,-42,59,26,-53,58,97,-23,84}
 *
 * a) write Brute-Force Algorithmus, measure runtime.
 * b) write method which generate n randomNumbers from
 * 	  [-1000,1000]. Feed Algo. from a) with bigger Arrays!
 *    create list with different Array.size's and runTime's.
 * c)Try to find a function who explain the behavior of your
 *   Measurements. (Polynom)
 * @author marius
 *
 */
public class Teilsumme {
    //---------------------------------------> worst case algo.
    public static void runBruteForce(int n) {

        int[] numArr= ArrayPacker.nNumbers(n);
        int curStart= 0;
        int curEnd= numArr.length;
        int curSum= Integer.MIN_VALUE;
        //Aktueller Startindex ist i
        for (int i= 0; i< numArr.length; i++) {
            //Aktueller Endindex ist j
            for (int j=i; j< numArr.length; j++) {
                //Berechnung der Teilsumme i … j
                int tmpSum= 0;
                for (int k=i; k<= j; k++) {
                    tmpSum += numArr[k];
                }
                //Vergleiche mit temp.Max
                if (tmpSum> curSum) {
                    //neues Max gefunden
                    curSum= tmpSum;
                    curStart= i;
                    curEnd= j;

                } // if
            } // for j
        } // for i
    }
    //---------------------------------------> average case algo.
    public static void runOptimusBruteForce(int n) {

        int[] numArr= ArrayPacker.nNumbers(n);
        int curStart= 0;
        int curEnd= numArr.length;
        int curSum= Integer.MIN_VALUE;
        //Aktueller Startindex ist i
        for (int i= 0; i< numArr.length; i++) {
            //Aktueller Endindex ist j-----------------
            int tmpSum= 0;						    //kleine
            for (int j=i; j< numArr.length; j++) { //äderung
                //Berechnung der Teilsumme i … j  //1000x !!
                tmpSum += numArr[j];	      	 //schneller
                //---------------------------------
                //Vergleiche mit temp.Max
                if (tmpSum> curSum) {
                    //neues Max gefunden
                    curSum= tmpSum;
                    curStart= i;
                    curEnd= numArr[j];

                } // if
            } // for j
        } // for i
    }
}
