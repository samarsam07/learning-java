public class Squareroot {
    public static void main(String[] args) {
        System.out.println(Sqrt(122, 6));
    }
    static double Sqrt(int n, int precision){
        double root=0;
        int start=0;
        int end=n;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(mid*mid>n){
                end=mid-1;
            }
            else if (mid*mid<n){
                start=mid+1;
            }
            else {
                root=mid;
            }

            
        }
        double incr=0.1;
        for (int i = 0; i < precision; i++) {
            while (root*root<=n) {
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }
}
