import java.util.*;
public class Prime {
    static void fun(int n){
        boolean a[]=new boolean[n+1];
        Arrays.fill(a,true);
        a[0]=a[1]=false;
        for(int i=2;i*i<=n;i++){
            if(a[i]){
                for(int j=i*i;j<=n;j=j+i){
                    a[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(a[i]){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int n=50;
        fun(n);
    }
}
