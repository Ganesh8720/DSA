//find nth fibnocci series
public class Fib2 {
    static void fun(int n){
        int a=0,b=1;
         for(int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
         System.out.print(b+" ");
    }
    public static void main(String[] args) {
        fun(9);
    }
}
