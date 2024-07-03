import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
      
        fibonnaci a=new fibonnaci();
        System.out.println("enter the nth term");
        int z=a.fibonaccinum(6);
        System.out.println(z);      
    }
    int fibonaccinum(int n){
     if(n==0){
            return 0;
        }
     if(n==1){
        return 1;
     }
    int temp=fibonaccinum(n-1)+fibonaccinum(n-2);
    return temp;
    }
}
