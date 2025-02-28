import java.util.*;
public class Quadratic {
    static void fun(int a,int b,int c){
        int val=b*b-4*a*c;
        int d=(int)Math.sqrt(val);
        System.out.println(
            (-b+d)/2*a+" "+(-b-d)/2*a
        );

    }
    public static void main(String[] args) {
        int a=1,b=-2,c=1;
        fun(a,b,c);
    }
}
