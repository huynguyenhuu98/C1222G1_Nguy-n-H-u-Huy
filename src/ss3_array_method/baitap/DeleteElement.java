package ss3_array_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a length of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input value of once element " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.println("Input the number to delete");
        int a = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (a == array[i]) {
                for (int j = i; j < (array.length - 1); j++) {
                    array[j] = array[j + 1];
                    array[j + 1] = 0;
                }
            }
        }
        int[] result = Arrays.copyOf(array, array.length - 1);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));
    }
}