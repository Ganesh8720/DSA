//time complexity is Theta n
public class FindNoZeros {
    public static void main(String[] args) {
        int n=13;
        int fact=1;
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        System.out.println("factorial of "+n+" is : "+fact);
        int temp=fact;
        int count=0;
        // while(temp!=0){
        //     int rem=temp%10;
        //     temp=temp/10;
        //     if(rem==0){
        //           count++;
        //     }
        // }
        while(fact%10==0){
            count++;
            fact=fact/10;
        }
        System.out.println("no of zeros in "+n+" factorial is "+count);
  
    }
    
}