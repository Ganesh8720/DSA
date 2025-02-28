import java.util.*;
public class Case2 {
    static void count(int a[]){
        int n=a.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int x:a){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: h.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        count(a);
    }
}
