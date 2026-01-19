package hwt;

import java.util.Stack;

public class BracketChecker {
    public static void main(String[] args) {
        String s = "({[()]}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // Closing bracket — stack must NOT be empty
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // Check matching pair
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // all brackets matched
    }
}

