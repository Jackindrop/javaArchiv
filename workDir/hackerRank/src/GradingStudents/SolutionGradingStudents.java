package GradingStudents;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * TASK: Completed
 */
public class SolutionGradingStudents {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input= new Scanner(new File("gsIn.txt"));
        List<Integer>  arr= new ArrayList<Integer>();
        int sizeOF= Integer.parseInt(input.nextLine());
        while(input.hasNextLine()) {
            arr.add(Integer.parseInt(input.nextLine()));
        }
        input.close();
        System.out.println(gradingStudents(arr));
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        for (int a= 0; a< grades.size(); a++) {
            if (grades.get(a)> 37 && grades.get(a)% 10 % 5 != 0) {
                if (grades.get(a)% 10 < 5) {
                    if (5 - grades.get(a)% 10 < 3) {
                        grades.set(a, grades.get(a)-grades.get(a)% 10 + 5);
                    }
                } else if (grades.get(a)% 10 < 10) {
                    if (10 - grades.get(a)% 10 < 3) {
                        grades.set(a, grades.get(a)-grades.get(a)% 10 + 10);
                    }
                }
            }
        }
        return grades;
    }
}
