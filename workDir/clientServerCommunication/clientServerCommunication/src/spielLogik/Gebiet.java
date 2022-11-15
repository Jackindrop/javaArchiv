package spielLogik;

public class Gebiet
{
    // Eigenschaften
    private boolean feldWurdeBeschossen;
    private boolean vorlesungAufFeld;

    // Konstruktor
    public Gebiet()
    {
        feldWurdeBeschossen=false;
        vorlesungAufFeld =false;
    }

    // Methoden
    public boolean beschiesseFeld(){
        feldWurdeBeschossen=true;
        if (vorlesungAufFeld) {
            versenkeVorlesung();
            return true;
        }
        else return false;
    }

    public void setzeVorlesung(){
        vorlesungAufFeld =true;
    }

    public void versenkeVorlesung(){
        vorlesungAufFeld =false;
    }

    public boolean isFeldWurdeBeschossen(){
        return feldWurdeBeschossen;
    }

    public boolean isSchiff(){
        return vorlesungAufFeld;
    }
}