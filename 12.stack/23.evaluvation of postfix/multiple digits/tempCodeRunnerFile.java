import java.util.*;
public class Case1 {
    static int postfix(String exp){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(c==' '){
                continue;
            }
            else if(Character.isDigit(c)){
                int n=0;
                while(Character.isDigit(c)){
                    n=n*10+(int)(c-'0');
                    i++;
                    c=exp.charAt(i);
                }
                // After the loop, it decrements the index i by 1. This is done to adjust for the extra increment at the end of the loop.
                i--;
                s.push(n);
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
        System.out.println("enter expression : ");
        String exp=sc.nextLine();
        System.out.println(postfix(exp));
   } 
}
