import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        for (int i= 0; i< grades.size(); i++) {
            int einserStelle= grades.get(i)%10;
            int zehner= grades.get(i)- einserStelle;
            System.out.println(einserStelle);
        }

        return grades;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int gradesCount = 4;

        List<Integer> grades = new ArrayList<>();
        Collections.addAll(grades, 73, 67, 38, 33);


        List<Integer> result = Result.gradingStudents(grades);

        for (int i= 0; i< grades.size(); i++) {
            System.out.println(grades.get(i));
        }

        bufferedReader.close();
    }
}
