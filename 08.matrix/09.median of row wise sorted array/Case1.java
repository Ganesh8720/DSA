import java.util.*;
public class Case1 {
    static void median(int a[][],int r,int c){
        int n=r*c;
        int temp[]=new int[n];
        int t=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                temp[t]=a[i][j];
                t++;
            }
        }
        System.out.println("before : ");
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        Arrays.sort(temp);
        System.out.println("\nafter : ");
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        int l=0,h=n-1;
        int median=(l+h)/2;

        System.out.println("median is : "+temp[median]);
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
        median(a,r,c);
    }
}


