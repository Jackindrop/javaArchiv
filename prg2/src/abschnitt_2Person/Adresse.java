package abschnitt_2Person;

public class Adresse {
    private int plz;
    private String ort, strasse;
    public Adresse() {
        this.strasse = "Weg des Beispiels";
        this.plz = 48151;  // TODO PROBLEM führende Nullen bei Integer
        this.ort = "Musterstadt";
    }
    public Adresse(String strasse, int plz, String ort) {
        // TODO Prüfung der Parameter
        this.strasse= strasse;
        this.plz= plz;
        this.ort= ort;
    }
    public String getAdresse() {
        return strasse+ System.getProperty("line.seperator") //TODO recherce line.seperator
                + plz+ " "+ ort;
    }
}
