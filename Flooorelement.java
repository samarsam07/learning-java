public class Flooorelement {
    public static void main(String[] args) {
        Flooorelement obj =new Flooorelement();
        int[] arr={2,3,5,10,23,24,45,100};
        int target=44;
        int index=obj.flooorelement(arr, target);
        System.out.println(index);

    }
    public int flooorelement(int []arr,int target){
        int start=0;
        int end =arr.length -1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return arr[end];

    }
}
