import java.util.*;
public class Case2 {
    static void rotate(int a[],int d){
        int n=a.length;
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=a[i];
        }
        for(int j=d;j<n;j++){
            a[j-d]=a[j]; 
        }
        for(int i=0;i<d;i++){
            a[n-d+i]=temp[i];
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
        System.out.print("enter d : ");
        int d=sc.nextInt();
        rotate(a,d);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
