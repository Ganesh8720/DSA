import java.util.*;
public class Case2 {
    static int count(int a[]){
        int n=a.length;
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            h.add(a[i]);
        }
        return h.size();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter ele");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(count(a));
    }
}
