package demo;

import java.util.Scanner;

public class Test {
    public static void printSpringboot(int n){
        String spring="Spring boot Ready";
        int i=0;
        while(i<n){
            System.out.println(spring);
            i++;
        }
    }
    public static void main(String[] args) {
        printSpringboot(10);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=sum(a, b);
        System.out.println(res);

        String name="john";
        int age=22;
        System.out.printf("name :%s age :%d%n", name, age);
        sc.close();
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
