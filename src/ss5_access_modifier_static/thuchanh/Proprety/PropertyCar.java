package ss5_access_modifier_static.thuchanh.Proprety;

public class PropertyCar {
    private final String name;
    private final String technology;
    public static int numberCar;
    public PropertyCar(String name, String technology) {
        this.name = name;
        this.technology = technology;
        numberCar++;
    }
    public void display() {
        System.out.println(name + technology);
    }
}
