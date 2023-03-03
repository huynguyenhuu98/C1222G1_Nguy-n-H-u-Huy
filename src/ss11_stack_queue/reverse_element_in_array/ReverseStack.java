package ss11_stack_queue.reverse_element_in_array;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void numberStack() {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount element in array: ");
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value of once element: ");
            int value = Integer.parseInt(scanner.nextLine());
            stack.push(value);
        }
        System.out.println(stack);
        for (int i = size; i > 0; i--) {
            stack1.push(stack.peek());
            stack.pop();
        }
        System.out.println(stack1);
    }

    public static void main(String[] args) {
        numberStack();
    }
}
