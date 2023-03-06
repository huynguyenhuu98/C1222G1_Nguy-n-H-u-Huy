package ss14_algorithm_sort;

import java.util.Arrays;

public class Sort {
    public static void selectionSort(int[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 8, 6, 7};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
