package z_practice;

import java.util.Scanner;

public class Fact {
    static int factorial(int n){
        // int f=1;
        // for(int i=2;i<=n;i++){
        //     f=f*i;
        // }
        // System.out.println("factorial of a number is"+f);
        // int res=0;
        // while(f%10==0){
        //     res++;
        //     f=f/10;
        // }
        // return res;
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res=res+n/i;
        }
        return res;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
}
