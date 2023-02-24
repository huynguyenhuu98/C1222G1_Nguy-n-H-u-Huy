package ss6_inheritance.baitap.circle_cylinder;

import ss6_inheritance.baitap.circle_cylinder.Circle;
import ss6_inheritance.baitap.circle_cylinder.Cylinder;

public class DisplayCircleCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle(6, "RED");
        Circle circle2 = new Circle(16, "BLUE");
        Cylinder cylinder1 = new Cylinder(8, "WHITE", 10);
        Cylinder cylinder2 = new Cylinder(18, "BLACK", 20);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(cylinder1);
        System.out.println(cylinder2);
    }
}
