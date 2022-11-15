package abschnitt_7Threads;

import abschnitt_7Threads2.uebungsThread;
/**
 * 1. möglich, t1 t2 hängen abwechseln bucstaben an
 * 2. wenn man die Threads serialisieren würde, möglich
 * 3. nicht möglich
 */
public class uebungsaufgabe7_6_3 {
    public static StringBuilder sb= new StringBuilder();

    public static void main(String[] args) {
        uebungsThread a= new uebungsThread(sb);
        uebungsThread b= new uebungsThread(sb);

        System.out.println(sb.toString());
    }
}
