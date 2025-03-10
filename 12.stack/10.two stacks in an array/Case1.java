import java.io.*;
import java.util.*;


class TwoStacks { 
    int cap; 
    int top1, top2; 
    int arr[]; 
  
    TwoStacks(int n) 
    { 
        arr = new int[n]; 
        cap = n; 
        top1 = -1; 
        top2 = cap; 
    } 
  
    void push1(int x) 
    { 
        if (top1 < top2 - 1) { 
            top1++; 
            arr[top1] = x; 
        } 
        else { 
            System.out.println("Stack Overflow"); 
            System.exit(1); 
        } 
    } 
  
    void push2(int x) 
    { 
        if (top1 < top2 - 1) { 
            top2--; 
            arr[top2] = x; 
        } 
        else { 
            System.out.println("Stack Overflow"); 
            System.exit(1); 
        } 
    } 
    
    int pop1() 
    { 
        if (top1 >= 0) { 
            int x = arr[top1]; 
            top1--; 
            return x; 
        } 
        else { 
            System.out.println("Stack Underflow"); 
            System.exit(1); 
        } 
        return 0; 
    } 
  
    int pop2() 
    { 
        if (top2 < cap) { 
            int x = arr[top2]; 
            top2++; 
            return x; 
        } 
        else { 
            System.out.println("Stack Underflow"); 
            System.exit(1); 
        } 
        return 0; 
    }
    int peek1() 
    { 
        if (top1 >= 0) { 
            return arr[top1]; 
        } 
        else { 
            System.out.println("Stack1 is empty"); 
            System.exit(1); 
        } 
        return 0; 
    } 
    int peek2() 
    { 
        if (top2 < cap) { 
            return arr[top2]; 
        } 
        else { 
            System.out.println("Stack2 is empty"); 
            System.exit(1); 
        } 
        return 0; 
    }
}

class Case1 {
    
	public static void main (String[] args) {
	
	    TwoStacks ts=new TwoStacks(10); 
        ts.push1(5); 
        ts.push2(10); 
        ts.push2(15); 
        ts.push1(11); 
        ts.push2(7); 
        System.out.println("Popped element from stack1 is: " + ts.pop1()); 
        ts.push2(40);
        ts.push2(22); 
        System.out.println("Popped element from stack2 is: " + ts.pop2());  
        ts.push2(32);
        System.out.println("peek1 :"+ts.peek1());
        System.out.println("peek1 :"+ts.peek2());

       
	}
	
}