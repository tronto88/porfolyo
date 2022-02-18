package sorting;
import Practical_10.tools.Print;
import java.util.Arrays;
public class Sorting {
    public enum SortingAlgorithm { BubbleSort, SelectionSort,
        InsertionSort, MergeSort, QuickSort };
    public static <T extends Comparable<? super T>> void
            swap(T[] array, int from, int to){
        T tmp = array[from];
        array[from] = array[to];
        array[to] = tmp;
    }
    public static <T extends Comparable<? super T>>
            void bubbleSort(T[] array) {
        for (int lastUnsorted = array.length - 1;
             lastUnsorted > 0;
             lastUnsorted--) {
            for (int nextToCompare = 0;
                 nextToCompare < lastUnsorted;
                 nextToCompare++) {
                if (array[nextToCompare].compareTo(array[nextToCompare + 1]) > 0) {
                    swap(array,nextToCompare,nextToCompare+1);
                }
            }
        }
    }
    public static <T extends Comparable<? super T>> void
            selectionSort(T[] array) {
        for (int lastUnsorted = array.length - 1;
             lastUnsorted > 0;
             lastUnsorted--) {
            int index = lastUnsorted;
            for (int nextToCompare = 0;
                 nextToCompare < lastUnsorted;
                 nextToCompare++) {
                if (array[nextToCompare].compareTo(array[index]) > 0) {
                    index = nextToCompare;
                }
            }
            swap(array, index, lastUnsorted);
        }
    }
    public static <T extends Comparable<? super T>> void
            insertionSort(T[] array) {
        for (int sorted = 0; // only the first element is sorted
             sorted < array.length - 1; // stop when the whole list is sorted
             sorted++) { // one new element sorted each time round
            T newElement = array[sorted + 1]; // first unsorted element
            int compareTo = sorted; // start by comparing last sorted
            while (compareTo >= 0 && // move until the start of sorted list
                    newElement.compareTo(array[compareTo]) < 0) {
                array[compareTo + 1] = array[compareTo];
                compareTo--;
            }
            array[compareTo + 1] = newElement;
        }
    }
    public static <T extends Comparable<? super T>> void
            mergeSort(T[] array) {
        if (array.length < 2) {
            return;
        }
        T[] lowerArray = Arrays.copyOfRange(array, 0, array.length / 2);
        T[] upperArray = Arrays.copyOfRange(array, array.length / 2, array.length);
        mergeSort(lowerArray);
        mergeSort(upperArray);
        merge(array, lowerArray, upperArray);
    }
    public static <T extends Comparable<? super T>> void
            merge(T[] array, T[] lowerArray, T[] upperArray) {
        int arrayIndex = 0, lowerIndex = 0, upperIndex = 0;
        while (lowerIndex < lowerArray.length && upperIndex < upperArray.length) {
            if (lowerIndex < lowerArray.length && lowerArray[lowerIndex].compareTo(upperArray[upperIndex]) < 0) {
                array[arrayIndex] = lowerArray[lowerIndex++];
            } else {
                array[arrayIndex] = upperArray[upperIndex++];
            }
            arrayIndex++;
        }
        while (lowerIndex < lowerArray.length) {
            array[arrayIndex] = lowerArray[lowerIndex];
            lowerIndex++;
            arrayIndex++;
        }
        while (upperIndex < upperArray.length) {
            array[arrayIndex] = upperArray[upperIndex];
            upperIndex++;
            arrayIndex++;
        }
    }
    public static <T extends Comparable<? super T>> void
            quickSort(T[] array, int low, int high) {
        if (low < high) {
            int pivot_index = partition(array, low, high);
            quickSort(array, low, pivot_index  - 1);
            quickSort(array, pivot_index  + 1, high);
        }
    }
    public static <T extends Comparable<? super T>> int
            partition(T[] array, int low, int high) {
        T pivot = array[high]; // choose pivot
        int store = low; // start from low
        for (int i = low; i <= high - 1; i++) {
            if (array[i].compareTo(pivot) < 0) {
                swap(array, store, i);
                store++; // move index to the right
            }
        }
        swap(array, store, high);
        return store;
    }
    public static <T extends Comparable<? super T>> void
            sort(T[] array, SortingAlgorithm sortingAlgorithm) {
        System.out.println("Array before sorting: " + Print.array(array, array.length));
        switch (sortingAlgorithm) {
            case BubbleSort: bubbleSort(array); break;
            case SelectionSort: selectionSort(array); break;
            case InsertionSort: insertionSort(array); break;
            case MergeSort: mergeSort(array); break;
            case QuickSort: quickSort(array,0,array.length-1); break;
            default: System.out.println("Please choose a sorting algorithm");
        }
        System.out.println("Array after sorting:  " + Print.array(array, array.length));
    }
    public static void main(String[] args) {
        Integer[] array = {4, 3, 5, 1, 9, 24, 7, 40, 18, 15};
        //Double[] array = {1.7, 1.5, 1.4, 1.2, 1.6, 1.3};
        //String[] array = {"sort", "an", "array", "of", "strings"};
        SortingAlgorithm sortingAlgorithm = SortingAlgorithm.BubbleSort;
        sort(array, sortingAlgorithm);
    }
}
