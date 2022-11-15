package abschnitt_2Person;

public class Person {
    private Name name;
    private Adresse adresse;
    // TODO konstruktor
    public Person() {
        this.name= new Name();
        this.adresse= new Adresse();
    }
    public Person(String vN, String nN) {
        this.name= new Name(vN, nN);
        this.adresse= new Adresse();
    }
    public String getName() {
        return name.getFull(); // Delegation
    }
    public String getAdresse() {
        return adresse.getAdresse(); // Delegation
    }
    public String getFull() {
        return name.getFull(); // Delegation
    }
    public String getRev() {
        return name.getRev(); // Delegation
    }
}
