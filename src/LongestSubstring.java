import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * created by mohannad
 */
public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println("ab ,"+lengthOfLongestSubstring("ab")+ "   ,2"); //2
        System.out.println("abaab ,"+lengthOfLongestSubstring("abaab")+ "   ,2"); //2
        System.out.println("a  , "+lengthOfLongestSubstring("a") + "   ,1"); //1
        System.out.println("abc, "+lengthOfLongestSubstring("abc") + "   ,3"); //3
        System.out.println("abab, "+lengthOfLongestSubstring("abab") + "   ,2"); //3
        System.out.println("abca, "+lengthOfLongestSubstring("abca") + "   ,3"); //3
        System.out.println("aabca, "+lengthOfLongestSubstring("aabca") + "   ,3"); //3
        System.out.println("ababc, "+lengthOfLongestSubstring("ababc") + "   ,3"); //3 "dvdf"
        System.out.println("aa  ,"+lengthOfLongestSubstring("aa")+ "   ,1"); //1
        System.out.println("dvdf  ,"+lengthOfLongestSubstring("dvdf")+ "   ,3"); //1
        System.out.println("aaa ,"+lengthOfLongestSubstring("aaa")+ "   ,1"); //1
        System.out.println("    ,"+lengthOfLongestSubstring("  ")+ "   ,1"); //1
        System.out.println("aab ,"+lengthOfLongestSubstring("aab")+ "   ,2"); //2
        System.out.println("cdd ,"+lengthOfLongestSubstring("cdd")+ "   ,2"); //2
        System.out.println("aba ,"+lengthOfLongestSubstring("aba")+ "   ,2"); //2
        System.out.println("abac ,"+lengthOfLongestSubstring("abac")+ "   ,3"); //3
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length()<=1)
            return s.length();

        HashMap<Integer , Integer> last=new HashMap<>();
        int max=1;
        int cnt=0;
        int ltime=-1;
        for(int i= 0 ; i< s.length() ; ++i){
            char a = s.charAt(i);
            if(last.get(a-97)!=null &&last.get(a-97)>=ltime){
                max = Math.max(max , cnt);
                cnt=i-(last.get(a-97)+1);
                ltime=last.get(a-97);
            }
            ++cnt;
            last.put(a-97 , i);

        }
        max = Math.max(max , cnt);


        return max;
    }

    public class Solution {
        public int lengthOfLongestSubstring(String s) {
            int n = s.length();
            Set<Character> set = new HashSet<>();
            int ans = 0, i = 0, j = 0;
            while (i < n && j < n) {
                // try to extend the range [i, j]
                if (!set.contains(s.charAt(j))){
                    set.add(s.charAt(j++));
                    ans = Math.max(ans, j - i);
                }
                else {
                    set.remove(s.charAt(i++));
                }
            }
            return ans;
        }
    }
}
