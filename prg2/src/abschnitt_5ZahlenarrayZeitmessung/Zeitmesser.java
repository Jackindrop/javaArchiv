package abschnitt_5ZahlenarrayZeitmessung;

import java.util.ArrayList;


public class Zeitmesser {

    private long start= 0;
    private long stop= 0;
    private long messSum= 0;
    private boolean isMeasuring= false;

    public Zeitmesser() {}

    public void start() {
        this.isMeasuring= true;
        this.start= System.currentTimeMillis();
    }

    public void stop() {
        if (isMeasuring) {
            setStop();
            messSum+= addGemesseneGesamtzeit();
        } else {
            throw new IllegalStateException("Zeitmesser bereits gestoppt");
        }
    }
    public long addGemesseneGesamtzeit() {
            return stop- start;
    }
    public long getGemesseneGesamtzeit() {
        return messSum;
    }

    public boolean getZustand() {return this.isMeasuring;}

    public void setStop() {
        this.stop= System.currentTimeMillis();
    }

}
