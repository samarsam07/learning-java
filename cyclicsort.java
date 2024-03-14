import java.util.Arrays;
// use  when 1 to n elements is given

public class cyclicsort {
    public static void main(String[] args) {
        cyclicsort obj=new cyclicsort();
        int[]arr ={5,4,3,2,1};
        obj.cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    void cyclesort(int[] arr){
        int i=0;
        while (i<arr.length) {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    void swap(int arr[],int first ,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}


