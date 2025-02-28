package z_practice;

public class ComputaionPower {
    static int fun(int x,int n){
        int res=1;
        for(int i=0;i<n;i++){
            res*=x;
        }
        return res;
    }
    public static void main(String[] args) {
        int x=5,n=1;
        System.out.println(fun(x,n));
    }
}
