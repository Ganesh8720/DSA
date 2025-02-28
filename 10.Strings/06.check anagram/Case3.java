import java.util.*;
public class Case3 {
    static final int CHAR=256;
    static boolean anagram(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        if(n!=m){
            return false;
        } 
        int count[]=new int[CHAR];
        for(int i=0;i<n;i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i = 0; i <CHAR; i++) {
            if(count[i]!=0){
                return false;
            }
        }
        return true;
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string s1");
        String s1=sc.nextLine();
        System.out.println("enter string s2");
        String s2=sc.nextLine();
        System.out.println(anagram(s1,s2));
    }
}

