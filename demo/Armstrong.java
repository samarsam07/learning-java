package demo;

public class Armstrong {
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
    public static int count(int num){
        int cnt=0;
        while(num!=0){
            cnt++;
            num/=10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
    
}
