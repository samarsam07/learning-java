package demo;

import java.util.Arrays;

public class Day4 {
    public static void pattern1(int n){
        int cnt=1;
        int i=0;
        while(i<n){
            int j=0;
            while(j<=i){
                System.out.print(cnt+++" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    static void pattern2(int n){
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<=i){
                System.out.print(i+" ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
    static int reverse(int n){
        int res=0;
        while(n!=0){
            int rem=n%10;
            res=res*10+rem;
            n/=10;  
        }
        return res;
    }
    static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println( n*i);
        }
    }
    static int[] mergeAlteArray(int[] arr1,int[] arr2){
        int []res=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            res[k++]=arr1[i++];
            res[k++]=arr2[j++];
        }
        while(i<arr1.length){
            res[k++]=arr1[i++];

        }
        while(j<arr2.length){
            res[k++]=arr2[j++];
        }
        return res;
    }
    public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // System.out.println(reverse(1234));
        // table(5);
       int[] res=mergeAlteArray(new int[]{11,12,13,14}, new int[]{10,20,30,40});
       System.out.println(Arrays.toString(res));

    }
}
