import java.util.*;
public class Case1 {
    static int test(int a[],int n){
        int res=0;
        for(int i=0;i<n;i++){
            boolean flag=false;
            //check ele already present in left side or not if already
            //present return flag=true
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    flag=true;
                    break;
                }
            }
           
            // for(int j=i+1;j<n;j++){
            //     if(a[i]==a[j]){
            //         flag=true;
            //         break;
            //     }
            // }
            if(flag==false){
                res++;
            }
            
           
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("array size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter ele");
        for (int i = 0; i < a.length; i++) {
             a[i]=sc.nextInt();
        }
        System.out.println(test(a,n));;
    }
}
