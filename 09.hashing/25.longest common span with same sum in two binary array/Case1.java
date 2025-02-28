import java.util.*;
public class Case1 {
    static int  pair(int a[],int b[],int n){
        int res=0;
        for(int i=0;i<n;i++){
            int sum1=0;
            int sum2=0;
            for(int j=i;j<n;j++){
                sum1+=a[j];
                sum2+=b[j];
                if(sum1==sum2){
                    res=Math.max(res, j-i+1);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter a ele");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
   
        System.out.println("enter b ele");
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        // System.out.println("enter sum");
        // int sum=sc.nextInt();
        
        System.out.println(pair(a,b,n));
    }
}


