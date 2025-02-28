import java.util.*;
public class Case1 {
    static boolean matching(char a,char b){
        return (
            (a=='(' && b==')') ||(a=='{' && b=='}') ||(a=='[' && b==']')
        );
    }
    static boolean isbalanced(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                s.add(str.charAt(i));
            }
            else{
                //intitially string starting from closing parentheses
                if(s.isEmpty()==true){
                    return false;
                }
                else if(!matching(s.peek(),str.charAt(i))){
                    return false;
                }
                else{
                    s.pop();
                }
            }
        }
        return (s.isEmpty()==true);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        if(isbalanced(str)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
}
