abstract class car{
    public  abstract void engine();
    public void type(){
        System.out.println("petrol");
    }
}
class Audi extends car{
    public void engine(){
        System.out.println("v8");
    }

}
public class Main {
    public static void main(String []args){
        Audi myAudi=new Audi();
        myAudi.engine();
        myAudi.type();
    }
}

