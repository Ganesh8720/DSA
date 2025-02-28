import java.util.*;
class Main{
    static int fun(int a[]){
        int temp[]=new int[a.length];
        temp[0]=a[0];
        int res=1;
        for(int i=0;i<a.length;i++){
            if(temp[res-1]!=a[i]){
                temp[res]=a[i];
                res++;
            }
        }
        for(int j=0;j<res;j++){
           a[j]=temp[j];
           System.out.print(j+" ");
        }
        System.out.println("");
        return res;
      
       
       
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={10,20,20,30,30,30,40,50};
        System.out.println(fun(a));
        
    }
}

