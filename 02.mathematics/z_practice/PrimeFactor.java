package z_practice;

public class PrimeFactor {
    static boolean fun(int m){
        boolean res=true;
        if(m==1){
            return false;
        }
        for(int i=2;i*i<=m;i++){
            if(m%i==0){
                res=false;
            }
        }
        return res;
    }
    static void prime(int n){
        for(int i=2;i<n;i++){
            if(fun(i)){
                int x=i;
                while(n%x==0){
                    System.out.print(i+" ");
                    x=x*i;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n=315;
        prime(n);
    }
}
