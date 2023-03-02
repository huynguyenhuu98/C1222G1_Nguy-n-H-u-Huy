package ss11_stack_queue.check_palindrome;

import java.util.LinkedList;
import java.util.Queue;

public class CheckPalindrome {
    public static void main(String[] args) {
        String inputString = "ab cd efe dc ba";

        Queue<Character> queue = new LinkedList<>();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            char character = inputString.charAt(i);
            queue.add(character);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            char charRemove = queue.remove();
            if (character != charRemove) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("This string is string Palindrome.");
        } else {
            System.out.println("This is not string Palindrome.");
        }
    }
}

