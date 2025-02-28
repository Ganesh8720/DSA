import java.util.*;
public class Revereseno2 {
    static int number(int n){
        int rem=0;
        int reverse=0;
        while(n!=0){
            rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int n=sc.nextInt();

        System.out.print("reverse num is : "+number(n));
    }
}
