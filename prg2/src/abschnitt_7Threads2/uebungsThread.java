package abschnitt_7Threads2;

public class uebungsThread extends Thread{

    public uebungsThread(StringBuilder sb) {
            synchronized (sb) {
                for (char c = 'a'; c <= 'j'; c++) {
                    sb.append(c);
                }
            }

    }
}
