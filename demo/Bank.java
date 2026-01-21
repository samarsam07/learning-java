package demo;

import java.util.Scanner;

public class Bank {
    private int balance;
    public Bank(){
        balance=0;
    }

    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public void addMoney(int val){
        balance+=val;
    }
    public void withdrawMoney(int amount){
        if(amount>balance){
            System.out.println("insufficient balance");
            return;
        }
        balance-=amount;
        System.out.println("success");
        System.out.println("remaining balance"+balance);
    }
    public void run(){
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        while (flag) {
            System.out.println(" enter your choice \n 1- add money \n 2- check balance\n 3- withdraw money\n 4- exit");
           
            int choice=sc.nextInt();
            switch (choice) {
               case 1:
                    System.out.print("enter amount :");
                    int amt=sc.nextInt();
                    addMoney(amt);
                    break;
                case 2:
                    System.out.println("balance :"+getBalance());
                    break;
                case 3:
                    System.out.println("enter amount :");
                    int amount=sc.nextInt();
                    withdrawMoney(amount);
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
        Bank b=new Bank();
        b.run();
    }
}
