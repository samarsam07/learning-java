public class wordslength {
    public static void main(String[] args) {
        int count=0;
        int count_words=0;
        String s="hello world";
        String[] words=s.split("\\s");
        for (int i = 0; i < words.length; i++) {
            count=count+words[i].length();
        }
        System.out.println(words.length);
        System.out.println(count);
        for (String string : words) {
            System.out.println(string);
        }
    }
}
