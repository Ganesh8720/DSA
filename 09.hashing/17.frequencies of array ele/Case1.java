import java.util.*;
public class Case1 {
    static void count(int a[]){
        int n=a.length;
        int res;
        for(int i=0;i<n;i++){
            boolean flag=false;
            res=0;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                for(int j=i;j<n;j++){
                    if(a[i]==a[j]){
                        res++;
                    }
                }
                System.out.println(a[i]+" "+res);
            }
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
