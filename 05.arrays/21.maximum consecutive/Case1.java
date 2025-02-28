public class Case1 {
    static int max(int a[]){
        int n=a.length;
        int res=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(a[j]==1){
                count++;
                }
                else{
                    break;
                }
            }
            res=Integer.max(res, count);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={1,1,1,1};
        System.out.println(max(a));
    }
    
}
