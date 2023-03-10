package ss19_string_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number phone to check: ");
        String numberPhone = scanner.nextLine();
        System.out.println(checkNumberPhone(numberPhone));
    }

    public static boolean checkNumberPhone(String string) {
        Pattern pattern = Pattern.compile(REGEX_NUMBER_PHONE);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static final String REGEX_NUMBER_PHONE = "^[(]\\d{2}[)]-[(]0\\d{9}[)]$";
}
