package ss19_string_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BienSoXe {
    public static final String REGEX_BIEN_SO_XE = "^[1-9]{2}-[A-Z][1-9] [0-9]{5}$";
    public static boolean checkBienSoXe (String string) {
        Pattern pattern = Pattern.compile(REGEX_BIEN_SO_XE);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển số xe để kiểm tra: ");
        String bienSO = scanner.nextLine();
        System.out.println(checkBienSoXe(bienSO));
    }
}
