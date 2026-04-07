import java.util.Arrays;
public class AnagramString {
   
    public static boolean anagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }

    public static void main(String[] args) {
        String s ="silent";
        String t ="listen";

        boolean result = anagram(s,t);

        System.out.println(result);
    }
}
