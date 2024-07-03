
public class FindUnique {
    public static void main(String[] args) {
        int arr[]={2,3,3,4,2,6,4};
        // System.out.println(findUnique(arr));
        // System.out.println(magicnumber(3));
        // System.out.println(noofdigits(234556, 2));
        // System.out.println(sumofrow(2));
        System.out.println(power(3, 6));
    }
   static int findUnique(int[] arr){
        int unique=0;
        for (int i : arr) {
            unique^=i;
        }
        return unique;
    }
    //find i th bit of a number
    static int i_th_bit(int n,int i_th_bit){
        int mask=1<<(i_th_bit-1);
        n=n&mask;
        return n;
    }
    static int magicnumber(int n){
        int base=5;
        int temp;
        int ans=0;
        while (n>0) {
        temp=n&1;
        ans=temp*base+ans;
        base=base*5;
        n=n>>1;
        }
        return ans;
    }
    static int noofdigits(int n,int base){
        int ans=(int)(Math.log(n)/Math.log(base))+1;
        return ans;
    }
    static int sumofrow(int n){
        // return the sum of nth row in pascal's triangle
        int ans=1<<(n-1)*(int)(Math.pow(2, n-1));
        return ans;

    }
    static boolean ispoweroftwo(int n){
        int ans=n&(n-1);
        if (ans==0) {
            return true;
        }
        return false;
    }
    static int power(int base,int pow){
        int ans=1;
        while (pow>0) {
            if ((pow&1)==1) {
                ans*=base;
            }
            base*=base;
            pow=pow>>1;
        }
        return ans;
    }
 }
