package demo;

public class Pattern {
    public static void pattern(int n){
        int i=0;
        while(i<n){
            int j=0;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
