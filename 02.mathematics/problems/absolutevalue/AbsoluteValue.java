public class AbsoluteValue {
    static void fun(int n){
        if(n<0){
            n=(-1)*n;
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=-6;
        fun(n);
    }
    
}
