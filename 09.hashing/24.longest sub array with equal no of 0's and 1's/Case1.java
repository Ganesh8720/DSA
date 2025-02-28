import java.util.*;
public class Case1 {
    static int  pair(int a[],int n){
        int res=0;
        for(int i=0;i<n;i++){
            int c1=0,c0=0;
           for (int j = i; j < n; j++) {
                if(a[j]==0){
                    c0++;
                }
                else{
                    c1++;
                }
                if(c0==c1){
                    res=Integer.max(res,j-i+1);
                }
           }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter ele");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // System.out.println("enter sum");
        // int sum=sc.nextInt();
        
        System.out.println(pair(a,n));
    }
}


