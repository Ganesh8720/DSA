import java.util.Stack;

public class Case2 {
    static void prevGreater(int a[]){
        int n=a.length;
        Stack<Integer> s=new Stack<>();
        //we do not need to store the index (s.add(0)).we store item value
        s.add(a[0]);
        System.out.print("-1"+" ");
        for(int i=1;i<n;i++){
            
            while(s.isEmpty()==false && s.peek()<=a[i]){
                
                s.pop();
            }
            int span=s.isEmpty()?-1:s.peek();
            System.out.print(span+" ");
            // s.push(a[i]); or
            s.add(a[i]);
        }
    }
    public static void main(String[] args) {
        int a[]={15,10,18,12,4,6,2,8};
        prevGreater(a);
    }
    
}
