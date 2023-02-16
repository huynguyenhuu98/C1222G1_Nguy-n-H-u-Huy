package ss1_intro_java.baitap;

import java.util.Scanner;

public class NumberToChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num >= 0 && num < 10) {
            switch (num) {
                case 0:
                    System.out.print("Zero");
                    break;
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
            }
        } else if (num >= 10 && num < 20) {
            switch (num) {
                case 10:
                    System.out.print("Ten");
                    break;
                case 11:
                    System.out.print("Eleven");
                    break;
                case 12:
                    System.out.print("Twelve");
                    break;
                case 13:
                    System.out.print("Thirteen");
                    break;
                case 14:
                    System.out.print("Fourteen");
                    break;
                case 15:
                    System.out.print("Fifteen");
                    break;
                case 16:
                    System.out.print("Sixteen");
                    break;
                case 17:
                    System.out.print("Seventeen");
                    break;
                case 18:
                    System.out.print("Eightteen");
                    break;
                case 19:
                    System.out.print("Nineteen");
                    break;
            }
        } else if (num >= 20 && num < 100) {
            int a = num / 10;
            int b = num % 10;
            switch (a) {
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Fourty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Ninety");
                    break;
            }
            switch (b) {
                case 1:
                    System.out.print(" One");
                    break;
                case 2:
                    System.out.print(" Two");
                    break;
                case 3:
                    System.out.print(" Three");
                    break;
                case 4:
                    System.out.print(" Four");
                    break;
                case 5:
                    System.out.print(" Five");
                    break;
                case 6:
                    System.out.print(" Six");
                    break;
                case 7:
                    System.out.print(" Seven");
                    break;
                case 8:
                    System.out.print(" Eight");
                    break;
                case 9:
                    System.out.print(" Nine");
                    break;
            }

        } else if (num >= 100 && num <= 999) {
            int a = num / 100;
            int b = (num % 100) / 10;
            int b1 = num % 100;
            int c = (num % 100) % 10;
            switch (a) {
                case 1:
                    System.out.print("One Hundred");
                    break;
                case 2:
                    System.out.print("Two Hundred");
                    break;
                case 3:
                    System.out.print("Three Hundred");
                    break;
                case 4:
                    System.out.print("Four Hundred");
                    break;
                case 5:
                    System.out.print("Five Hundred");
                    break;
                case 6:
                    System.out.print("Six Hundred");
                    break;
                case 7:
                    System.out.print("Seven Hundred");
                    break;
                case 8:
                    System.out.print("Eight Hundred");
                    break;
                case 9:
                    System.out.print("Nine Hundred");
                    break;
            }
            if (b1 >= 10 && b1 < 20) {
                switch (b1) {
                    case 10:
                        System.out.print(" Ten");
                        break;
                    case 11:
                        System.out.print(" Eleven");
                        break;
                    case 12:
                        System.out.print(" Twelve");
                        break;
                    case 13:
                        System.out.print(" Thirteen");
                        break;
                    case 14:
                        System.out.print(" Fourteen");
                        break;
                    case 15:
                        System.out.print(" Fifteen");
                        break;
                    case 16:
                        System.out.print(" Sixteen");
                        break;
                    case 17:
                        System.out.print(" Seventeen");
                        break;
                    case 18:
                        System.out.print(" Eightteen");
                        break;
                    case 19:
                        System.out.print(" Nineteen");
                        break;
                }
            }
            switch (b) {
                case 2:
                    System.out.print(" Twenty");
                    break;
                case 3:
                    System.out.print(" Thirty");
                    break;
                case 4:
                    System.out.print(" Fourty");
                    break;
                case 5:
                    System.out.print(" Fifty");
                    break;
                case 6:
                    System.out.print(" Sixty");
                    break;
                case 7:
                    System.out.print(" Seventy");
                    break;
                case 8:
                    System.out.print(" Eighty");
                    break;
                case 9:
                    System.out.print(" Ninety");
                    break;
            }
            if (b >= 2) {
                switch (c) {
                    case 1:
                        System.out.print(" One");
                        break;
                    case 2:
                        System.out.print(" Two");
                        break;
                    case 3:
                        System.out.print(" Three");
                        break;
                    case 4:
                        System.out.print(" Four");
                        break;
                    case 5:
                        System.out.print(" Five");
                        break;
                    case 6:
                        System.out.print(" Six");
                        break;
                    case 7:
                        System.out.print(" Seven");
                        break;
                    case 8:
                        System.out.print(" Eight");
                        break;
                    case 9:
                        System.out.print(" Nine");
                        break;
                }
            }
        }
    }
}