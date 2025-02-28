package z_practice;

public class Gcd {
    static int fun(int a,int b){
        
        // while(a!=b){
        //     if(a>b){
        //         a=a-b;
        //     }
        //     else{
        //         b=b-a;
        //     }
        // }
        // return a;

        if(b==0){
            return a;
        }
        else{
            return fun(b,a%b);
        }
    }
    public static void main(String[] args) {
        int a=15,b=10;
        System.out.println(fun(a,b));
    }

}
