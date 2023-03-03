package ss1_intro_java.thuchanh;

import java.util.Scanner;

public class WightBody {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your wight (kg ");
        float wight = scanner.nextFloat();
        System.out.println("input your hight (m) ");
        float hight = scanner.nextFloat();
        float bmi = wight / (hight*hight);
        if (bmi <18.5){
            System.out.println("Underweight");
        } else if (bmi<25){
            System.out.println("Normal");
        } else if (bmi <30){
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
