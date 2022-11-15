package u23_Medien;

import java.util.Comparator;

public class CD extends Medium
        implements Comparable<Medium>  {
    private String kuenstler;
    private int min;

    public CD(String title, int relYear, String kuenstler, int min) {
        setTitle(title);
        setRelYear(relYear);
        if ((kuenstler!= null && !kuenstler.equals(""))
                && (min >= 0)) {
            this.kuenstler= kuenstler;
            this.min= min;
        }
    }

    @Override
    public String toString() {
        return this.kuenstler+ ", "+ super.toString()
                + this.min+ " Minuten";
    }
    @Override
    public int getLeihFrist() {
        return 14;
    }

    @Override
    public int compareTo(Medium o) {
        int cmp= Integer.compare(this.getRelYear(), o.getRelYear());
        if (cmp != 0) {
            return cmp;
        }
        return Integer.compare(this.getRelYear(), o.getRelYear());
    }

}
