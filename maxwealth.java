public class maxwealth {
    public static void main(String[] args) {
        maxwealth obj=new maxwealth();
        int[][] arr={{1,2,3},{3,2,1}};
        int max=obj.Maxwealth(arr);
        System.out.println(max);
    }
    public int Maxwealth(int [][]accounts){
            int max=Integer.MIN_VALUE;
            int add=0;
            for(int i=0;i<accounts.length;i++){
                for(int j=0;j<accounts[i].length;j++){
                    add=accounts[i][j]+add;
                }
                if(add>max){
                    max=add;
                }
                add=0;
            }
            return max;
        }
    }

