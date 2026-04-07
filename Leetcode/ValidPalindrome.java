
public class ValidPalindrome {
    public static boolean palindrome(String s) {
        int r= s.length()-1;
        int l=0;

        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }


        return true;
    }

    public static void main(String[] args) {
        String s ="madam";

        boolean result = palindrome(s);

        System.out.println(result);
    }
}
