import java.util.*;
class Demo{
    static boolean fun(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an arry");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(fun(a));
       
    }
}


