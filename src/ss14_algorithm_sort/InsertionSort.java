package ss14_algorithm_sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {0, 8, 3, 5, 4, 4, 3, 4, 4, 3};
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int x = list[i];
            int pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }
}
