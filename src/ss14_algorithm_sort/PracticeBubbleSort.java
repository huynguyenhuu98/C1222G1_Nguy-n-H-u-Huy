package ss14_algorithm_sort;

import java.util.Arrays;

public class PracticeBubbleSort {
    public static void bubbleSort(int[] array) {
        boolean pass = true;
        for (int i = 0; i < array.length - 1 && pass; i++) {
            pass = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                pass = true;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 2, 6, 4, 9};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }
}
