package ss5_access_modifier_static.baitap.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getRadius();
        circle.getColor();
        Circle circle1 = new Circle(10);
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());
        System.out.println(circle1.getRadius());
    }
}
