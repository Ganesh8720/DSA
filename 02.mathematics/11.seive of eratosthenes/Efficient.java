import java.util.*;
public class Efficient {
    static void fun(int n){
        boolean a[]=new boolean[n+1];
        Arrays.fill(a,true);
        for(int i=2;i<=n;i++){
            if(a[i]){
                System.out.print(i+" ");
                for(int j=i*i;j<=n;j=j+i){
                    a[j]=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n=50;
        fun(n);
    }
}
