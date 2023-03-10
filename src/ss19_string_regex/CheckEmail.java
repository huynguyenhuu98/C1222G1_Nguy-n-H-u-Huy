package ss19_string_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = scanner.nextLine();
        System.out.println(checkEmail(email));
    }
    public static boolean checkEmail (String string) {
        Pattern pattern = Pattern.compile(REGEX_CHECK_MAIL);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public static final String REGEX_CHECK_MAIL = "^+[a-z0-9]{6,32}@[a-z]+(\\.[com]+)$";
}
