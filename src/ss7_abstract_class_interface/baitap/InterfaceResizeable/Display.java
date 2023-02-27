package ss7_abstract_class_interface.baitap.InterfaceResizeable;

public class Display {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        circle1.resize(20);
        System.out.println(circle1);

        Rectangle rectangle1 = new Rectangle(15,20);
        rectangle1.resize(20);
        System.out.println(rectangle1);

        Square square1 = new Square(20);
        square1.resize(20);
        System.out.println(square1);
    }
}
