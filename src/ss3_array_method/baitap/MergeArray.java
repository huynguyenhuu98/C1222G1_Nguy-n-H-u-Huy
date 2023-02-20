package ss3_array_method.baitap;

import java.util.Scanner;
import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a length of array1: ");
        int length1 = scanner.nextInt();
        int[] array1 = new int[length1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Input value of once element " + (i + 1));
            array1[i] = scanner.nextInt();
        }
        System.out.print("Input a length of array2: ");
        int length2 = scanner.nextInt();
        int[] array2 = new int[length2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Input value of once element " + (i + 1));
            array2[i] = scanner.nextInt();
        }
        int[] arraynew = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            arraynew[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            arraynew[array1.length + j] = array2[j];
        }
        System.out.println(Arrays.toString(arraynew));
    }
}
