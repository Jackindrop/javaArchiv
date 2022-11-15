package u15;

public class Fußballspieler {
 private static int  numb=1;
 private String name;
 private int sNumb;
    Fußballspieler(String name) {
        if (this.numb >= 12) {
            throw new IllegalStateException("Mehr als 11 Spieler sind verboten!");
        }
       this.sNumb= numb;
       this.name= name;
       numb++;
    }
    public String toString() {
        return (name+ " "+ this.sNumb);
    }
}
