package ss4_class_object.baitap.ClassFan;

public class DisplayClassFan {

    public static void main(String[] args) {
        BuildClassFan fan1 = new BuildClassFan();
        fan1.setSpeed(BuildClassFan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        BuildClassFan fan2 = new BuildClassFan();
        fan2.setSpeed(BuildClassFan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}


