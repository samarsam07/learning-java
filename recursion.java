public class recursion {
    static int sum=0;
    public static void main(String[] args) {
        int arr[]={1,2,4,7};
        System.out.println(issorted(arr, 0));
        System.out.println(fact(3));
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    static int sumoddigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumoddigits(n/10);
    }
    static int reverse(int n){
        if (n==0){
            return 0;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
        return sum;   
    }
    static boolean issorted(int[] arr,int i){
      
        if(i==arr.length-1){
            return true;
        }
      return arr[i]<arr[i+1] && issorted(arr, i+1);
    }
}
