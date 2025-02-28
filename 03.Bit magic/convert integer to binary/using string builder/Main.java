import java.util.*;
public class Main {
    static String convert(int n){
        if(n==0){
            return "0";
        }
        StringBuilder s=new StringBuilder();
        while(n!=0){
            int rem=n%2;
            s.append(rem);
            n=n/2;
        }
        return s.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value : ");
        int n=sc.nextInt();
        System.out.println(convert(n));
    }
}
