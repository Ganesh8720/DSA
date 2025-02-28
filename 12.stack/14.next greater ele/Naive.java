public class NAive {
    public static void main(String[] args) {
        int a[]={5,15,10,8,6,12,9,18};
        int n=a.length;
        for(int i=0;i<n;i++){
            int next=-1;
            for(int j=i+1;j<n;j++){
                if(a[j]>a[i]){
                    next=a[j];
                    break;
                }
            }
            System.out.print(next+" ");
            
        }
        
    }
}
