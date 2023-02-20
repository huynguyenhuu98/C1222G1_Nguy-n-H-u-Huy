package ss3_array_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class SumColumn {
    public static int total(int[][] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a column want find total it:");
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (a == j) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a length of array 1: ");
        int length1 = scanner.nextInt();
        System.out.println("Input a length of array 2: ");
        int length2 = scanner.nextInt();
        int[][] arr = new int[length1][length2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Input a value of once element "+(i+1));
                arr[i][j] = scanner.nextInt();
            }
        }

        int column;
        do {
            System.out.println("Column want find sum: ");
            column = scanner.nextInt();
            if (column < 0) {
                System.out.println("Column unvalid");
            }
        } while (column < 0);
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Sum of elemnet same columns: " + total(arr));
    }
}
