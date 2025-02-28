package z_practice;
import java.util.*;
class Palindrome {
    static boolean num(int n){
        int temp=n;
        int res=0;
        while(n!=0){
            int rem=n%10;
            res=res*10+rem;
            n=n/10;
        }
        System.out.println("res is :"+res);
        return res==temp;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println(num(n));
       
    }
}
