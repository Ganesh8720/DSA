public class CountDigits {
    public static void main(String[] args) {
        int count=0; 
        int n=123456;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);

    }    
}
