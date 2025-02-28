import java.util.*;
public class Case2 {
    static boolean anagram(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        if(n!=m){
            return false;
        }
        //You cannot use Arrays.sort() directly on strings because strings are immutable in Java. 
        
        //step 1 :You should convert them to character arrays first
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();

        //The toCharArray() method is a built-in method in Java that belongs to the String class. It is used to convert a string into an array of characters. The resulting character array contains the characters of the string in the same order as they appear in the string.
        
        //step 2:sort them
        Arrays.sort(a);
        Arrays.sort(b);

        //step 3:create new strings.
        s1=new String(a);
        s2=new String(b);

        // if(s1.equals(s2)){
        //     return true;
        // }
        // return false;
        return s1.equals(s2);
       // return Arrays.equals(s1, s2);
       //no suitable method found for equals(String,String)
        
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

