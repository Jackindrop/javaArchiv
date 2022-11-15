package abschnitt_2Formatter;

public class check {

    public static boolean checkData(int t, int m, int j) {

        if ((m> 0 & m< 13)) {
            if (t > 28 & m == 2) {
                return false;
            }
        }
            if (((t > 0 & t < 32)& (m %2 != 0)) ||
                    ((t > 0 & t < 31)& (m %2 == 0))) {
                if (j > 1900) {
                    return true;
                }
            }


        return false;
    }
}
