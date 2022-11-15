package abschnitt_7Threads;


import static abschnitt_7Threads.ThreadMain.print;

public class ThreadMain2 {
    public static void main(String[] args) {
        Thread.currentThread().setName("Hauptthread");
        Thread t2 = new Thread(new Runnable() {
            @Override public void run() {
                for (int i = 0; i < 1000; i++) {
                    print('0');
                    if (Thread.interrupted()) break;
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        break; // wie einen normalen Abbruch behandeln
                    }
                }
            }
        }, "Zweiter Thread");
        t2.start();
        for (int i = 0; i < 1000; i++) {
            print('#');
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            // sollte nicht vorkommen, da den Hauptthread ja niemand abbricht.
            }
            if (i == 99) t2.interrupt();
        }
    }
}
