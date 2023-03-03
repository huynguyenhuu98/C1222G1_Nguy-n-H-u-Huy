package ss3_array_method.thuchanh;

import java.util.Scanner;

public class ReverseElement {
    public static void main(String[] args) {
        int n;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input size of array");
            n = scanner.nextInt();
            if (n > 20) {
                System.out.println("size does not exceed 20");
            }
        } while (n > 0);
        array = new int[n];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[n - 1 - j];
            array[n - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}

