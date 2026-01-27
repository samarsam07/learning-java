package demo;

public class SuperFactor {
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
    public static void main(String[] args) {
        System.out.println(superFactor(0));
    }
}
