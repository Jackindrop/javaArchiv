package probeKlausur.ZWOELF;

public class Main {
    public static void main(String[] args) {
        S s = new S();
        new Thread(new P(s)).start();
        new Thread(new C(s)).start();
    }
}
class P implements Runnable {
    private S s;
    public P(S s) {
        this.s = s;
    }
    @Override public void run() {
        for (int i = 1; i <= 10000; i++) {
            s.push(i);
        }
    }
}
class C implements Runnable {
    private S s;
    public C(S s) {
        this.s = s;
    }
    @Override public void run() {
        long sum = 0;
        for (int i = 1; i <= 10000; i++) {
            while (!s.available()) {
                // busy wait
            }
            sum += s.pop();
        }
        System.out.println(sum);
    }
}