package ss1_intro_java.thuchanh;

import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float pi = 3.14f;
        float r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        r = scanner.nextFloat();
        float per = 2*r*pi;
        float area = r*r*pi;
        System.out.println("Chu vi hình tròn: "+ per);
        System.out.println("Chu vi hình tròn: "+ area);
    }
}
