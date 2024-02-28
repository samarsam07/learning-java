import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(5);
        // list.add(2);
        // list.add(5);
        // list.add(3);
        // list.add(10);
        // list.add(6);
        // System.out.println(list);
        // list.set(4, 100);
        // System.out.println(list);
        // list.remove(2);
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < args.length; i++) {
          System.out.println( list.get(i)); 
        }
    }
}
