package SubarrayDevision;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * TASK: UNCOMPLETED
 */
public class SolutionSubarrayDevision  {
    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> list= new ArrayList<Integer>();
        Scanner input = new Scanner(new File("sI.txt"));
        int n= input.nextInt(), d, m;
        input.nextLine();
        for (int i= 0; i< n; i++) {
            list.add(input.nextInt());
        }
        input.nextLine();
        d= input.nextInt();
        m= input.nextInt();
        System.out.println(birthday(list, d, m)); // expected 2, output 0
    }

    public static int birthday(List<Integer> s, int d, int m) {
        int result= 0;
        for (int a= 0; a< s.size(); a++) {
            if (s.size()!= 1) {
                for (int b = 1; b < m; b++) {
                    if ((s.get(a) + s.get(b)) == d) {
                        result++;
                    }
                }
            } else if (s.get(0)%d== 0) {
                result++;
            }
        }
        return result;
    }
}
