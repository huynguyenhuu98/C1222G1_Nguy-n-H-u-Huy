package ss5_access_modifier_static.thuchanh.Proprety;

public class TestPropertyCar {
    public void main(String[] args) {
        PropertyCar car1 = new PropertyCar("Lamborghini", "turbo V12");
        car1.display();
        System.out.println(PropertyCar.numberCar);
        PropertyCar car2 = new PropertyCar("Ferrari", "turbo V10");
        car2.display();
        System.out.println(PropertyCar.numberCar);
        PropertyCar car3 = new PropertyCar("Mercedes G63", "turbo V8");
        car3.display();
        System.out.println(PropertyCar.numberCar);
    }
}
