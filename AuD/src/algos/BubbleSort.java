package algos;

public class BubbleSort {
    public static int[] sort(int[] elements) {
        for (int max = elements.length - 1; max > 0; max--) {
            boolean swapped = false;
            for (int i = 0; i < max; i++) {
                int left = elements[i];
                int right = elements[i + 1];
                if (left > right) {
                    elements[i + 1] = left;
                    elements[i] = right;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return elements;
    }
}

