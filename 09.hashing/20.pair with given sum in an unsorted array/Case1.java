import java.util.*;
public class Case1 {
    static boolean pair(int a[],int sum,int n){
        HashSet<Integer> h=new HashSet<>();
        System.out.println("h is"+h);
        for(int i=0;i<n;i++){
            if(h.contains(sum-a[i])){
                System.out.println("h is"+h);
                return true;
                
            }
            h.add(a[i]);
            System.out.println("h is"+h);
        }
        
       return false;
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
        System.out.println("enter sum");
        int sum=sc.nextInt();
        System.out.println(pair(a,sum,n));
    }
}
