import java.util.*;
class Ceil{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of n");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter n ele");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
        ceiling(a,n);
    }
    static void ceiling(int a[],int n){
        System.out.print("\n-1 ");
        for(int i=1;i<n;i++){
            int res=-1;
            for(int j=0;j<i;j++){
                
                if(a[j]>=a[i]){
                    if(res==-1 || a[j]<res){
                        res=a[j];
                    }
                }
            }
            System.out.print(res+" ");
        }
    }
}