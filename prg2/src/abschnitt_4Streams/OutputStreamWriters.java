package abschnitt_4Streams;

import java.io.*;

public class OutputStreamWriters {
    public static void main(String[] args) throws IOException {
        int cnt= 0;
        InputStreamReader r= new InputStreamReader(System.in);
        FileOutputStream oS= new FileOutputStream("Os.txt");
        OutputStreamWriter oSwriter= new OutputStreamWriter(oS, "UTF-8");
        System.out.println(r.getEncoding());
        while (true) {
            int i= r.read();
            cnt++;
            System.out.println(cnt+": " + i + " = " + (char)i);
            oSwriter.write(Integer.toString(i)+ "\n");
            oSwriter.flush();
        }
    }
}
