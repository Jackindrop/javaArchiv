package abschnitt_7Threads;

public class ThreadMain {
    public static Object lock= new Object();
    public static Zaehler z= new Zaehler(); // startet bei 0

    public static void print(char c) {

        synchronized (lock) {
            System.out.print(c);
            z.incr();
            if (z.get() % 100 == 0)
                System.out.println();
        }
    }

    public static void main(String[] args) {
        Thread.currentThread().setName("Hauptthread");
        Thread t2= new Thread(new Runnable() {
            @Override public void run() {
                for (int i=0; i<1000; i++) {
                    print('0');
                    if (Thread.interrupted()) break;
                }
            }
        }, "Zweiter Thread");
        t2.start();
        for (int i=0; i<1000; i++) {
            print('#');
            if (i==99) t2.interrupt();
        }
    }
}

