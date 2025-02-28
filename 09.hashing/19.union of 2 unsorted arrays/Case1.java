import java.util.*;
public class Case1 {
    static int count(int a[],int b[],int m,int n){
        HashSet<Integer> h=new HashSet<>();
        int t[]=new int[m+n];
        for(int i=0;i<m;i++){
            h.add(a[i]);
        } 
        for(int i=0;i<n;i++){
            h.add(b[i]);
        } 
        System.out.println(h);
        return h.size();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array a and b");
        int m=sc.nextInt();
        int a[]=new int[m];
        int n=sc.nextInt();
        int b[]=new int[n];
        System.out.println("a ele");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
         
        System.out.println("b ele");
        for (int i = 0; i < b.length; i++) {
            b[i]=sc.nextInt();
        }
        System.out.println(count(a,b,m,n));
    }
}

