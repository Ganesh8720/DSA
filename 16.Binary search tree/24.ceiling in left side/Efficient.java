
import java.util.*;
class Efficient{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of n");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter n ele");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
        ceiling(a,n);
    }
    static void ceiling(int a[],int n){
        System.out.print("\n-1 ");
        TreeSet<Integer> s=new TreeSet<>();
        s.add(a[0]);
        for(int i=1;i<n;i++){
            if(s.ceiling(a[i]) != null){
                System.out.print(s.ceiling(a[i])+" ");
            }
            else{
                System.out.print("-1"+" ");
            }
            s.add(a[i]);
        }
    }
}