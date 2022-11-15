package algos;

public class QuicksortSimple {
    int[] arr;
    public QuicksortSimple(int[] arr) {
        this.arr= arr;
    }

    public void sort() {
        quicksort(this.arr, 0, this.arr.length - 1);
    }

    private void quicksort(
        int[] elements, int left, int right) {
        // End of recursion reached?
        if (left >= right) return;

        int pivotPos = partition(elements, left, right);
        quicksort(elements, left, pivotPos - 1);
        quicksort(elements, pivotPos + 1, right);
    }

    public int partition(int[] elements, int left,
                         int right) {
        int pivot = elements[right];

        int i = left;
        int j = right - 1;
        while (i < j) {
            // Find the first element >= pivot
            while (elements[i] < pivot) {
                i++;
            }
            // Find the last element < pivot
            while (j > left && elements[j] >= pivot) {
                j--;
            }
            // If the greater element is left of the lesser element, switch them
            if (i < j) {
                swap(elements, i, j);
                i++;
                j--;
            }
        }
        // i == j means we haven't checked this index yet.
        // Move i right if necessary so that i marks the start of the right array.
        if (i == j && elements[i] < pivot) {
            i++;
        }

        // Move pivot element to its final position
        if (elements[i] != pivot) {
            swap(elements, i, right);
        }
        return i;
    }
    public void swap(int[] e, int i, int r) {
        int tmp= e[i];
        e[i]= e[r];
        e[r]= tmp;
    }

}