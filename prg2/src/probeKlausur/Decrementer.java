package probeKlausur;

public class Decrementer implements Calculator {
    @Override
    public String type() {
        return "dash calculation";
    }
    public int cecr(int i) {
        return i - 1;
    }
}
