public class IsSorted {
    static boolean issorted(int[] arr,int i){
      
        if(i==arr.length-1){
            return true;
        }
      return arr[i]<arr[i+1] && issorted(arr, i+1);
    }
}
