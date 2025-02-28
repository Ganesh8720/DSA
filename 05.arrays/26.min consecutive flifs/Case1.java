import java.util.*;
public class Case1 {
    static void min(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            if(a[i]!=a[i-1]){
                if(a[i]!=a[0]){
                    System.out.print("from "+i+" to ");
                }
                else{
                    System.out.print(i-1+"\n");
                }
            }
        }
        if(a[n-1]!=a[0]){
                System.out.println(n-1);
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,1,0,0,0,1};
        min(a);
    }
}
