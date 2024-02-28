import java.util.Scanner;

public class countdigit1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int target=in.nextInt();
        int rem;
        int count=0;
        while(n!=0){
            rem=n%10;
            if(rem==target){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
