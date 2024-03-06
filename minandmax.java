public class minandmax {
    public static void main(String[] args) {
        minandmax obj =new minandmax();
        int []arr ={10,2,3,1,0,3,4,100};
        int min=obj.min(arr);
        System.out.println(min);
        int max=obj.max(arr);
        System.out.println(max);
    }
    public int min(int[] arr){
        int min=arr[0];
        for (int i : arr) {
            if (i<min) {
                min=i;
            }
        }
        return min;
    }
    public int max(int arr[]){
        int max=arr[0];
        for (int i : arr) {
            if (i>max){
                max=i;
            }
        }
        return max;
    }
}
