import java.util.*;
public class Case1 {
    static void pair(int a[],int n,int k){
        for(int i=0;i<=n-k;i++){
            int count=0;
            for(int j=0;j<k;j++){
                boolean flag=false;
                for(int x=0;x<j;x++){
                    if(a[j+i]==a[x+i]){
                        flag=true;
                        break;
                    }
                }
                if(flag==false){
                    count++;
                }
                
            }
            System.out.print(count+" ");
            
        }
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
        System.out.println("enter k");
        int k=sc.nextInt();
        
        pair(a,n,k);
    }
}

