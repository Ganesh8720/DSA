import java.util.*;
public class Case2 {
    static int pair(int a[],int b[],int n){
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int t[]=new int[n];
        for (int i = 0; i < t.length; i++) {
            t[i]=a[i]-b[i];
        }
        int pre_sum=0;int res=0;
        for(int i=0;i<n;i++){
            pre_sum+=t[i];
            
          if(pre_sum==0){
            res=i+1;
          }
          if(h.containsKey(pre_sum)==false){
            h.put(pre_sum,i);
          }
          if(h.containsKey(pre_sum)){
            res=Math.max(res,i-h.get(pre_sum));
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
        
        System.out.println(pair(a,b,n));
    }
}

