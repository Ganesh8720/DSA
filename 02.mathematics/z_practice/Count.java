package z_practice;
import java.util.*;
class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int count=0;
        if(num>0){
            
            while(num!=0){
                num=num/10;
                count++;
            }
        }
        else{
            System.out.println("-1");
        }

        System.out.println(count);
    }
}
