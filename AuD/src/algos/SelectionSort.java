package algos;
public class SelectionSort {
    public static int[] sort(int[] elements) {
        int length = elements.length;

        for (int i = 0; i < length - 1; i++) {
            // Search the smallest element in the remaining array
            int minPos = i;
            int min = elements[minPos];
            for (int j = i + 1; j < length; j++) {
                if (elements[j] < min) {
                    minPos = j;
                    min = elements[minPos];
                }
            }

            // Swap min with element at pos i
            if (minPos != i) {
                elements[minPos] = elements[i];
                elements[i] = min;
            }
        }
        return elements;
    }
}