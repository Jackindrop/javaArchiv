package abschnitt_2Formatter;

public class Main {
    public static void main(String[] args) {

        Datum dummy1= new Datum(28, 02, 1995);
        System.out.println(dummy1.getDeutscheSchreibung());
        System.out.println(dummy1.getAmerikanischeSchreibung());
        System.out.println("SJ: "+ dummy1.istSchaltjahr());

        Datum dummy2= new Datum(30, 04, 2004);
        System.out.println(dummy2.getDeutscheSchreibung());
        System.out.println(dummy2.getAmerikanischeSchreibung());
        System.out.println("SJ: "+ dummy2.istSchaltjahr());
        dummy1.setMorgen();
        dummy2.setMorgen();
        System.out.println(dummy1.getDeutscheSchreibung());
        System.out.println(dummy2.getDeutscheSchreibung());

        Datum runPoint= new Datum(1, 1, 2000);
        for (int i = 0; i < 366; i++) {
            runPoint.setMorgen();
            System.out.println(runPoint.getDeutscheSchreibung());
        }
        try {
            Datum dummy3 = new Datum(29, 02, 1935);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
