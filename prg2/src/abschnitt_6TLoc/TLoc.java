package abschnitt_6TLoc;

public class TLoc extends Loc {
    private String tag;
    public TLoc(int x, int y, String tag) {
        super(x,y);
        this.tag= tag;
    }

    public String getTag() {
        return tag;
    }

    @Override public boolean equals(Object o) {
        if (o!=null && o.getClass()==getClass()) {
            TLoc loc= (TLoc)o;
            return getX()==loc.getX() && getY()==loc.getY() && tag.equals(loc.tag);
        }
        return false;
    }


}