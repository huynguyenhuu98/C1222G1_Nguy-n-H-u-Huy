package ss3_array_method.baitap;

import java.util.Scanner;
import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = Arrays.copyOf(arr, arr.length + 1);
        System.out.println("Input a number, you want insert in the array");
        int number = scanner.nextInt();
        System.out.println("Input a index insert element");
        int n = scanner.nextInt();
        if (n < 0 || n > arr.length) {
            System.out.println("Do not insert element");
        } else {
            for (int i = arr2.length - 1; i >= n; i--) {
                arr2[i] = arr2[i - 1];
            }
            arr2[n] = number;
            System.out.println(Arrays.toString(arr2));
        }
    }
}
