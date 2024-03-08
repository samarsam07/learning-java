public class ceilingelement {
    public static void main(String[] args) {
       ceilingelement obj=new ceilingelement();
        int[] arr={2,3,5,10,23,24,45,100};
        int target=44;
        int index=obj.Ceilingelement(arr, target);
        System.out.println(index);
    }
    public int Ceilingelement(int []arr,int target){
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
        return arr[start];
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end =letters.length -1;
        int mid=start+(end-start)/2;
        while(start<=end){
            // if(letters[mid]==target){
            //     return letters[mid];
            // }
            if(letters[mid]>target){
               end =mid -1;
            }
            else{
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        if (start==letters.length){
            return letters[0];
        }
        else{
            return letters[start% letters.length];
        }
    }  
}
