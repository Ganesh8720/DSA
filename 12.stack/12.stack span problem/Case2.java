import java.util.Stack;

public class Case2 {
    static void printspan(int a[]){
        int n=a.length;
        Stack<Integer> s=new Stack<>();
        s.add(0);
        System.out.print(1+" ");
        for(int i=1;i<n;i++){
            while(s.isEmpty()==false && a[s.peek()]<=a[i]){
                s.pop();
            }
            int span=s.isEmpty()?i+1:i-s.peek();
            System.out.print(span+" ");
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int a[]={60,10,20,15,35,50};
        printspan(a);
    }
}
