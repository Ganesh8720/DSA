import java.util.*;
public class Case1 {
    static void reverse(char[] str,int start,int end){
        while(start<end){
            char temp = str[start];
            str[start] = str[end];
            str[end] =  temp;
            start++;
            end--;
        }
    } 
    static String rev(String s){
        int n=s.length();
        char str[]=s.toCharArray();
        int start=0;
        for(int end=0;end<n;end++){
            if(str[end]==' '){
                reverse(str,start,end-1);
                start=end+1;
            }
        }
        reverse(str,start,n-1);
        reverse(str,0,n-1);

        s=new String(str);
        return s;

        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string s1");
        String s=sc.nextLine();
        char str[]=s.toCharArray();
       // s=new String(str);
       System.out.println(rev(s));
       
        
    }
}

