package demo;

import java.util.Scanner;

public class Number {
    public static boolean isArmstrong(int num){
        int temp=num;
        int count =count(num);
        int sum=0;
        while(num!=0){
            int dig=num%10;
            sum+=Math.pow(dig, count);
            num/=10;
        }
        if(temp==sum)
            return true;  
        return false;
    }
    public static Boolean superFactor(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sum+=i;
        }
        if(sum==num)
            return true;
        return false;
    }
    public static int count(int num){
        int cnt=0;
        while(num!=0){
            cnt++;
            num/=10;
        }
        return cnt;
    }
    public static boolean isFibonaaci(int num){
        if(num==0 || num==1)
            return true;
        int a=0;
        int b=1;
        int z=a+b;
        while(z<=num){
            a=b;
            b=z;
            z=a+b;
            if(z==num)
                return true;
        }
        if(z==num)
                return true;
        return false;
    }
    public static void run(){
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        while (flag) {
            System.out.println(" enter your choice \n 1- armstrong \n 2- fibonaaci\n 3- factor \n 4- exit");
           
            int choice=sc.nextInt();
            switch (choice) {
               case 1:
                    System.out.print("enter number :");
                    int num=sc.nextInt();
                    System.out.println(isArmstrong(num)?"armstrong":"not"); 
                    break;
                case 2:
                    System.out.println("Enter a number :");
                    int n=sc.nextInt();
                    System.out.println(isFibonaaci(n)?"yes":"no");
                    break;
                case 3:
                    System.out.println("enter a number :");
                    int x=sc.nextInt();
                    System.out.println(superFactor(x)?"yes":"no");
                    break;
                case 4:
                    flag=false;
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
           
            
        }
        sc.close();
    }
    public static void main(String[] args) {
        run();
        // System.out.println(isFibonaaci(8));
    }
}
