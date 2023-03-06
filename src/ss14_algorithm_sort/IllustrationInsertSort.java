package ss14_algorithm_sort;

import java.util.Scanner;

public class IllustrationInsertSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertSortByStep(list);
    }

    //codes below here
    public static void insertSortByStep(int[] list) {

        int pos;
        int x;
        for (int k = 1; k < list.length; k++) {
            x = list[k];
            pos = k;
            while (pos > 0 && x < list[pos - 1]) {
                /* Swap list[i] with list[i + 1] */
                System.out.println("Swap " + list[k] + " with " + list[k - 1]);
                list[pos] = list[pos - 1]; // change
                pos--;
            }
            list[pos] = x;

            /* Show the list after sort */
            System.out.print("List after the " + k + " sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}

