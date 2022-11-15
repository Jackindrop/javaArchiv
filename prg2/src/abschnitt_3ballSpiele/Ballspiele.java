package abschnitt_3ballSpiele;

public class Ballspiele {
    private String spielDauer;
    private String ball = "1";
    private String teams= "2";
    private String teamSize= "12";

    public Ballspiele() {
        this.spielDauer= "-1";
    }
    public Ballspiele(String spielDauer) {
        this.spielDauer= spielDauer+ " Minuten";
    }

    public String getSpieldauer() {
        return spielDauer;
    }
    public String getTeams() {return this.teams; }
    public String getBaelle() {return this.ball;}

    public void setBaelle(int b) { ball= Integer.toString(b);}
    public void setTeamSize(int tS) { teamSize= Integer.toString(tS);}
    public void setTeams(int t) { teams= Integer.toString(t);}
}
