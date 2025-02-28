import java.util.*;
public class Main {
    static boolean fun(int n,int k){
        if (((n>>k-1)&1)==1) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter n :");
        int n=sc.nextInt();
        System.out.println("enter pos K :");
        int k=sc.nextInt();
        System.out.println(fun(n,k));
    }
}
