package ss13_search_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class StringMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> max = new ArrayList<>();
        ArrayList<Character> list = new ArrayList<>();
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.get(string.length() - 1) && list.contains(string.charAt(i))) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }

        for (Character arrayMax : max) {
            System.out.print(arrayMax);
        }
    }
}
