package abschnitt_7Threads2;

public class CoWorkerMain {
    public static void main(String[] args) {
        Zaehler z1= new Zaehler();
        Zaehler z2= new Zaehler();
        Worker a= new Worker(z1, z2, "a");
        Worker b= new Worker(z2, z1, "b");
        a.start();
        b.start();
    }
}
