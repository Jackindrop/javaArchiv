package abschnitt_3ballSpiele;

public class Fussball  extends Ballspiele{

    public Fussball() {
        super(Integer.toString(90));
    }
    public String einwurfRegel() {
        return "Handspiel erlaubt";
    }
    public String eckRegel() {
        return "Min. Abstand anderer Spieler 9,15m";
    }
}
