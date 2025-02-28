import java.util.*;
public class Case3 {
    static int max2(int a[]){
        int n=a.length;
        int res=-1;
        int target=0;
        for(int i=0;i<n;i++){
            if(a[i]>a[target]){
                res=target;
                target=i;
            }

            else if(a[i]!=a[target]){
                if(res==-1 || a[i]>a[res]){
                    res=i;
                }
            }  
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array ele : ");
        for(int i=0;i<n;i++){
            System.out.print(i +" : ");
            a[i]=sc.nextInt();
        }
        System.out.println("second max index is : "+max2(a));
    }
    
}

