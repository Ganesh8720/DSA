import java.util.*;
public class Case1 {
    static boolean anagram(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        if(n!=m){
            return false;
        }
        //You cannot use Arrays.sort() directly on strings because strings are immutable in Java. You should convert them to character arrays first, sort them, and then create new strings.

        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();

        //The toCharArray() method is a built-in method in Java that belongs to the String class. It is used to convert a string into an array of characters. The resulting character array contains the characters of the string in the same order as they appear in the string.
        Arrays.sort(a);
        Arrays.sort(b);
        
        return Arrays.equals(a, b);
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

