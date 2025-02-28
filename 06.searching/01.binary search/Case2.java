import java.util.*;
public class Case2 {
    static int search(int a[],int x){
        int n=a.length;
        int low=0,high=n-1;
       
        if(low>high){
            return -1;
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==x){
                return mid;
            }
            else if(x<a[mid]){
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
        System.out.print("enter size: ");
        int n=sc.nextInt();
        System.out.println("enter array elements : ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("enter search element :");
        int x=sc.nextInt();
        
        System.out.println(search(a,x));
    }
    
}
