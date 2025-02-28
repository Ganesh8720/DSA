public class Naive {
    static boolean fun(int n){
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%2==1){
                return false;
            }
            n=n/2;
        }
        return true;
    }
    public static void main(String[] args) {
        
        System.out.println("4 is : "+fun(4));
        System.out.println("6 is : "+fun(6));
        System.out.println("16 is : "+fun(16));
        System.out.println("9 is : "+fun(9));
    }
}
