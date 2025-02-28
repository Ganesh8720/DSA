class More_Efficient {
    static boolean fun(int n){
        boolean res=true;
        if(n==1){
            return false;
        }
        if(n==2 || n==3){return true;}
        if(n%2==0 || n%3==0){return false;}

        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                res=false;
            }
        }
        return res;
        
    }
    public static void main(String[] args) {
        int n=121;
        System.out.println(fun(n));
    }
    
}


