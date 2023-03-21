package case_study_module2.common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean checkIdVilla(String string) {
        Pattern pattern = Pattern.compile("^[SVVL]-[0-9]{4}$");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public static boolean checkIdHouse(String string) {
        Pattern pattern = Pattern.compile("^[SVHO]-[0-9]{4}$");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public static boolean checkIdRoom(String string) {
        Pattern pattern = Pattern.compile("^[SVRO]-[0-9]{4}$");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public static boolean checkName(String string) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+$");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public static boolean checkNamePeople(String string) {
        Pattern pattern = Pattern.compile("^([A-Z][a-z]*)(\\s[A-Z][a-z]*)*$");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public static boolean checkPhoneNumber(String string){
        Pattern pattern = Pattern.compile("^0[0-9]{9}$");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public static boolean checkIdCard(String string){
        Pattern pattern = Pattern.compile("^[0-9]{9}$");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public static boolean checkEmail(String string){
        Pattern pattern = Pattern.compile("^\\w+@\\w+.com$");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public static String localDate(LocalDate date){
        DateTimeFormatter simpleDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return simpleDateFormat.format(date);
    }

    public static LocalDate toLocalDate(String dateInString){
        DateTimeFormatter simpleDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate result = null;
        try{
            result =  LocalDate.parse(dateInString, simpleDateFormat);
        } catch (DateTimeParseException e){
            System.out.println("You should enter date in format:dd-MM-yyyy ");
        }
        return result;
    }
}
