import java.util.*;
public class Case1 {
    static int str(String s1){
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    return i;
                }
            }
        }
        return-1;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string s1");
        String s1=sc.nextLine();
        System.out.println(str(s1));
    }
}

