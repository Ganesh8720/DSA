public class Prime1 {
    public static void main(String[] args) {
        int n=101;
        if(n==0 || n==1){
            System.out.println(n+" not a prime number");
        }
        else{
            int count=0;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(n+" is prime");
            }
            else{
                System.out.println(n+" not a prime");
            }
            
        }
    }
}
