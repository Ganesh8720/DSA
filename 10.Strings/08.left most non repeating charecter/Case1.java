import java.util.*;
public class Case1 {
    static int str(String s){
        for(int i=0;i<s.length();i++){
            boolean flag=false;
            for(int j=0;j<s.length();j++){
                
                if(s.charAt(i)==s.charAt(j)&& i!=j){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string s1");
        String s=sc.nextLine();
        System.out.println(str(s));
    }
}

