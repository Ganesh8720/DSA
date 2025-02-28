import java.util.*;
public class SubArray {
    static void sub(int a[],int k){
        int n=a.length;
        for(int i=0;i<n-k+1;i++){
            int max=a[i];
            for(int j=i+1;j<i+k;j++){
                if(a[j]>max){
                    max=a[j];
                }

            }
            System.out.print(max+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter n ele");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter k value");
        int k=sc.nextInt();
        sub(a,k);
    }
}
