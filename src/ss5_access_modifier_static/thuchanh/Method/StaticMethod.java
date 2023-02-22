package ss5_access_modifier_static.thuchanh;

public class StaticMethod {
    private String name;
    private int age;
    private static String job = "Coder";

    StaticMethod(String what, int how) {
        name = what;
        age = how;
    }

    static void change() {
        job = "Tester";
    }

    void display() {
        System.out.println("Name: " + name + " Age: " + age + " Job: " + job);
    }
}
