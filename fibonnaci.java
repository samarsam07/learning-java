import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N;
        System.out.println("enter the nth term");
        N=in.nextInt();
        int x=0;
        int y=1;
        int z;
        System.out.println(x);
        System.out.println(y);

        for (int i = 0; i<N-2; i++) {
            z=x+y;
            x=y;
            y=z;
            System.out.println(z);
        }
        
    }
}
