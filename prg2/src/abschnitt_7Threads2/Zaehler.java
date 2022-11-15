package abschnitt_7Threads2;

class Zaehler {
    private long wert;
    public synchronized void incr() { wert++;}
    public long get() { return wert; }
}