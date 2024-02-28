import java.util.Scanner;

public class reverseint {
    public static void main(String[] args) {
           Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int rem;
        int temp=0;
        while(n!=0){
            rem=n%10;
            temp=temp*10 +rem;
            n=n/10;
        }
        System.out.println(temp);
    }
}
