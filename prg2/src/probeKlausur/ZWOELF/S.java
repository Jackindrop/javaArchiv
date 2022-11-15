package probeKlausur.ZWOELF;

class S {
    private int[] list;
    private int size;
    public S() {
        list = new int[10];
        size = 0;
    }
    public void push(int v) {
        if (size == list.length) {
            int[] old = list;
            list = new int[size*2];
            for (int i = 0; i < size; i++) {
                list[i] = old[i];
            }
        }
        list[size++] = v;
    }
    public int pop() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        int v = list[0];
        size--;
        for (int i = 0; i < size; i++) {
            list[i] = list[i+1];
        }
        return v;
    }
    public boolean available() {
        return size > 0;
    }
}