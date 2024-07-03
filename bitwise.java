public class bitwise {
    public static void main(String[] args) {
       bitwise bit=new bitwise(); 
       boolean  check=bit.isodd(5);
       System.out.println(check);
      
    }
    boolean isodd(int n){
        return(n & 1)==1;
    }
   
}
