import java.util.*;
public class CountDigits1 {
    static int CountDigits(int n)
        {
            int count=0;
            while (n>0) {
                n=n/10;
                count++;
            }
            return count;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        //int result=CountDigits(n);
        System.out.println("no of count is : "+CountDigits(n));
        
    }
    
}