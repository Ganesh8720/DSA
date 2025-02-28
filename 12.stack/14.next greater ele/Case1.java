public class Case1 {
    public static void main(String[] args) {
        int a[]={5,15,10,8,6,12,9,18};
        int n=a.length;
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(a[j]>a[i]){
                    System.out.print(a[j]+" ");
                    break;
                }
                
            }
            if(j==n){
                System.out.print("-1"+" ");
            }
        }
        
    }
}
