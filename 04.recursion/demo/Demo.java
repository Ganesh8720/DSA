import java.util.*;
class Demo{
    static int fun(int n,int a,int b,int c){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        int resa=fun(n-a,a,b,c);
        int resb=fun(n-b,a, b, c);
        int resc=fun(n-c,a,b,c);

        int res=Math.max(resa,Math.max(resb, resc));

        if(res==-1){
            return -1;
        }
        return res+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        int n=5,a=2,b=5,c=1;
        
        System.out.println(fun(n,a,b,c));

    }
}