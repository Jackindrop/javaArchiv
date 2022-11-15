package probeKlausur.ZWEI;

public class K {
    private String s;
    private char c;
    // Konstruktor ausgeblendet und als vorhanden angenommen
    // …
    public K(String s, char c) {
        this.s= s;
        this.c= c;
    }

    public void setS(String sN) {
        this.s = new String(sN);
    }


    @Override
    public boolean equals(Object o) {
        K k= (K) o;
      /*  boolean eq;
        if (s == null) {
            eq = (k.s == null);
        } else {
            eq = s.equals(k.s);
        }
        return (eq && c==k.c);  */

        return (s.equals(k.s) && c== k.c);
    }

    public static void main(String[] args) {
        K myK= new K("String", 'S');
        K myKK= new K("S", 'S');

        System.out.println(myK.equals(myKK));
        myK.setS("S");
        System.out.println(myK.equals(myKK));
    }
}