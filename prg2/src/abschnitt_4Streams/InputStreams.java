package abschnitt_4Streams;

import java.io.IOException;

public class InputStreams {
        public static void main(String[] args) throws IOException {
            int cnt= 0;
            while (true) {
                /**
                 * InputStream
                 */
                int i= System.in.read();
                cnt++;
                System.out.println(cnt+": " + i + " = " + (char)i);
            }
        }
}
