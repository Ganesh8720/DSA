import java.util.*;
public class case1 {
    static int fun(int a[],int x){
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements : ");
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        int x=20;
        System.out.println(fun(a,x));
    }
}
