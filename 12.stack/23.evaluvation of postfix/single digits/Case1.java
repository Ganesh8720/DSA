import java.util.*;
public class Case1 {
    static int postfix(String exp){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            // If the scanned character is an operand
            // (number here), push it to the stack.
            if(Character.isDigit(c)){
                s.push(c-'0');
            }
            else{
                int val1=s.pop();
                int val2=s.pop();

                switch (c) {
                    case '+':
                    s.push(val2+val1);
                    break;

                    case '-':
                    s.push(val2-val1);
                    break;

                    case '*':
                    s.push(val2*val1);
                    break;

                    case '/':
                    s.push(val2/val1);
                    break;
                
                }
            }
        }
        return s.peek();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter expression");
        String exp=sc.nextLine();
        System.out.println(postfix(exp));
    }
}
