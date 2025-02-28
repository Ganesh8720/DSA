//find <= nth fibnocci series(0 to n-1 fib series)
public class Fib {
    static void fun(int n){
        int a=0,b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
         for(int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
    public static void main(String[] args) {
        fun(9);
    }
}
