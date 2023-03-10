package ss19_string_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    public static boolean checkNameClass(String string) {
        Pattern pattern = Pattern.compile(REGEX_NAME_CLASS);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static final String REGEX_NAME_CLASS = "^(C|A|P)+[0-9]{4}+(G|H|I|K)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any name class: ");
        String nameClass = scanner.nextLine();
        System.out.println(checkNameClass(nameClass));
    }
}
