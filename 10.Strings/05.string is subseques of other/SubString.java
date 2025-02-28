import java.util.*;
public class SubString {
    static void sub(String str,String curr,int i){
        if(i==str.length()){
            System.out.println('"'+curr+'"');
           return;
        }
        //including value
        sub(str,curr+str.charAt(i),i+1);
        sub(str,curr,i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        
        String curr=" ";
        int i=0;
        sub(str,curr,i);
    }
    
}
