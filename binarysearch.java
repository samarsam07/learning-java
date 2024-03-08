public class binarysearch {
    public static void main(String[] args) {
        binarysearch obj=new binarysearch();
        int[] arr={2,3,5,10,23,45,100};
        int target=100;
        int index=obj.Binarysearch(arr, target);
        System.out.println(index);
        }
    public int Binarysearch(int []arr,int target){
        int start=0;
        int end =arr.length -1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return -1;
    }
}
