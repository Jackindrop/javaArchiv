package probeKlausur.ELF;

public class ThreadOderso extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t= new Thread() {
            @Override public void run() {

                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 2");
            }
        };
        t.start();
        System.out.println("Main");
        t.join();
    }
}
