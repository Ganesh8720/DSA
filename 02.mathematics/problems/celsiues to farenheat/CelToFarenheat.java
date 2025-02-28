public class CelToFarenheat {
    static int fun(float n){
        int res= (int)(n*(9.0f/5.0f)+32);
        return res;
    }
    
    public static void main(String[] args) {
        float n=0f;
        System.out.println(fun(n));
    }    
}
