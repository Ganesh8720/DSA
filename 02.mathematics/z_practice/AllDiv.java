package z_practice;

public class AllDiv {
    static void fun(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int n=7;
        fun(n);
    }
}
