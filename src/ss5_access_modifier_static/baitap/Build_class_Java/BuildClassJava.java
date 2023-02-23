package ss5_access_modifier_static.baitap.Build_class_Java;

public class BuildClassJava {
    private String name = "John";
    private String classes  = "C02";

    public BuildClassJava() {
    }

    public String setName(String first) {
        return name = first;
    }

    public String setClasses(String second) {
        return classes = second;
    }

    public void display() {
        System.out.println(name + " " + classes);
    }
}
