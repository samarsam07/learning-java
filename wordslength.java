import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class wordslength {
    public static void main(String[] args) {
        // int count=0;
        // int count_words=0;
        // String s="hello world";
        // String[] words=s.split("\\s");
        // for (int i = 0; i < words.length; i++) {
        //     count=count+words[i].length();
        // }
        // System.out.println(words.length);
        // System.out.println(count);
        // for (String string : words) {
        //     System.out.println(string);
        // }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);
        ans.add(10);
        ans.add(3);
        Collections.sort(ans);
        System.out.println(ans.get(0));
        
    }
}
