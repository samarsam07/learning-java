import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {
        // System.out.println(isPrime(3));
        System.out.println(prime(20));
    }
    static boolean isPrime(int n ){
        if(n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        } 
        return true;
    }
    static int prime(int n){
        if(n<=1){
            return 0;
        }
        int count=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 2; i <=n; i++) {
            arr.add(i);
        }
        int temp=2;
        while (temp<=n) {
            
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)!=temp &&arr.get(i)%temp==0) {
                arr.remove(i);
                System.out.println(arr.size());
            }
        }
        temp++;
    }
        
        count=arr.size();
        
        return count;
    }
}
