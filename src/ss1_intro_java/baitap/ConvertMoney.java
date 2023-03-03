package ss1_intro_java.baitap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        int usd;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Input amount DOLLAR need convert: ");
            usd = scanner.nextInt();
        } while (usd < 0);
        double vnd = usd * 24567;
        System.out.print("VND was converted: " + vnd + "VND");
    }
}



