package z_practice;

public class Lcm {
    static int gcd(int a,int b ){
        while (a!=b) {
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    static int fun(int a,int b){
        // int res=Math.max(a, b);
        // while(true){
        //     if(res%a==0 && res%b==0){
        //         return res;
        //     }
        //     res++;
        // }

        
        return a*b/gcd(a, b);
       

    }
    public static void main(String[] args) {
        int a=12,b=15;
        System.out.println(fun(a,b));
    }
}
