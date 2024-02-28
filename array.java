// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // int[]arr=new int[10];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]=in.nextInt();
        // }
        // for( int num:arr){
        //     System.out.print(num +" ");
        // }
        // System.out.println(Arrays.toString(arr ));
        int [][] arr2d=new int[3][3];
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                arr2d[row][col]=in.nextInt();
            }
        }
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                System.out.print(arr2d[row][col]+" ");
            }
            System.out.println();
        }
        for (int[] a : arr2d) {
            System.out.println(Arrays.toString(a));
        }
    }
}
