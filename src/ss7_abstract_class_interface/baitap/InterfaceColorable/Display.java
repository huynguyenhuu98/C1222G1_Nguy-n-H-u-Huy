package ss7_abstract_class_interface.baitap.InterfaceColorable;

public class Display {
    public static void main(String[] args) {
        Square square1 = new Square(20, "blue", false);
        square1.howToColor();
        System.out.println(square1);
    }
}
