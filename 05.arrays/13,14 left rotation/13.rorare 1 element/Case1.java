import java.util.*;
public class Case1 {
    static void rotate(int a[]){
        int n=a.length;
        int temp=a[0];
        for(int i=1;i<n;i++){
            a[i-1]=a[i];
        }
        a[n-1]=temp;
        System.out.println("left rotate array is : ");
        for (int x : a) {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter ele : ");
        for(int i=0;i<n;i++){
            System.out.print(i+" : ");
            a[i]=sc.nextInt();
        }
        rotate(a);
    }
    
}
