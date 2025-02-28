public class Fib {
    static int fun(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fun(7));
    }
}
