package ss3_array_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a length of array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input value of once element " + (i + 1));
            array[i] = scanner.nextInt();
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Value min in the array: " + min);
    }
}
