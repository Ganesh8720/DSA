import java.util.*;
public class Case {
    static Queue<Integer> q=new LinkedList<>();
    static void print(){
        for (int x : q) {
            System.out.print(x+" ");
        }
    }
    static void reverse(){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.add(q.poll());
        }
        while (!s.isEmpty()) {
            q.offer(s.peek());
            s.pop();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter size : ");
        int n=sc.nextInt();
        System.out.println("enter queue ele");
        for(int i=0;i<n;i++){
            q.offer(sc.nextInt());
        }
        System.out.println(q);
        System.out.println("before reverse :");
        print();
        reverse();
        System.out.println("\nafter reverse : ");
        print();
    }
}
