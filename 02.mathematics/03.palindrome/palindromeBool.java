import java.util.*;
public class palindromeBool {
    static boolean fun(int n){
        int temp=n;
        int rem=0;
        int r=0;
        while(n!=0){
            rem=n%10;
            r=r*10+rem;
            n=n/10;
        }
       return (r==temp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        boolean r=fun(n);
        System.out.println(r);
    }
}
