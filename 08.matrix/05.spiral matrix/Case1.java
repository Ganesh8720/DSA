import java.util.*;
public class Case1 {
    static void spiral(int a[][],int r,int c){
        int t=0,right=c-1,b=r-1,l=0;
        while(t<=b && l<=r){
            for(int i=l;i<=right;i++){
                System.out.print(a[t][i]+" ");
            }
            t++;
            for(int i=t;i<=b;i++){
                System.out.print(a[i][right]+" "); 
            }
            right--;
            if(t<=b){
                for(int i=right;i>=l;i--){
                    System.out.print(a[b][i]+" ");
                }
                b--;
            }
            
            if(l<=right){
                for(int i=b;i>=t;i--){
                    System.out.print(a[i][l]+" ");
                }
                l++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r and c");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        
        System.out.println("enter ele : "); 
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("before"); 
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        spiral(a,r,c);
        
    }
}
