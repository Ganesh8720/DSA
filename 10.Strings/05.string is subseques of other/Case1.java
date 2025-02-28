import java.util.*;
public class Case1 {
    static boolean sub(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        if(n<m){
            return false;
        }
        int j=0;
        for(int i=0;i<n && j<m;i++){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
            // else{
            //     i++;
            // }            
        }
        return (j==m);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string s1");
        String s1=sc.nextLine();
        System.out.println("enter string s2");
        String s2=sc.nextLine();
        System.out.println(sub(s1,s2));
    }
}

