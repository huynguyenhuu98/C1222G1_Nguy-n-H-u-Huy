package ss3_array_method.baitap;

import java.util.Scanner;

public class CountCharacterString {
    public static void countCharacter(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a character: ");
        char find = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (find == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Amount character in the string is: " + count);
    }
    public static void main(String[] args) {
        String car = "mercedes lamboghini ferrari";
        countCharacter(car);
    }
}