import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        sorting obj=new sorting();
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        obj.Bubblesort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr11={1,2,3,4,5,6,7,10};
        obj.selection(arr11);
        System.out.println(Arrays.toString(arr11));
        int[] arr2={1,2,3,4,5,6,710};
        obj.insertionsort(arr2);
        System.out.println(Arrays.toString(arr2));

        
    }
    void Bubblesort(int[] arr){
        boolean swap;
        for(int i=0;i<arr.length;i++){
            swap=false;
            for (int j = 1; j <= arr.length-i-1; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
                if (!swap) {
                    break;
                }
            }
        }
    }
    void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length -i-1;
            int maxindex=getmaxindex(arr,0,last);
            swap(arr, maxindex,last);
        }
    }
    int getmaxindex(int[] arr,int start,int end){
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max =i;
            }
        }
        return max;
    }
    void swap(int arr[],int first ,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    void insertionsort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
}
