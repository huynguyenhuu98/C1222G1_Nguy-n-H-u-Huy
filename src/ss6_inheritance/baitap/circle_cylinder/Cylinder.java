package ss6_inheritance.baitap.circle_cylinder;

import ss6_inheritance.baitap.circle_cylinder.Circle;

public class Cylinder extends Circle {
    private int height;

    public Cylinder() {

    }

    public Cylinder(int radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public double volume() {
        return getRadius() * getRadius() * 3.14 * this.height;
    }

    public String toString() {
        return "Hight of CYLINDER: " + this.height + " | Color of circle: " + this.getColor() + " | Volumn of CYLINDER: " + volume();
    }
}
