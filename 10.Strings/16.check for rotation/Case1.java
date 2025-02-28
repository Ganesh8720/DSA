import java.util.*;
public class Case1 {
    static boolean repeate(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        if((s1+s1).indexOf(s2)>=0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("enter string 1");
        String s1=sc.nextLine();
        System.out.println("enter string 2");
        String s2=sc.nextLine();
        System.out.println(repeate(s1,s2));
    }
}
