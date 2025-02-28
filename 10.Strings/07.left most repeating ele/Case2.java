import java.util.*;
public class Case2 {
    static final int CHAR=256;
    static int str(String s1){
        int count[]=new int[CHAR];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
        }
        for(int i=0;i<s1.length();i++){
            if(count[s1.charAt(i)]>1){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string s1");
        String s1=sc.nextLine();
        System.out.println(str(s1));
    }
}

