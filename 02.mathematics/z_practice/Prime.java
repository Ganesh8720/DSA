package z_practice;

public class Prime {
    static boolean fun(int n){
        boolean res=true;
        if(n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                res=false;
            }
        }
        return res;
        
    }
    public static void main(String[] args) {
        int n=37;
        System.out.println(fun(n));
    }
    
}
