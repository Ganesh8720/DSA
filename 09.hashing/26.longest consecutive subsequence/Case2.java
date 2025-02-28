import java.util.*;
public class Case2 {
    static int pair(int a[],int n){
        HashSet<Integer> h=new HashSet<>();
        for (int i = 0; i<n; i++) {
            h.add(a[i]);
        }
        int res=0;
        for(int i=0;i<n;i++){
            //a[i]-1 is already exist we simply ignore it
            //other wise means it is the stating ele in consecutive series 
            if(h.contains(a[i]-1)==false){
                int curr=1;
                while(h.contains(a[i]+1)){
                    curr++;
                    a[i]++;
                }
                res=Math.max(res,curr);
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
        
        System.out.println(pair(a,n));
    }
}

