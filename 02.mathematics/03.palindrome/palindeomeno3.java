import java.util.*;
public class palindeomeno3 {
    static int fun(int n){
        int rem=0;
        int r=0;
        while(n!=0){
            rem=n%10;
            r=r*10+rem;
            n=n/10;
        }
        return r;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int temp=n;
        int r=fun(n);
        if(temp==r){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
