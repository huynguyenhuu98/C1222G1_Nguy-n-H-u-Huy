package ss2_loop_array.baitap;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input numbers of prime to show: ");
        int number = scanner.nextInt();
        int counts = 0;
        int count = 0;
        for (int i = 2; i < 200; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println(i);
                counts++;
            }
            count = 0;
            if (counts==number){
                break;
            }
        }
    }
}
