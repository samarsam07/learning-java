// import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        linearsearch obj =new linearsearch();
        // Scanner in=new Scanner(System.in);
        //array
        int[] arr={1,4,2,6,7,10,3};
        // int target=in.nextInt();
        // int a=obj.Linearsearch(arr,target);
        // System.out.println(a);
        //string
        String str="Samar";
        // char target1=in.next().charAt(0);
        // boolean ans=obj.search1(str, target1);
        // System.out.println(ans);
        System.out.println(findPosition(arr, 10, 0));

    }
    public int Linearsearch(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
    boolean search1(String str,char target){
        for (char element:str.toCharArray()) {
            if(element==target){
                return true;
            }
        }
        return false;
    }
    static boolean findelement(int arr[],int target ,int index){
        if(index==arr.length){
            return false ;
        }
        return arr[index]==target || findelement(arr, target, index+1);
    }
    static int findPosition(int[] arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return findPosition(arr, target, i+1);
    }
}
