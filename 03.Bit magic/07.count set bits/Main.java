import java.util.*;
public class Main {
    static int fun(int n){
        int res=0;
        while(n!=0){
            // if((n&1)!=0){
            //     res++;
            // }
            // n=n>>1;
            if(n%2!=0){
                res++;
            }
            n=n/2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter n :");
        int n=sc.nextInt();
       
        System.out.println(fun(n));
    }
}
