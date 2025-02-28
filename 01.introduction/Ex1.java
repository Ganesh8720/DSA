import java.util.*;
class Demo{
    public static int  getSum(int a[],int n){
        int sum=0;
        if(n%2 !=0){
            return 0;
        }
        for (int i = 0; i < n; i++) {
            sum=sum+a[i];
        }
        return sum;
    }
}
public class Ex1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of an array must been even : ");

        int length=sc.nextInt();
        int a[]=new int[length];
        System.out.println("enter the array elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        } 

        Demo d=new Demo();
        System.out.println(d.getSum(a, length));
        
    }
}
