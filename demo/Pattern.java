package demo;

public class Pattern {
    public static void pattern(int n){
        int i=0;
        while(i<n){
            int j=0;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2;j++){
                if(i==n){
                    System.out.print("*");
                    continue;
                }
                if(i!=1 && j==1 || j==i*2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void hollowTriangle(int n){
        for(int i=n;i>0;i--){
            if (i!=1) {
                for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2;j++){
                if(i==n){
                    System.out.print("*");
                    continue;
                }
                if(i==1)
                    continue;
                if(i!=1 && j==1 || j==i*2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            }
           
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2;j++){
                if(i==n){
                    System.out.print("*");
                    continue;
                }
                if(i!=1 && j==1 || j==i*2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        // pattern(4);
        pyramid(5);
        // hollowTriangle(3);
    }
}
