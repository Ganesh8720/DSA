import java.util.*;
public class Case1 {
    static int prefix(String exp){
        Stack<Integer> s=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char c=exp.charAt(i);
            if(c==' '){
                continue;
            }
            else if(Character.isDigit(c)){
                int n=0;
                while( Character.isDigit(c)){
                    // if(c==0){
                    //     n=n*10;
                    //     i++;
                    // }
                    n=n*10+(int)(c-'0');
                    i--;
                    c=exp.charAt(i);
                }
                // After the loop, it decrements the index i by 1. This is done to adjust for the extra increment at the end of the loop.
                i++;
                s.push(n);
            }
            else{
                int val1=s.pop();
                int val2=s.pop();
                switch (c) {
                    case '+':
                    s.push(val1+val2);
                    break;

                    case '-':
                    s.push(val1-val2);
                    break;

                    case '*':
                    s.push(val1*val2);
                    break;

                    case '/':
                    s.push(val1/val2);
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
        System.out.println(prefix(exp));
   } 
}
