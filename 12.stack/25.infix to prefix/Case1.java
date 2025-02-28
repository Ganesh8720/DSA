import java.util.*;
public class Case1 {
    static String reverse(char res[]){
        int start=0;
        int end=res.length-1;
        while(start<end){
            char temp=res[start];
            res[start]=res[end];
            res[end]=temp;
            start++;
            end--;
        }
        return String.valueOf(res);
    }
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
    static String infixToPrefix(String exp){
        String res="";
        Stack<Character> s=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char c=exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                res+=c;
            }
            else if(c==')'){
                s.push(c);
            }
            else if(c=='('){
                while(!s.isEmpty() && s.peek()!=')'){
                    res+=s.pop();
                }
                s.pop();
            }
            else{
                while(!s.isEmpty() && prec(c)<prec(s.peek())){
                    res+=s.pop();
                }
                s.push(c);
            }
        }
        while(!s.isEmpty()){
            res+=s.pop();
        }
        return (reverse(res.toCharArray()));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter expression");
        String exp=sc.nextLine();
        System.out.println(infixToPrefix(exp));

    }
}
