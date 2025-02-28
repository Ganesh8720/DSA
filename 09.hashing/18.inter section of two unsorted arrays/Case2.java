import java.util.*;
public class Case2 {
    static int count(int a[],int b[]){
        int m=a.length;
        int n=b.length;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<m;i++){
            h.add(a[i]);
        }
        System.out.println("h is "+h);
        int res=0;
        for(int j=0;j<n;j++){
            if(h.contains(b[j])){
                res++;
                h.remove(b[j]);
            }
        }
        return res;

        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array a and b");
        int m=sc.nextInt();
        int a[]=new int[m];
       // System.out.println("enter size of an array b");
        int n=sc.nextInt();
        System.out.println("a ele");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        
        int b[]=new int[n];
        System.out.println("b ele");
        for (int i = 0; i < b.length; i++) {
            b[i]=sc.nextInt();
        }
        System.out.println(count(a,b));
    }
}

