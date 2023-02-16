package ss1_intro_java.baitap;

import java.util.Scanner;

public class ShowGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name: ");
        String name = scanner.nextLine();
        System.out.println("Say hello: " + name);
    }
}
