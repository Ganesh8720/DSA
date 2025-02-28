public class FactRec {
    static int fun(int n){
        if(n==0){
            return 1;
        }
        return n*fun(n-1);
            
    
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println("factorial of "+n+" is "+fun(n));
    }    
}
