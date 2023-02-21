package ss4_class_object.baitap.QuadraticEquation;

import java.util.Scanner;

public class DisplayQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter value of b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter value of c: ");
        double c = scanner.nextDouble();
        BuildQuadraticEquation quadraticEquation = new BuildQuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("The first solution of equation: " + quadraticEquation.getRoot1());
            System.out.println("The second solution of equation: " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Equation have onlyone solution: " + quadraticEquation.getRoot0());
        } else {
            System.out.println("Quadratic Equation no soulution");
        }
    }
}
