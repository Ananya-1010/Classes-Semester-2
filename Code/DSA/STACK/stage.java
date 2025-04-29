import java.util.Stack;

public class Stage {
    public static void main(String[] args) {
        String infix = "[{(2+4)+(6*8)}+7]";
        solve(infix);
    }

    public static void solve(String str) {
        Stack<String> prefix = new Stack<>();
        Stack<Character> operator = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                operator.push(ch);
            } else if (ch == ')') {
                while (!operator.isEmpty() && operator.peek() != '(') {
                    processStacks(prefix, postfix, operator);
                }
                operator.pop(); // Remove '('
            } else if (ch == ']') {
                while (!operator.isEmpty() && operator.peek() != '[') {
                    processStacks(prefix, postfix, operator);
                }
                operator.pop(); // Remove '['
            } else if (ch == '}') {
                while (!operator.isEmpty() && operator.peek() != '{') {
                    processStacks(prefix, postfix, operator);
                }
                operator.pop(); // Remove '{'
            } else if (Character.isDigit(ch)) {
                prefix.push(ch + "");
                postfix.push(ch + "");
            } else {
                while (!operator.isEmpty() && operator.peek() != '(' && operator.peek() != '[' && operator.peek() != '{' 
                        && priority_order(ch) <= priority_order(operator.peek())) {
                    processStacks(prefix, postfix, operator);
                }
                operator.push(ch); // Push current operator onto the stack
            }
        }

        // Process remaining operators
        while (!operator.isEmpty()) {
            processStacks(prefix, postfix, operator);
        }

        System.out.println("Prefix Expression: " + prefix.peek());
        System.out.println("Postfix Expression: " + postfix.peek());
    }

    public static void processStacks(Stack<String> prefix, Stack<String> postfix, Stack<Character> operator) {
        char opr = operator.pop();
        
        // Prefix processing
        String v2 = prefix.pop();
        String v1 = prefix.pop();
        String ans = opr + v1 + v2;
        prefix.push(ans);

        // Postfix processing
        String a2 = postfix.pop();
        String a1 = postfix.pop();
        String res = a1 + a2 + opr;
        postfix.push(res);
    }

    public static int priority_order(char ch) {
        if (ch == '-' || ch == '+') return 1;
        else if (ch == '*' || ch == '/') return 2;
        else return 3;
    }
}