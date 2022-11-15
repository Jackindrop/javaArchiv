package abschnitt_4Streams;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaders {
    public static void main(String[] args) throws IOException {
        int cnt= 0;
        InputStreamReader r= new InputStreamReader(System.in);
        System.out.println(r.getEncoding());
        while (true) {
            int i= r.read();
            cnt++;
            System.out.println(cnt+": " + i + " = " + (char)i);
        }
    }
}
