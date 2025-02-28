import java.util.*;
public class Case1 {
    static void trans(int a[][],int n){
        int temp[][]=new int[n][n];
      
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[i][j]=a[j][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=temp[i][j];
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n : ");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("enter array elements :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("before : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        trans(a,n);
        System.out.println("after : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        

    }
}
