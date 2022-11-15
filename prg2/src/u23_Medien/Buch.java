package u23_Medien;

public class Buch extends Medium{
    private String autor;
    private String verlag;

    public Buch(String title, int relYear, String verlag, String autor) {
        setTitle(title);
        setRelYear(relYear);
        if ((verlag!= null && !verlag.equals(""))
                && (autor!= null && !autor.equals(""))) {
            this.verlag= verlag;
            this.autor= autor;
        }
    }

    @Override
    public String toString() {
        return this.autor+ ", "+ super.toString() + this.verlag;
    }
    @Override
    public int getLeihFrist() {
        return 28;
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
