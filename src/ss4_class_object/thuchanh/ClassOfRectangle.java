package ss4_class_object.thuchanh;

import java.util.Scanner;

public class ClassOfRectangle {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the width:");
            double width = scanner.nextDouble();
            System.out.print("Enter the height:");
            double height = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(width, height);
            Rectangle rectangle1 = new Rectangle();
            System.out.println("Your Rectangle \n" + rectangle.display());
            System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
            System.out.println("Area of the Rectangle: " + rectangle.getArea());
            System.out.println("Do not value of Rectangle: " + rectangle1);
        }
    }

