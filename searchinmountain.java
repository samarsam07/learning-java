public class searchinmountain {
    public static void main(String[] args) {
        searchinmountain obj=new searchinmountain();
        int[] arr={1,2,3,4,5,6,7,23,20,10,7,5,3,1};
        int target=5;
        int end=obj.searchinmountainarray(arr);
        System.out.println(obj.Binarysearch(arr,target,end));
    }
    int searchinmountainarray(int[] arr){
        int s = 0;
        int e = arr.length-1;
        int mid =s + (e-s)/2;
        while(s<e){
            if (arr[mid]<arr[mid +1]){
                s=mid +1;
            }
            else {
                e=mid;
            }
         mid =s + (e-s)/2;
        }
        return s;
    }
    public int Binarysearch(int []arr,int target,int end){
        int start=0;
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

