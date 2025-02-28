import java.util.*;
public class Lsearch {
    static int search(int a[],int n){
        //array have single ele
        if(n==1) return a[0];
        //left most element
        if(a[0]>=a[1]) return a[0];
        //rigth most element
        if(a[n-1]>=a[n-2]) return a[n-1];
        //more than one element
        for(int i=1;i<n-1;i++){
            if(a[i]>a[i-1]&& a[i]>a[i+1]){
                return a[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        System.out.println("enter array ele: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("peak ele is : ");
        System.out.println(search(a,n));
    }
    
}
