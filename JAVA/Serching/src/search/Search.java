package search;
import tools.Print;
public class Search {
    public static int sequentialSearch(Integer value, Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(value) == 0) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int bottom, int top, Integer value, Integer[] array) {
        if (bottom > top) {
            return -1;
        } else {
            int pivot = (bottom + top) / 2;
            if (value.compareTo(array[pivot]) == 0) {
                return pivot;
            } else if (value.compareTo(array[pivot]) < 0) {
                return binarySearch(bottom, pivot - 1, value, array);
            } else {
                return binarySearch(pivot + 1, top, value, array);
            }
        }
    }
    public static int search(Integer value, Integer[] array) {
        boolean sorted = true;
        for (int index = 1; index < array.length; index++) {
            if (array[index-1].compareTo(array[index]) > 0) {
                sorted = false;
            }
        }
        if (sorted) {
            return binarySearch(0, array.length-1, value, array);
        } else {
            return sequentialSearch(value, array);
        }
    }
    public static void main(String[] args) {
        Integer value = 2;
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = -1;
        System.out.println("Searching value: " + value +
                "\n\tin array: " +  Print.array(array, array.length));
        index = sequentialSearch(value, array);
        System.out.println("Sequential Search: array[" + index + "] = " +
                (index >= 0? array[index]:"?"));
        index = binarySearch(0, array.length-1, value, array);
        System.out.println("Binary Search: array[" + index + "] = " +
                (index >= 0? array[index]:"?"));
        index = search(value, array);
        System.out.println("Search: array[" + index + "] = " +
                (index >= 0? array[index]:"?"));
    }
}
