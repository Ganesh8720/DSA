import java.util.*;
public class Bsearch {
    static int search(int a[],int n){
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid==0 || a[mid-1]<=a[mid]) && (mid==n-1 || a[mid+1]<=a[mid])){
                return a[mid];
            }
            if(mid>0 && a[mid-1]>=a[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
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
