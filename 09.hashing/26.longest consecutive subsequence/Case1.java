import java.util.*;
public class Case1 {
    static int pair(int a[],int n){
        Arrays.sort(a);
        System.out.print("array ele: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        int res=1;
        int curr=1;
        for(int i=1;i<n;i++){
            if(a[i]==a[i-1]+1){
                curr++;
                res=Math.max(curr, res);
            }
            else{
                curr=1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter a ele");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println(pair(a,n));
    }
}

