package demo;

import java.util.ArrayList;

import java.util.HashSet;

public class Questions {
    public static String intToBinary(int num){
        if(num==0){
            return "0";
        }
        String ans="";
        while(num!=0){
            if((num&1)==1){
                ans=ans+"1";
            }else{
                ans=ans+"0";
            }
            num=num>>1;
        }
        return ans;
    }
    public static boolean superSquare(int n,int sqrt){
        int base=1;
        int cnt=0;
        int temp=n;
        while(temp!=0){
            cnt++;
            temp/=10;
        }
        while(cnt!=0){
            base*=10;
            cnt--;
        }
        int sup=sqrt%base;
        if(sup==n)
            return true;
        return false;
    }
    public static int allDigitSum(int n){
        if(n<10)
            return n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return allDigitSum(sum);
    }
    public static void stringCompare(){
        String s1="john";
        String s2="john";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
    public static ArrayList<Integer> removeDuplicate(int []arr){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int num:arr){
            if(!set.contains(num)){
                set.add(num);
                res.add(num);
            }
        }
        return res;

    }
    public static void main(String[] args) {
        System.out.println(intToBinary(5));
        System.out.println(superSquare(25, 625));
        System.out.println(allDigitSum(12345));
        stringCompare();
        System.out.println(removeDuplicate(new int[]{1,2,3,2,3,4,1,3}));
    }
}
