package ss7_abstract_class_interface.baitap.InterfaceColorable;

public class Square extends Shape implements IColorable {
    private double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(double edge, String color, boolean filled) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return this.edge * this.edge;
    }

    @Override
    public String toString() {
        return "Square with width = "
                + getEdge()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");

    }
}
