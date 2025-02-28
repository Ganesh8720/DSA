import java.util.*;
public class Case1 {
    static void boundary(int a[][],int r,int c){
        if(r==1){
            for(int i=0;i<c;i++){
                System.out.print(a[0][i]+" ");
            }
        }
        else if(c==1){
            for(int i=0;i<r;i++){
                System.out.print(a[i][0]+" ");
            }
        }
        else{
            for(int i=0;i<c;i++){
                System.out.print(a[0][i]+" ");
            }
            for(int i=1;i<r;i++){
                System.out.print(a[i][c-1]+" ");
            }
            for(int i=c-2;i>=0;i--){
                System.out.print(a[r-1][i]+" ");
            }
           for(int i=r-2;i>0;i--){
                System.out.print(a[i][0]+" ");
            }
            
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter r and c ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("enter array ele : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
            //System.out.println(" ");
        }
        System.out.println("array :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        boundary(a,r,c);
    }
}
