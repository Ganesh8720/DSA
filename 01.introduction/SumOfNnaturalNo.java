import java.util.*;
public class SumOfNnaturalNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n value : ");
        int n=sc.nextInt();
        int sum=0;
        for (int i = 0; i <= n; i++) {
            sum=sum+i;
        }
        System.out.println("sum of n muber is : "+sum);
    }
    
}