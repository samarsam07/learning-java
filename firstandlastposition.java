import java.util.Arrays;

public class firstandlastposition {
    public static void main(String[] args) {
        firstandlastposition obj =new firstandlastposition();
        int nums[]={1,2,3,4,4,4,4,5,6,10};
        int target=4;
        int []ans=obj.searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        return ans;
       }
       int search(int[] nums,int target,boolean t){
             int start=0;
             int ans=-1;
             int end =nums.length -1;
             int mid=start+(end-start)/2;
             while(start<=end){
                 if(nums[mid]==target){
                     ans=mid;
                     if(t){
                         end=mid-1;
                     }else{
                         start=mid+1;
                     }
                 }
                 else if(nums[mid]<target){
                     start=mid+1;
                 }
                 else{
                     end=mid-1;
                 }
                 mid=start+(end-start)/2;
             }
             return ans;
         }
 }
