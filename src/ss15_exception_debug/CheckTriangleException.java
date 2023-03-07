package ss15_exception_debug;

import java.util.Scanner;

public class CheckTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckTriangleEdges check = new CheckTriangleEdges();
        try {
            System.out.println("Enter first edge of triangle: ");
            double edge1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter second edge of triangle: ");
            double edge2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter third edge of triangle: ");
            double edge3 = Integer.parseInt(scanner.nextLine());
            try {
                check.checkTriangleEdges(edge1,edge2,edge3);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Cannot : valid");
        }
        scanner.close();
    }
}
