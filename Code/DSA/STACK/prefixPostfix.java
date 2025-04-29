import java.util.Stack;
public class prefixPostfix {
    public static void main(String[] args) {
        String infix = "[{(2+4)+(6*8)}+7]";
        solve(infix);
    }
    public static void solve(String infix){
        Stack<String> prefix = new Stack<>();
        Stack<Character> operator = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for(int i=0;i<infix.length();i++){
            char ch = infix.charAt(i);
            if(ch == '(' ||ch== '{'||ch == '['){
                operator.push((ch));
            }
            else if(ch == ')'){
                while(!operator.isEmpty() && operator.peek() != '('){
                    if(prefix.size() >=2 && postfix.size()>=2){
                        char opr = operator.pop();
                        //prefix :
                        String v2 = prefix.pop();
                        String v1 = prefix.pop();
                        
                        String ans = opr + v1 + v2;
                        prefix.push(ans);
                        
                        //postfix :
                        String p2 = postfix.pop();
                        String p1 = postfix.pop();
                        
                        String final_value = p1 + p2 + opr;
                        postfix.push(final_value);
                    }
                    // else break;
                }
                
                    operator.pop();  
                
            }
            else if(ch == '}'){
                while(!operator.isEmpty() && operator.peek() != '{'){
                    if(prefix.size() >=2 && postfix.size()>=2){
                        char opr = operator.pop();
                        //prefix :
                        String v2 = prefix.pop();
                        String v1 = prefix.pop();
                        
                        String ans = opr + v1 + v2;
                        prefix.push(ans);
                        
                        //postfix :
                        String p2 = postfix.pop();
                        String p1 = postfix.pop();
                        
                        String final_value = p1 + p2 + opr;
                        postfix.push(final_value);
                    }
                }
                    operator.pop();  
            }
            else if(ch == ']'){
                while(!operator.isEmpty() && operator.peek() != '['){
                    if(prefix.size() >=2 && postfix.size()>=2){
                        char opr = operator.pop();
                        //prefix :
                        String v2 = prefix.pop();
                        String v1 = prefix.pop();
                        
                        String ans = opr + v1 + v2;
                        prefix.push(ans);
                        
                        //postfix :
                        String p2 = postfix.pop();
                        String p1 = postfix.pop();
                        
                        String final_value = p1 + p2 + opr;
                        postfix.push(final_value);
                    }
                }
                    operator.pop();  
            }
            else if(Character.isDigit(ch)){
                prefix.push(ch+"");
                postfix.push(ch+"");
            }
            else {
                while (!operator.isEmpty() && 
                      !(operator.peek() == '(' || operator.peek() == '{' || operator.peek() == '[') && 
                      priority_order(ch) <= priority_order(operator.peek()) && 
                      prefix.size() >=2 && 
                      postfix.size()>=2) {
                    
                    char opr = operator.pop();
                    //prefix :
                    String v2 = prefix.pop();
                    String v1 = prefix.pop();

                    String ans = opr + v1 + v2;
                    prefix.push(ans);

                    //postfix :
                    String p2 = postfix.pop();
                    String p1 = postfix.pop();

                    String final_value = p1 + p2 + opr;
                    postfix.push(final_value);
                }
                operator.push(ch);
            }
        }
        
        // Process remaining operators
        while (!operator.isEmpty() && prefix.size() >=2 && postfix.size()>=2) {
            char opr = operator.pop();
            //prefix :
            String v2 = prefix.pop();
            String v1 = prefix.pop();

            String ans = opr + v1 + v2;
            prefix.push(ans);

            //postfix :
            String p2 = postfix.pop();
            String p1 = postfix.pop();

            String final_value = p1 + p2 + opr;
            postfix.push(final_value);
        }
        
        System.out.println( prefix.peek());
        System.out.println( postfix.peek());
    }
    public static int priority_order(char ch){
        if(ch == '-' || ch == '+') return 1;
        else if(ch == '*' || ch == '/') return 2;
        return 3;
    }
}















/*import java.util.Stack;
class Main {
    public static void main(String[] args) {
        String infix = "6*(8+3)";
        solve(infix);
    }
    // +++24*687
    // 24+68*+7+
    public static void solve(String infix){
        Stack<String> prefix = new Stack<>();
        Stack<Character> operator = new Stack<>();
        Stack<String> postfix = new Stack<>();
        
        for(int i = 0 ; i < infix.length() ; i++){
            char ch = infix.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                operator.push(ch);
            }
            // || ch == ']' || ch == '}'
            else if(ch == ')' ){
                while(!operator.isEmpty() && operator.peek() != '(' && prefix.size() >= 2 && postfix.size() >= 2){
                    char opr = operator.pop();
                    // prefix
                    String v2 = prefix.pop();
                    String v1 = prefix.pop();
                    String ans = opr + v1 + v2;
                    prefix.push(ans);
                    // postfix
                    String p2 = postfix.pop();
                    String p1 = postfix.pop();
                    String final_value = p1 + p2 + opr;
                    postfix.push(final_value);
                }
                operator.pop();
            }
            else if(ch == ']' ){
                while(!operator.isEmpty() && operator.peek() != '[' && prefix.size() >= 2 && postfix.size() >= 2){
                    char opr = operator.pop();
                    // prefix
                    String v2 = prefix.pop();
                    String v1 = prefix.pop();
                    String ans = opr + v1 + v2;
                    prefix.push(ans);
                    // postfix
                    String p2 = postfix.pop();
                    String p1 = postfix.pop();
                    String final_value = p1 + p2 + opr;
                    postfix.push(final_value);
                }
                operator.pop();
            }
            else if(ch == '}' ){
                while(!operator.isEmpty() && operator.peek() != '{' && prefix.size() >= 2 && postfix.size() >= 2 ){
                    char opr = operator.pop();
                    // prefix
                    String v2 = prefix.pop();
                    String v1 = prefix.pop();
                    String ans = opr + v1 + v2;
                    prefix.push(ans);
                    // postfix
                    String p2 = postfix.pop();
                    String p1 = postfix.pop();
                    String final_value = p1 + p2 + opr;
                    postfix.push(final_value);
                }
                operator.pop();
            }
            else if(Character.isDigit(ch)){
                // System.out.pr
                prefix.push(ch+"");
                postfix.push(ch+"");
            }
            else{
                // operator
                while( !operator.isEmpty() && (operator.peek() != '(' || operator.peek() != '[' || operator.peek() != '{') && priority_order(ch) <= priority_order(operator.peek()) && prefix.size() >= 2 && postfix.size() >= 2  ){
                    char opr = operator.pop();
                    // prefix
                    String v2 = prefix.pop();
                    String v1 = prefix.pop();
                    String ans = opr + v1 + v2;
                    prefix.push(ans);
                    // postfix
                    String p2 = postfix.pop();
                    String p1 = postfix.pop();
                    // String final_value =;
                    postfix.push( p1 + p2 + opr);
                }
                operator.push(ch);
            }
        }
        
        while(!operator.isEmpty() && prefix.size() >= 2 && postfix.size() >= 2){
                    char opr = operator.pop();
                    // prefix
                    String v2 = prefix.pop();
                    String v1 = prefix.pop();
                    String ans = opr + v1 + v2;
                    prefix.push(ans);
                    // postfix
                    String p2 = postfix.pop();
                    String p1 = postfix.pop();
                    String final_value = p1 + p2 + opr;
                    postfix.push(final_value);
        }
        
            System.out.println(prefix.peek());
            System.out.println(postfix.peek());
    }
    
    public static int priority_order(char ch){
        if(ch == '-' || ch == '+')
            return 1;
        else if(ch == '*' || ch == '/')
            return 2;
        else 
            return 3;
    }
    
    
}*/
