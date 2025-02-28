public class NaiveSolution {
    static boolean fun1(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static void fun2(int num){
        for(int j=2;j<=num;j++){
            if(fun1(j)){
               int x=j;
               while(num%x==0){
                System.out.println(j);
                x=x*j;
               }
            }
        }
    }
    public static void main(String[] args) {
        fun2(12);

    }
    
}