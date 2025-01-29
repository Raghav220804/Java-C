import java.util.Scanner;
import java.util.Stack;

public class PostfixCalculator {

    // Function to check if parentheses are balanced
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // Function to get precedence of operators
    public static int precedence(char op) {
        if (op == '^') return 3;
        if (op == '*' || op == '/') return 2;
        if (op == '+' || op == '-') return 1;
        return 0;
    }

    // Function to convert infix to postfix
    public static String infixToPostfix(String infix) {
        Stack<Character> operators = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char ch : infix.toCharArray()) {
            if (Character.isWhitespace(ch)) continue; // Ignore spaces

            if (Character.isDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    postfix.append(operators.pop());
                }
                operators.pop(); // Remove '('
            } else {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
                    postfix.append(operators.pop());
                }
                operators.push(ch);
            }
        }
        while (!operators.isEmpty()) {
            postfix.append(operators.pop());
        }
        return postfix.toString();
    }

    // Function to evaluate postfix expression
    public static double evaluatePostfix(String postfix) {
        Stack<Double> operands = new Stack<>();
        for (char ch : postfix.toCharArray()) {
            if (Character.isDigit(ch)) {
                operands.push((double) (ch - '0'));
            } else {
                double b = operands.pop();
                double a = operands.pop();
                switch (ch) {
                    case '+': operands.push(a + b); break;
                    case '-': operands.push(a - b); break;
                    case '*': operands.push(a * b); break;
                    case '/': operands.push(a / b); break;
                    case '^': operands.push(Math.pow(a, b)); break;
                }
            }
        }
        return operands.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String postfix = infixToPostfix(input);
        double result = evaluatePostfix(postfix);
        System.out.println(result);
          
        scanner.close();
    }
}