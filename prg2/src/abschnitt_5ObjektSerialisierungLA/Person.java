package abschnitt_5ObjektSerialisierungLA;

import java.io.Serializable;
 class Person implements Serializable {
    private static final long serialVersionUID = 1;
    private String name;
    private int alter;
    private transient int gehalt;

    public Person (String name, int alter, int gehalt) {
        this.name= name;
        this.alter= alter;
        this.gehalt= gehalt;
    }
    @Override
    public String toString() {
        return name+" ("+alter+") verdient "+ gehalt;
    }
}
