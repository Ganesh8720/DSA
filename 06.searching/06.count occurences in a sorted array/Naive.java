import java.util.*;
public class Naive {
    static int count(int a[],int n,int x){
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array ele :");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("enter x :");
        int x=sc.nextInt();
        System.out.println(count(a,n,x));
    }
    
}
