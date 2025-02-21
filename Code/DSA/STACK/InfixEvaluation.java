import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        String str = "(2+3*(3*5)+(2+9)*10)";
        
        Stack<Character> operator = new Stack<>();
        Stack<Integer> operands = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == '(') {
                operator.push(ch);
            } else if (ch == ')') {
                while (operator.peek() != '(') {
                    char opr = operator.pop();
                    int b = operands.pop();
                    int a = operands.pop();
                    int ans = performOperation(a, b, opr);
                    operands.push(ans);
                }
                operator.pop();
                
            } else if (Character.isDigit(ch)) {
                int num = 0;
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    num = num * 10 + (str.charAt(i) - '0');
                    i++;
                }
                i--;
                operands.push(num);
            } else {
                while (!operator.isEmpty() && operator.peek() != '(' && priorityCheck(ch) <= priorityCheck(operator.peek())) {
                    char opr = operator.pop();
                    int b = operands.pop();
                    int a = operands.pop();
                    int ans = performOperation(a, b, opr);
                    operands.push(ans);
                }
                operator.push(ch);
            }
        }
        
        while (!operator.isEmpty()) {
            char opr = operator.pop();
            int b = operands.pop();
            int a = operands.pop();
            int ans = performOperation(a, b, opr);
            operands.push(ans);
        }
        
        System.out.println(operands.peek());
    }
    
    public static int performOperation(int a, int b, char opr) {
        switch (opr) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }
    
    public static int priorityCheck(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
}
