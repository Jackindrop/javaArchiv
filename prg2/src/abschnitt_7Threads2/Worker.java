package abschnitt_7Threads2;

class Worker extends Thread {

    private Zaehler li, re;

    public Worker(Zaehler li, Zaehler re, String name) {
        super(name);
        this.li= li; this.re= re;
    }
    @Override public void run() {
        for (int j=0; j<100000; j++) {
            if (currentThread().isAlive()) {
                li.incr();
            }
            re.incr();
        }
        System.out.print(getName()+":"+li.get()+"/"+re.get()+",");
    }
    /**
     * Deadlocks
     *
     *class Worker extends Thread {
     * …
     * @Override public void run() {
     * for (int j=0; j<10000; j++) {
     * li.incr();
     * if (li.get()-re.get() != 1) throw new Error("Fatal error");
     * re.incr();
     * }
     * System.out.print(getName()+":"+li.get()+"/"+re.get()+",");
     * }
     */
}