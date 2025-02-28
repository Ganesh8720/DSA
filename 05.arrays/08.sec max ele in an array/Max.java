import java.util.*;
public class Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max1=a[0];
        int max2=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2){
                max2=a[i];
            }
        }
        System.out.print("max1 : "+max1);
        System.out.print("\nmax2 : "+max2);

    }
    
}
