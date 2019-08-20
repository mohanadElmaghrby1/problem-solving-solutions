/**
 * created by mohannad
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ac"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("babad"));
    }


    public  static String longestPalindrome(String s) {
        if(s.length()<=1)
            return s;

        String ans1 = getMaxPal(false , s);
        String ans2 = getMaxPal(true , s);
        if (ans1.equals(ans2) && ans1.equals(""))
            return s.charAt(0)+"";
        return ans1.length()>ans2.length()?ans1:ans2;

    }

    public static String getMaxPal(boolean withMid, String s) {
        String ans = "";

        for (int i = 0; i < s.length(); ++i) {
            int l = i - 1, h = i + 1;
            String curr;
            if(withMid){
                ++l;
                curr="";
            }else
                curr = s.charAt(i) + "";
            while (l >= 0 && h < s.length()) {
                char lc = s.charAt(l);
                char hc = s.charAt(h);
                if (lc == hc) {
                    curr = lc + curr + hc;
                    if (curr.length() >= ans.length())
                        ans = curr;
                } else {
                    break;
                }

                --l;
                ++h;
            }
        }
        return ans;
    }
}
