import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class Case2 {
    static void nextGreater(int a[]){
        int n=a.length;
        ArrayList<Integer> l=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        s.add(a[n-1]);
        l.add(-1);
        for(int i=n-2;i>=0;i--){
            while(s.isEmpty()==false && s.peek()<=a[i]){
                s.pop();
            }
            int next=s.isEmpty()?-1:s.peek();
            l.add(next);

            s.add(a[i]);
        }
        Collections.reverse(l);
        for(int x:l){
            System.out.print(x+" ");
        }
  
    }
    public static void main(String[] args) {
        int a[]={5,15,10,8,6,12,9,18};
      nextGreater(a);
        
    }   
}
