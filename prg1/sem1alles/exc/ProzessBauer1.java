import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
public class ProzessBauer1 {
    public static void main(String[] args) {
       try {

		// -- Linux --
		
		// Run a shell command
		// Process process = Runtime.getRuntime().exec("ls /home/mkyong/");

		// Run a shell script
		// Process process = Runtime.getRuntime().exec("path/to/hello.sh");

		// -- Windows --
		
		// Run a command
		//Process process = Runtime.getRuntime().exec("cmd /c dir C:\\Users\\mkyong");

		//Run a bat file
		Process process = Runtime.getRuntime().exec(
				"gnome-terminal", null, new File("/home/marius/wd"));

		StringBuilder output = new StringBuilder();

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(process.getInputStream()));

		String line;
		while ((line = reader.readLine()) != null) {
			output.append(line + "\n");
		}

		int exitVal = process.waitFor();
		if (exitVal == 0) {
			System.out.println("Success!");
			System.out.println(output);
			System.exit(0);
		} else {
			//abnormal...
		}

	} catch (IOException e) {
		e.printStackTrace();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}
