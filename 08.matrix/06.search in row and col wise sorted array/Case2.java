import java.util.*;
public class Case2 {
    static String search(int a[][],int r,int c,int x){
        int i=0,j=c-1;
        while (i<r && j>=0) {
            if(a[i][j]==x){
                return "found at"+i+" "+j;
            }
            else if(x>a[i][j]){
                i++;
            }
            else{
                j--;
            }
        }
       return "not found";
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
        System.out.println("array ele "); 
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        int x=39;
        System.out.println(search(a,r,c,x));
    }
}


