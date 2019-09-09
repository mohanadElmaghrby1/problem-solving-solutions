public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(-10));
        System.out.println(isPalindrome(-121));
    }
    public  static boolean isPalindrome(int x) {
        String t=x+"";
        int ln=t.length()/2;
        for (int i = 0; i < ln; i++) {
            if (t.charAt(i)!=t.charAt(t.length()-i-1))
                return false;
        }

        return true;
    }
}
