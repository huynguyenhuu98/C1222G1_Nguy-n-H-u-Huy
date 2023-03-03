package ss1_intro_java.thuchanh;

import java.util.Scanner;

public class FirstEquation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver ax+b=c");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        float a = scanner.nextFloat();
        System.out.print("b: ");
        float b = scanner.nextFloat();
        System.out.print("c: ");
        float c = scanner.nextFloat();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
