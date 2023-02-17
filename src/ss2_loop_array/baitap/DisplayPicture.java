package ss2_loop_array.baitap;

import java.util.Scanner;

public class DisplayPicture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a type shape: 1/rectangle; square triangle (2/top-left, " +
                "3/top-right, 4/botton-left, 5/botton-right) 6/isosceles triangle");
        int type = scanner.nextInt();
        if (type == 1) {
            System.out.println("Input a width of rectangle");
            int a = scanner.nextInt();
            System.out.println("Input a length of rectangle");
            int b = scanner.nextInt();
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        } else if (type == 2) {
            System.out.println("Input a height of triangle");
            int a = scanner.nextInt();
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        } else if (type == 3) {
            System.out.println("Input a height of triangle");
            int a = scanner.nextInt();
            for (int i = a; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        } else if (type == 4) {
            System.out.println("Input a height of triangle");
            int a = scanner.nextInt();
            for (int i = 1; i <= a; i++) {
                for (int j = a - 1; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (type == 5) {
            System.out.println("Input a height of triangle");
            int a = scanner.nextInt();
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = a; k > i; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (type == 6) {
            System.out.println("Input a height of isosceles triangle");
            int a = scanner.nextInt();
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= a - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

