public class pow {
    public static void main(String[] args) {
        int[] arr={2,0,0};
        System.out.println(power(3, 1000000));
    }
     static double power(double base,int n){
       double ans=1.0;
       long nn=n;
       if (nn<0) {
        nn=-1*nn;
       }
       while(nn>0){
        if((nn&1)==1){
            ans*=base;
        }
        base*=base;
        nn=nn>>1;
       }
       if (n<0) {
        return 1/ans;
       }
      return ans;
    }
    static long superPow(int a, int[] b) {
        long temp=0;
        long ans=1;
        long ab=a;
        for(int i=0;i<b.length;i++){
            temp=temp*10 + b[i];
        }
        System.out.println(temp);
        while(temp>0){
            if((temp&1)==1){
                ans*=ab;
            }
            ab*=ab;
            temp=temp>>1;
        }
        System.out.println(ans);
        long ret=ans%1337;
        System.out.println(ret);
        return ret;
    }
}
