package abschnitt_7Threads;

class Zaehler {
    private long wert;

    public void incr() {
        wert++;
    }

    /**
     *
     * class Zaehler {
     * private long wert;
     * public void incr() {
     * synchronized(this) {
     * wert++;
     * @return
     */
    public long get() {
        return wert;
    }
}