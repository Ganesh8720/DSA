public class Own {
    static boolean fun(int n){
        int temp=2;
        while(temp<=n){
            if(temp==n){
                return true;
            }
            temp=temp*2;
        }
        return false;
    }
    public static void main(String[] args) {
        
        System.out.println("4 is : "+fun(4));
        System.out.println("2 is : "+fun(2));
        System.out.println("246 is : "+fun(246));
        System.out.println("32 is : "+fun(32));
    }
}

