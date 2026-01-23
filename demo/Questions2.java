package demo;

import java.util.Scanner;

public class Questions2 {
    
    public static void inputPrintAllTypes() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a byte ");
        byte b = sc.nextByte();
        System.out.println("Byt: " + b);
        
        System.out.print("Enter a short : ");
        short s = sc.nextShort();
        System.out.println("Short: " + s);
        
        System.out.print("Enter int: ");
        int i = sc.nextInt();
        System.out.println("Int " + i);
        
        System.out.print("Enter a long ");
        long l = sc.nextLong();
        System.out.println("Long value: " + l);
        
        System.out.print("Enter a floa ");
        float f = sc.nextFloat();
        System.out.println("Float value: " + f);
        
        System.out.print("Enter a doubl ");
        double d = sc.nextDouble();
        System.out.println("Double : " + d);
        
        System.out.print("Enter a boolean ");
        boolean bool = sc.nextBoolean();
        System.out.println("Boolean " + bool);
        
        System.out.print("Enter a char: ");
        char c = sc.next().charAt(0);
        System.out.println("Char" + c);
    }
    
    // Arithmetic operations functions
    public static void add(int a, int b) {
        System.out.println((a + b));
    }
    
    public static void sub(int a, int b) {
        System.out.println((a - b));
    }
    
    public static void multi(int a, int b) {
        System.out.println((a * b));
    }
    
    public static void division(int a, int b) {
            System.out.println( (a / b));
        
    }
    
    public static void modulus(int a, int b) {
            System.out.println( (a % b));
    }
    
    public static void main(String[] args) {
        // inputPrintAllTypes();
        
        add(10, 5);
        sub(10, 5);
        multi(10, 5);
        division(10, 5);
        modulus(10, 5);

        int x=5;
        int b=x++ + ++x +x--;
        System.out.println(b);
        System.out.println(area(2));
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int c=s.nextInt();
        if(a+c>50)
            System.out.println("greater than 50");

        // swap
        int y=10;
        int z=20;
        y=y+z;
        z=y-z;
        y=y-z;
        
        System.out.println(y +" "+ z);
    }
    public static double area(double r){
        return 2* 3.14*r *r;
    }
    public static int largestOfThree(int a ,int b,int c){
        if(a>b){
            if(a>c){
                return a;
            }else{
                return c;
            }
        }else{
            if(b>c)
                return b;
            else
                return c;
        }
    }
    public static int bill(int unit){
        if(unit<=100){
            return unit *2;
        }else if(unit<=200){
            return unit*4;
        }else{
            return unit * 6;
        }
    }
    public static void printGrade(int marks){
        if(marks>=90)
            System.out.println("A");
        else if(marks>=80)
            System.out.println("B");
        else if(marks>=70)
            System.out.println("C");
        else if(marks>=60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
