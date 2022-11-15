package u23_Medien;

import java.util.Comparator;

public abstract class Medium implements Comparable<Medium> {

    public int compareTo(Medium m1, Medium m2) {
        if (m1.getLeihFrist() < m2.getLeihFrist()) {
            return -1;
        }
        if (m1.getLeihFrist() > m2.getLeihFrist()) {
            return 1;
        }
        return 0;
    }
    private String title;
    private int relYear;

    public void setTitle(String title) {
        if (title!= null && !title.equals("")) {
            this.title = title;
        }
    }
    public void setRelYear(int relYear) {
        if (relYear>= 0) {
            this.relYear = relYear;
        }
    }
    public String getTitle() {return this.title;}
    public int getRelYear() {return this.relYear;}

    @Override
    public String toString() {
        return this.title+ " ("+ relYear+ ") ";
    }
    public int getLeihFrist() {
        return 0;
    }
}
