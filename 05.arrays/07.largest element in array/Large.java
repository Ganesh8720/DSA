import java.util.*;
public class Large {
    static void fun(int a[]){
        int n=a.length;
        int max=0;
        int index=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
                index=i;
            }
        }
        System.out.println("max element is : "+max);
        System.out.println("max ele index is : "+index);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            System.out.print(i+" :");
            a[i]=sc.nextInt();
        }
        fun(a);

    }   
}
