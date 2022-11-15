package abschnitt_2Person;

public class Name {
    private String name, vorname;

    public Name() {
        this.vorname= "Max";
        this.name= "Mustermann";
    }
    public Name(String name, String vorname) {
        if (name == null || name.equals("") || vorname == null
                || vorname.equals("")) {
            throw new IllegalArgumentException("Ungültiger Name");
        }
        this.name= name;
        this.vorname= vorname;
    }
    public String getFull() {
        return vorname + " " + name;
    }
    public String getRev() {
        return name + " " + vorname;
    }
}