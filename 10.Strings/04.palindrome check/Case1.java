import java.util.*;
public class Case1 {
    static boolean palindrome(String str){
        StringBuilder rev=new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        System.out.println(palindrome(str));
    }
}
