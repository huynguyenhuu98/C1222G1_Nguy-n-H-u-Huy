package ss11_stack_queue.reverse_element_in_array;

import java.util.Stack;
import java.lang.StringBuilder;

public class ReverseStackString {

    public static String reverseString() {
        String input = "Nguyen Huu Huy";
        Stack<String> stack = new Stack<>();
        String[] words = input.split(" ");

        for (String word : words) {
            stack.push(word);
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            String word = stack.pop();
            sb.append(word).append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(ReverseStackString.reverseString());
    }
}