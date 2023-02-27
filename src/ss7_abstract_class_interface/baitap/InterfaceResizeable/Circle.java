package ss7_abstract_class_interface.baitap.InterfaceResizeable;

public class Circle extends Shape implements IResizeable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        this.radius += this.radius * (percent / 100);
    }

    public double getArea() {
        return this.radius * this.radius * 3.14;
    }


    @Override
    public String toString() {
        return "Circle with radius = "
                + getRadius()
                + " | area of circle = "
                + getArea();
    }


}

