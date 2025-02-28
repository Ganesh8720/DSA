import java.util.Stack;
import java.util.*;
public class Better {
    static int area(int a[]){
        int n=a.length;
        int res=0;
        int ps[]=new int[n];
        int ns[]=new int[n];
        Stack<Integer> s=new Stack<>();
        //find ps
        s.add(0);
        for(int i=0;i<n;i++){
            while(s.isEmpty()==false && a[s.peek()]>=a[i]){
                s.pop();
            }
            int prev=s.isEmpty()?-1:s.peek();
            ps[i]=prev;
            s.add(i);
        }
        //clear the stack before store next smaller values
        while(s.isEmpty()==false){
            s.pop();
        }
        //find next smaller
        s.add(n-1);
        for(int i=n-1;i>=0;i--){
            while(s.isEmpty()==false && a[s.peek()]>=a[i]){
                s.pop();
            }
            int next=s.isEmpty()?n:s.peek();
            ns[i]=next;
            s.add(i);
        }
        for(int i=0;i<n;i++){
            int curr=a[i];
            curr+=(i-ps[i]-1)*a[i];
            curr+=(ns[i]-i-1)*a[i];
            res=Math.max(res,curr);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={6,2,5,4,1,5,6};
        System.out.println("max area : "+area(a) );
    }
}
