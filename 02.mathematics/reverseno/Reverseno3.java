//print a reverse number digit by digits
public class Reverseno3 {
  public static void main(String[] args) {
    int n=1234;
    int rem=0;
    while (n!=0) {
        rem=n%10;
        n=n/10;
        System.out.print(rem);
    }
  }  
}
