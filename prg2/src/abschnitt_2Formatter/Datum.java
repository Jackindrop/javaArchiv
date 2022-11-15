package abschnitt_2Formatter;

import java.util.Formatter;

public class Datum {
    private int tag;
    private int monat;
    private int jahr;

    // Konstruktor
    public Datum(int tag,int monat,int jahr) {
        if (check.checkData(tag, monat, jahr)) {
            this.tag= tag;
            this.monat= monat;
            this.jahr= jahr;
        } else {
            throw new IllegalArgumentException("Datum ungültig");
        }
    }
    public void setMorgen() {
        if (monat == 2 & tag == 28) {
            tag= 1;
            monat++;
        }else if (tag == 31 & monat == 12) {
            tag= 1;
            monat= 1;
            jahr++;
        } else if ((tag == 30 & monat % 2 == 0)
                || (tag == 31 & monat % 2 != 0)) {
            tag= 1;
            monat++;
        }  else {
            tag++;
        }
    }

    public  String getAmerikanischeSchreibung() {
        StringBuilder sb= new StringBuilder();
        Formatter formatter= new Formatter(sb);
        formatter.format("%02d/%02d/%02d", monat, tag, jahr);
        return sb.toString();
    }

    public  String getDeutscheSchreibung() {
        StringBuilder sb= new StringBuilder();
        Formatter formatter= new Formatter(sb);
        formatter.format("%02d/%02d/%02d", tag, monat, jahr);
        return sb.toString();
    }
    // Accessor
    public  boolean istSchaltjahr() {
        double diff= jahr % 4.0;
        if (diff < 0.02) {
            return true;
        }
        return false;
    }
}
