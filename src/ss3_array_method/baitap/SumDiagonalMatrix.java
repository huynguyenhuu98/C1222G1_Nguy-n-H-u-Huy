package ss3_array_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonalMatrix {
    public static int total(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
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
                System.out.println("Input a value of once element " + (i + 1));
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr));
        System.out.println("Sum of diagonal matrix: " + total(arr));
    }
}
