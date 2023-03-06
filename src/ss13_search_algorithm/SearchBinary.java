package ss13_search_algorithm;

import java.util.Scanner;

public class SearchBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter value of element: ");
            int element = Integer.parseInt(scanner.nextLine());
            array[i] = element;
        }
        System.out.println("Enter value of key: ");
        int key = Integer.parseInt(scanner.nextLine());
        System.out.println(binarySearch(array, 0, array.length - 1, key));
    }

    public static int binarySearch(int[] array, int left, int right, int key) {
        int mid = (left + right) / 2;
        if (right >= left) {
            if (key == array[mid]) {
                return mid;
            }
            if (key > array[mid]) {
                return binarySearch(array, mid + 1, right, key);
            }
            if (key < array[mid]) {
                return binarySearch(array, left, mid - 1, key);
            }
        }
        return -1;
    }
}
