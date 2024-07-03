public class binarysearch {
    public static void main(String[] args) {
        binarysearch obj=new binarysearch();
        int[] arr={2,3,5,10,23,45,100};
        int target=109;
        // int index=obj.Binarysearch(arr, target);
        // System.out.println(index);
        System.out.println(obj.search(arr, target, 0, arr.length-1));
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
    int search(int[] arr,int target,int start,int end){
      if (start>end) {
            return -1;
         }
     int mid=start+(end-start)/2;
      if (arr[mid]==target) {
        return mid;
      }
     else if(arr[mid]<target){
   
         return search(arr, target, mid +1, end);

     }
   
     return search(arr, target, start, mid-1);
    }
}
