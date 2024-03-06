public class evendigit {
    public static void main(String[] args) {
        evendigit obj=new evendigit();
        int arr[]={12,333,4444,1,22,99999};
        int count=obj.Evendigit(arr);
        System.out.println(count);
        int ans=obj.evendigit1(arr);
        System.out.println(ans);
    }
    public int Evendigit(int arr[]){
        int n;
        int temp=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            n=arr[i];
            while(n!=0){
                n=n/10;
                temp++;
            }
            if(temp%2==0){
                count++;
            }

        }
        return count;
    }
    // optimized solution
    public int evendigit1(int arr[]){
        int temp;
        int count=0;
        for (int i : arr) {
            temp=(int)Math.log10(i)+1;
            if(temp%2==-0){
                count++;
            }  
        }
        return count;
    }
}
