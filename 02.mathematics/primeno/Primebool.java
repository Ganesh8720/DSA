//time complexity is bigO(n)
public class Primebool {
    static boolean fun(int n){
        if(n==0 || n==1){
            return false;
        }
        // for(int i=2;i<n;i++){
        //     if(n%i==0){
        //         return false;
        //     }
        // }
        // return true;
        for(int i=2;i*i<=n;i++){
            //to reduce the iteration and time complexity of a program
            //time complexity is bigO(squareroot of n)
            // ex 37 at iteration 7 it will check 7*7=49 is not <= 37 so condition false , and comes out of loop print true
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(fun(8));
    }
    
}
