package JavaList;

import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * TASK: uncompleted
 */
public class SolutionJavaMap {
    public static void main(String[] args) throws FileNotFoundException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> arr = new ArrayList<Integer>();
        Scanner input = new Scanner(new File("jmIN2.txt"));
        int n = Integer.parseInt(input.nextLine());
        int query;
        for (int a = 0; a < n; a++) {
            arr.add(input.nextInt());
        }
        input.nextLine();
        query = Integer.parseInt(input.nextLine());
        for (int a = 0; a < query; a++) {
            String op = input.nextLine().trim();
            if (op.equals("Insert")) {
                input.nextLine();
                int index = input.nextInt();
                int numb = input.nextInt();

                if (index < arr.size()) {
                    arr.set(index - 1, numb);
                } else {
                    arr.add(numb);
                    input.nextLine();
                }
            } else if (op.equals("Delete")) {
                int index = Integer.parseInt(input.nextLine());
                if (index < arr.size()) {
                    arr.remove(index);

                }
            }
        }
        for (int b = 0; b < arr.size(); b++) {
            System.out.print(arr.get(b) + " ");

        }
    }
}
