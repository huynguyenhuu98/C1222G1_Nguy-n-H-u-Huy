package ss1_intro_java.thuchanh;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tháng cần xem số ngày: ");
        byte month = scanner.nextByte();
        switch (month) {
            case 2:
                System.out.println("Tháng 2 có 28 ngày (năm nhuận) hoặc 29 ngày (năm không nhuận)");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng  " + month + "có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng  " + month + "có 30 ngày");
                break;
            default:
                System.out.println("Tháng nhập bị sai");
                break;
        }
    }
}



