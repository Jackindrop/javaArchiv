package spielLogik;



public class Spieler {
    public Spielfeld sF;
    static int numb= 1000;
    private int uid;
    private String name;
    private int semester= 0;

    // init neuen Spieler
    public Spieler(String name) {
        uid= numb;
        numb++;
        sF= new Spielfeld(5+semester, 5+semester);
        this.name= name;
        semester= 1;
    }
    // init vorhandenen Spieler
    public Spieler(String name, int uid, int semester) {
        this.uid= uid;
        this.name= name;
        this.semester= semester;
        sF= new Spielfeld(5+semester, 5+semester);
    }

    public void showSpielerFeld() {
        sF.gibSpielfeldAufKonsoleAus(5+semester,5+semester);
    }

    public void setSpielfeld(Spielfeld feld) {
        sF= feld;
    }
    public int getUID() {
        return this.uid;
    }
    public String getName() {
        return this.name;
    }
    public int getSemester() {
        return this.semester;
    }
    public void incrSemester() {
        this.semester++;
    }
}
