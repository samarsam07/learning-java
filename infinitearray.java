public class infinitearray {
    public static void main(String[] args) {
        infinitearray obj=new infinitearray();
        int[] arr={1,2,3,5,6,10,12,13,17,19,20,26,29,50};
        int target=50;
        System.out.println(obj.findingrange(arr,target));
    }
    int findingrange(int[] arr,int target){
        int start=0;
        int end =1;
        while(arr[end]<target){
            int temp=end +1;
            end=end+(2*(end-start+1));
            start=temp;
        }
        return search(arr, target, start, end);
    }
    int search(int[] arr,int target,int start,int end){
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
