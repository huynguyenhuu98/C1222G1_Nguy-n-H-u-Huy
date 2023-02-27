package ss7_abstract_class_interface.baitap.InterfaceResizeable;

import ss7_abstract_class_interface.baitap.InterfaceResizeable.IResizeable;
import ss7_abstract_class_interface.baitap.InterfaceResizeable.Shape;

public class Square extends Shape implements IResizeable {
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
        return "Square have edge square = "
                + getEdge()
                + " | the aria square is =  "
                + getArea();
    }

    @Override
    public void resize(double percent) {
        this.edge += this.edge * (percent / 100);
    }
}
