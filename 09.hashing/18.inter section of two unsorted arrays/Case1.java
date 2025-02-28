import java.util.*;
public class Case1 {
    static int count(int a[],int b[]){
        int m=a.length;
        int n=b.length;
        int res=0;
        for(int i=0;i<m;i++){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                for(int j=0;j<n;j++){
                    if(a[i]==b[j]){                        
                        res++;
                        break;
                    }
                }
            }
        }
        return res;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array a");
        int m=sc.nextInt();
        int a[]=new int[m];
        System.out.println("a ele");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("enter size of an array b");
        int n=sc.nextInt();
        int b[]=new int[n];
        System.out.println("b ele");
        for (int i = 0; i < b.length; i++) {
            b[i]=sc.nextInt();
        }
        System.out.println(count(a,b));
    }
}
