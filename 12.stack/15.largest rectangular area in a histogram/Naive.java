public class Naive {
    static int area(int a[]){
        int n=a.length;
        int res=0;
        for(int i=0;i<n;i++){
            int curr=a[i];
            for(int j=i-1;j>=0;j--){
                if(a[j]=>a[i]){
                    curr+=a[i];
                }
                else{
                    break;
                }
            }
            for(int j=i+1;j<n;j++){
                if(a[j]=>a[i]){
                    curr+=a[i];
                }
                else{
                    break;
                }
            }
            res=Math.max(curr,res);
        }
        return res;
    }
    public static void main(String[] args) {
        // int a[]={6,2,5,4,1,5,6};
        int a[]={2,5,1};
        System.out.println(area(a));
    }
}
