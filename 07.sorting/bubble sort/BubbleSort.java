import java.util.*;
public class BubbleSort {
    static void print(int a[]){
        for (int x : a) {
            System.out.print(x+" ");
        }
    }
    static void sort(int a[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                 if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
            
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of an array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("array elments before sort : ");
        print(a);
        sort(a,n);
        System.out.println("\narray elements after sort : ");
        print(a);
        

    }
}
