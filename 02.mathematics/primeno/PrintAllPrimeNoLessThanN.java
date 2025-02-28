//naive solution 
//time complexity is 
public class PrintAllPrimeNoLessThanN {
    static boolean fun1(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static void fun2(int num){
        for(int i=2;i<=num;i++){
            if(fun1(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        fun2(10);
    }
    
}
