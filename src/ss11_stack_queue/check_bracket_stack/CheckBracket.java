package ss11_stack_queue.check_bracket_stack;

import java.util.Stack;

public class CheckBracket {
    public static boolean isBalanced(String expression) {
        Stack<Character> bStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char sympol = expression.charAt(i);
            if (sympol == '(' || sympol == '[' || sympol == '{') {
                bStack.push(sympol);
            } else if (sympol == ')' || sympol == ']' || sympol == '}') {
                if (bStack.isEmpty()) {
                    return false;
                }
                char left = bStack.pop();
                if ((sympol == ')' && left != '(') || (sympol == ']' && left != '[') || (sympol == '}' && left != '{')) {
                    return false;
                }
            }
        }
        return bStack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "s * (s – a) * (s – b * (s – c)";
        boolean balanced = isBalanced(expression);

        if (balanced) {
            System.out.println("The expression is Balanced.");
        } else {
            System.out.println("The expression is not Balanced.");
        }
    }
}

