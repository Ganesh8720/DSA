//using array list
import java.util.*;
import java.util.ArrayList;

class MyStack{
    ArrayList<Integer> a=new ArrayList<>();
    void push(int x){
        a.add(x);
    }
    void pop(){
        a.remove(a.size()-1);
    }
    int size(){
        return a.size();
    }
    int peek(){
        return a.get(a.size()-1);
    }
    boolean isEmpty(){
        return a.isEmpty();
    }
    void getMin(){
        int min=a.get(size()-1);
        
            for(int i=a.size()-1;i>=0;i--){
                if(peek()<min){
                    min=peek();
                }
            }
        
        System.out.print(min+" ");
    }
}
class Practice2 {
    public static void main(String[] args) {
        MyStack s=new MyStack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.getMin();
        s.pop();
        s.getMin();
        s.push(2);
        s.getMin();
    }  
}
