import java.util.*;
public class Case2 {
    static int fun(int n){
        int res=0;
        while(n>0){
            n=n&(n-1);
            res++;
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
