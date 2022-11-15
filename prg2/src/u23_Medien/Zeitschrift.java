package u23_Medien;

public class Zeitschrift extends Medium{
    private int month;

    public Zeitschrift(String title, int relYear, int month) {
        setTitle(title);
        setRelYear(relYear);
        if (month>= 0) {
            this.month= month;
        }
    }

    @Override
    public String toString() {
        return getTitle()+ " ("+ this.month+ "/"+ getRelYear()+")";
    }
    @Override
    public int getLeihFrist() {
        return 7;
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
