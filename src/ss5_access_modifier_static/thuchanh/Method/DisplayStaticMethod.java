package ss5_access_modifier_static.thuchanh;

public class DisplayStaticMethod {
    public static void main(String[] args) {

        StaticMethod object1 = new StaticMethod("John", 23);

        StaticMethod object2 = new StaticMethod("Henry", 24);
        StaticMethod object3 = new StaticMethod("Jack", 25);
        object1.display();
        StaticMethod.change();
        object2.display();
        object3.display();
    }
}
