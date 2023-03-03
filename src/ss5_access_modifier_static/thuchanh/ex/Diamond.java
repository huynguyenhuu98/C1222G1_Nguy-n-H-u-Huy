package ss5_access_modifier_static.thuchanh.ex;

public class Diamond {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("+");
            }
            System.out.println(i);
        }
        int count = 5;
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            count--;
            System.out.println(count);
        }
    }
}
