package algos;

import static RunAlgoMain.Laufhaus.showFreier;

public class StraightInsertion extends Thread{


        public static int[] sort(int[] arr, boolean b) {
            if (b) showFreier(arr);
            try {
                for (int i = 1; i < arr.length; i++) {
                    if (Thread.interrupted()) {
                        throw new InterruptedException(
                                "StraightSelection terminated by user");
                    }
                    int elementToSort = arr[i];
                    System.out.println("\ti= " + elementToSort);
                    // Move element to the left until it's at the right position
                    int j = i;
                    while (j > 0 && elementToSort < arr[j - 1]) {
                        if (Thread.interrupted()) {
                            throw new InterruptedException(
                                    "StraightSelection terminated by user");
                        }
                        arr[j] = arr[j - 1];
                        if (b) showFreier(arr);
                        j--;
                    }
                    arr[j] = elementToSort;
                    if (b) showFreier(arr);
                }
                if (b) showFreier(arr);
                return arr;
            } catch (InterruptedException e) {
                e.getMessage();
            }
            return null;
    }
}