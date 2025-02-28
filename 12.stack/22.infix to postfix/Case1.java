import java.util.*;
public class Case1 {
    static int prec(char c){
        switch (c) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;
        
            case '^':
                return 3;
        }
        return -1;
    }
    static String infixToPostfix(String exp){
        String res="";
        Stack<Character> s=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                res=res+c;
            }
            else if(c=='('){
                s.push(c);
            }
            else if(c==')'){
                while (!s.isEmpty() && s.peek()!='(') {
                    res=res+s.pop();
                }
                if (s.isEmpty() || s.peek() != '(') {
                    return "Invalid Expression"; // Invalid expression
                } else{
                    s.pop();// Pop '('
                }
               
                // //  it means that there are no matching opening parentheses for the current closing parenthesis, indicating an invalid expression

                // // If the stack is not empty and the top of the stack is indeed an opening parenthesis, it means that the opening parenthesis has been found and matched with the current closing parenthesis. Thus, it pops the opening parenthesis from the stack to balance the parentheses.
                // if (!s.isEmpty() && s.peek()!='('){
                //     return "invalid expression";
                // }
                // // it executes the else block, which simply pops the opening parenthesis from the stack to maintain the balance of parentheses.
                // else{
                //     s.pop();
                // }
            }
            else{
                while (!s.isEmpty() && prec(c)<=prec(s.peek())) {
                    res+=s.pop();
                }
                s.push(c);
            }
        }
        while (!s.isEmpty()) {
            if(s.peek()=='('){
                return "invalid expression";
            }
            res+=s.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter expression");
        String exp=sc.nextLine();
        System.out.println(infixToPostfix(exp));
    }
}
