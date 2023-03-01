package ss11_stack_queue.check_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string to check: ");
        String inputString = scanner.nextLine().toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            char c = inputString.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                queue.add(c);
            }
        }

        boolean isPalindrome = true;
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                char d = queue.remove();
                if (c != d) {
                    isPalindrome = false;
                    break;
                }
            }
        }

        if (isPalindrome) {
            System.out.println("This string is string Palindrome.");
        } else {
            System.out.println("This is not string Palindrome.");
        }
    }
}

