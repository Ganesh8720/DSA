import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Example2 {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        
        System.out.println("que size is : "+q.size());
        q.offer(1);
        System.out.println(q);
        q.add(2);
        q.add(3);
        System.out.println(q);
        System.out.println("peek ele is :"+q.peek());
        System.out.println("poll : "+q.poll());
        System.out.println("after poll"+q);
        System.out.println("remove : "+q.remove());
        System.out.println("after remove"+q);
        System.out.println("peek element : "+q.element());
        System.out.println(q.isEmpty());
        q.poll();
        System.out.println(q.isEmpty());




    }
}
