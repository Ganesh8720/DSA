public class palindrome2 {
    public static void main(String[] args) {
        int n=121;
        int temp=n;
        int rem=0;
        int reverse=0;
        while(n!=0){
            rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
        System.out.println("given number is :"+temp);
        System.out.println("reverse number is :"+reverse);
        if(temp==reverse){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }    
}
