import java.util.*;
public class Case1 {
    static void transe(int a[][],int n){
        for (int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("enter ele");
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("before");
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        transe(a,n);
        System.out.println("after");
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
