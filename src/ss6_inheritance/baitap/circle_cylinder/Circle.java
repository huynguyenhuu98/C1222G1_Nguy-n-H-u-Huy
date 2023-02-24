package ss6_inheritance.baitap.circle_cylinder;

public class Circle {
    private int radius;
    private String color;

    public Circle() {

    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area() {
        return this.radius * this.radius * 3.14;
    }

    public String toString() {
        return "Radius of circle: " + radius + " | Area of circle: " + area() + " | Color of circle: " + color;
    }
}
