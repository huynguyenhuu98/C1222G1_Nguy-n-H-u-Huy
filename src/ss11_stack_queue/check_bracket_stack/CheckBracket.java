package ss11_stack_queue.check_bracket_stack;

import java.util.Stack;

public class CheckBracket {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char left = stack.pop();

                if ((c == ')' && left != '(') || (c == ']' && left != '[') || (c == '}' && left != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "s * (s – a) * (s – b * (s – c)";
        boolean balanced = isBalanced(expression);

        if (balanced) {
            System.out.println("The expression is balanced.");
        } else {
            System.out.println("The expression is not balanced.");
        }
    }
}

