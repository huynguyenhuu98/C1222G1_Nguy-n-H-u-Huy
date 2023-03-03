package ss3_array_method.thuchanh;

import java.util.Scanner;

public class FindValueArray {
    public static void main(String[] args) {
        String[] cars = {"Honda", "Yamaha", "Suzuki", "SYM", "BMW", "Kawazaki"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name car to find");
        String namecar = scanner.nextLine();
        boolean result = false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(namecar)) {
                System.out.println("Car you need find in the list " + namecar + " is: " + (i + 1));
                result = true;
                break;
            }
        }
        if (!result) {
            System.out.println("Have not car to find in the list" + namecar);
        }
    }
}
