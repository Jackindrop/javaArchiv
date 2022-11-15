package algos;

public class HeapSort {

    public void sort(int[] elements) {
        buildHeap(elements);

        for (int swapToPos = elements.length - 1; swapToPos > 0; swapToPos--) {
            // Move root to end
            swap(elements, 0, swapToPos);

            // Fix remaining heap
            heapify(elements, swapToPos, 0);
        }
    }

    void buildHeap(int[] elements) {
        // "Find" the last parent node
        int lastParentNode = elements.length / 2 - 1;

        // Now heapify it from here on backwards
        for (int i = lastParentNode; i >= 0; i--) {
            heapify(elements, elements.length, i);
        }
    }
    void heapify(int[] heap, int length, int parentPos) {
        while (true) {
            int leftChildPos = parentPos * 2 + 1;
            int rightChildPos = parentPos * 2 + 2;

            // Find the largest element
            int largestPos = parentPos;
            if (leftChildPos < length && heap[leftChildPos] > heap[largestPos]) {
                largestPos = leftChildPos;
            }
            if (rightChildPos < length && heap[rightChildPos] > heap[largestPos]) {
                largestPos = rightChildPos;
            }

            // largestPos is now either parentPos, leftChildPos or rightChildPos.
            // If it's the parent, we're done
            if (largestPos == parentPos) {
                break;
            }

            // If it's not the parent, then switch!
            swap(heap, parentPos, largestPos);

            // ... and fix again starting at the child we moved the parent to
            parentPos = largestPos;
        }
    }
    public void swap(int[] e, int i, int r) {
        int tmp= e[i];
        e[i]= e[r];
        e[r]= tmp;
    }
}
