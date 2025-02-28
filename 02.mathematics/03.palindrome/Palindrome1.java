import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number : ");
        int n=sc.nextInt();
        int temp=n;
        int rem=0;
        int reverse=0;
        while(n!=0){
            rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
        System.out.println(reverse);
        if(temp==reverse){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
