//better to take separate start and end not i and j
public class Case2 {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            if(i<=1){continue;}
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.print(i+" ");
            }
        }
    }
    
}
