package abschnitt_6ciPlenum;

import java.util.Objects;

public class Vorlesung {
    private String titel;
    private int sws;

    /**
     * Plenumaufgabe 13.05.22
     * @param titel
     * @param sws
     */
    public Vorlesung(String titel, int sws) {
        this.titel = titel;
        this.sws = sws;
    }

    // Hier fehlt Ihr Code
    @Override public boolean equals(Object o) {
        if (o instanceof Vorlesung) {
            Vorlesung v= (Vorlesung) o;
            return sws== v.sws && titel.equals(v.titel);
        } else {
            return false;
        }
    }
    @Override public String toString() {
        return titel+ "/"+ sws;
    }
    @Override public int hashCode() {
        return Objects.hash(titel, sws);
    }
}
