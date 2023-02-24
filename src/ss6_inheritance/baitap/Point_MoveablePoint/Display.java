package ss6_inheritance.baitap.Point_MoveablePoint;


public class Display {
    public static void main(String[] args) {
        Point point = new Point(11,22);
        System.out.println(point);

        MovablePoint pointMova = new MovablePoint(1,2,33, 44);
        System.out.println(pointMova);

        System.out.println("Move + "+pointMova.move());
    }
}
