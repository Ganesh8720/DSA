public class case1 {
    static void num(int n){
        int temp=n;
        int r=0;
        while(n!=0){
            int rem=n%10;
            r=r*10+rem;
            n=n/10;
        }
        if(temp==r){
            System.out.println(r+" palindrome");
        }
        else{
            System.out.println(r+" not palindrome");
        }
    }
    public static void main(String[] args) {
        num(121);
    }
    
}
