package mainStat;

public class u01 {
    /**
     * start uebung_1
     * -methode nimmt Dateinamen der Messwerte entgegen und
     *  wertet diese zuerst aus.
     *
     *  Dann wird über die Console die enstprechende Darstellungs-
     *  form ausgewählt & ausgegeben.
     *
     * @author mariusG.
     * @param baseName Name of File with Int split by ' '
     */
    public static void menueU01(String baseName) {
        getValues.getArrays(baseName);
        statistikMenue.run();
    }
}

