import java.util.*;
public class Case2 {
    static boolean pair(int a[],int n,int sum){
        HashSet<Integer> h=new HashSet<>();
        int pre_sum=0;
        for(int i=0;i<n;i++){
            pre_sum+=a[i];
            if(h.contains(pre_sum-sum)){
                return true;
            }
            if(pre_sum==sum){
                return true;
            }
            h.add(pre_sum);
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
        
        System.out.println(pair(a,n,sum));
    }
}

