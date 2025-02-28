import java.util.*;
class Main{
    static void fun(int a[]){
        int n=a.length;
        int l=0,h=n-1;
        while(l<h){
            int temp=a[l];
            a[l]=a[h];
            a[h]=temp;
            l++;
            h--;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
         int a[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("reversesd array is : ");
        fun(a);
    }
}

