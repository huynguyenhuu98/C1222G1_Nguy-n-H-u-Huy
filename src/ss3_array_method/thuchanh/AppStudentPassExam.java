package ss3_array_method.thuchanh;

import java.util.Scanner;

public class AppStudentPassExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter a size student in the class: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size do not exceed 30");
            }
        }
        while (size > 30);
        array = new int [size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter information once student: ");
            array[i] = scanner.nextInt();
        }
        int count = 0;
        System.out.println("List point students in the exam: " );
        for (int i = 0; i < array.length; i++) {
            if (array[i]>=5 && array[i]<=10) {
                count++;
            }
        }
        System.out.println("The number of students pass the exam: " +count);
    }
}
