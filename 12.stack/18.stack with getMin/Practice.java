//by using arrays
class MyStack{
    int a[];
    int cap;
    int top;
    MyStack(int c){
        cap=c;
        top=-1;
        a=new int[cap];
    }
    void push(int x){
        top++;
        a[top]=x;
    }
    int pop(){
        int res=a[top];
        top--;
        return res;
    }
    int size(){
        return top+1;
    }
    int peek(){
        return a[top];
    }
    boolean isEmpty(){
        return (top==-1);
    }
    void getMin(){
        int min=a[0];
        for(int i=0;i<size();i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.print(min+" ");
    }
}
class Practice {
    public static void main(String[] args) {
        MyStack s=new MyStack(10);
        s.push(20);
        s.push(10);
        s.getMin();
        s.push(5);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.getMin();
    }  
}
