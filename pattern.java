public class pattern {
    public static void main(String[] args) {
        pattern obj =new pattern();
        obj.pattern3(30);
        
    }
    void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    void pattern3(int n){
        for (int i = 1; i <= n/2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n/2-1; i++) {
            for (int j = 0; j < n/2-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
