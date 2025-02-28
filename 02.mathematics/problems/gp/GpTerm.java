import java.util.*;
public class GpTerm {
    static int fun(int a,int r,int n){
        int res=(int)(a*Math.pow(r,(n-1))); 
        return res;
    }
    public static void main(String[] args) {
        int a=2 ,r=3,n=5;
        System.out.println(fun(a,r,n));
    }
}
