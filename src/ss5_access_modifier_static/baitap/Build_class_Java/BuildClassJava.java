package ss5_access_modifier_static.baitap.Build_class_Java;

public class BuildClassJava {
    private String name;
    private String classes;

    public BuildClassJava() {
        this.name = "John";
        this.classes = "C02";
    }

    public void setName() {
        this.name = name;
    }

    public void setClasses() {
        this.classes = classes;
    }

    public void display() {
        System.out.println(name + " " + classes);
    }
}
