import java.util.*;
public class Main {
    static void fun(int a[]){
        int n=a.length;
        int temp;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                //identify next non zero elemenent and swap
                for(int j=i+1;j<n;j++){
                    if(a[j]!=0){
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements : ");
        for(int i=0;i<n;i++){

            a[i]=sc.nextInt();
        }
        System.out.println("after moving zeros : ");
        fun(a);

    }
    
}
