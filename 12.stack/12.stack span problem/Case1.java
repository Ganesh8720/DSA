public class Case1 {
    public static void main(String[] args) {
        int a[]={13,15,12,14,16,8,6,4,10,30};
        for(int i=0;i<a.length;i++){
            int span=1;
            for(int j=i-1;j>=0;j--){
                if(a[j]<=a[i]){
                    span++;
                }
                else{
                    break;
                }
            }
            System.out.print(span+" ");
        }
    }
}
