import java.util.*;
public class Case2 {
    static int max(int a[]){
        int n=a.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    static int max2(int a[]){
        int n=a.length;
        int target=max(a);
        int max2=0;
        int res=-1;
        for(int i=0;i<n;i++){
            if(a[i]!=target){
                if(res==-1){
                    res=i;
                }
                else if(a[i]>a[res]){
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
