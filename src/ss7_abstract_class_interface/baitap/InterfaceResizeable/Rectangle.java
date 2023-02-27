package ss7_abstract_class_interface.baitap.InterfaceResizeable;

public class Rectangle extends Shape implements IResizeable {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    @Override
    public String toString() {
        return "Rectangle with width = "
                + getWidth()
                + " | and length="
                + getLength()
                + " | the aria is =  "
                + getArea();
    }

    @Override
    public void resize(double percent) {
        this.width += this.width * (percent / 100);
        this.length = this.length * (percent / 100);

    }
}
