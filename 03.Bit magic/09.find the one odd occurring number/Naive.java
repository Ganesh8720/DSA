public class Naive {
    static void fun(int a[]){
        int n=a.length;
        // for(int i=0;i<n;i++){
        //     int count=0;
        //     for(int j=0;j<n;j++){
        //         if(a[i]==a[j]){
        //             count++;
        //         }
        //     }
        //     if(count%2!=0){
        //         System.out.println(a[i]);
        //         break;
        //     }
        // }

        int res=0;
        for(int i=0;i<n;i++){
            res=res^a[i];
        }
        System.out.println(res);

    }
    public static void main(String[] args) {
        int a[]={4,3,4,4,4,5,3,5,3,3,5};
        System.out.println("array a :");
        fun(a);
        int b[]={8,7,7};
        System.out.println("array b");
        fun(b);
    }    
}
