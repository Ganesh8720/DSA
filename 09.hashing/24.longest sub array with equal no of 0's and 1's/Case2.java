import java.util.*;
public class Case1 {
    static int  pair(int a[],int n){
        HashSet<Integer> h=new HashSet<>();
                   
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


