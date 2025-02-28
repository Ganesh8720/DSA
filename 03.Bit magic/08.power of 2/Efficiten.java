public class Efficiten {
    static boolean fun(int n){
        // if(n==0){
        //     return false;
        // }
        // return ((n & (n-1))==0);
        return ((n!=0) && ((n & (n-1))==0));
    }
    public static void main(String[] args) {
        
        System.out.println("4 is : "+fun(4));
        System.out.println("2 is : "+fun(2));
        System.out.println("26 is : "+fun(26));
        System.out.println("32 is : "+fun(32));
    }
}

