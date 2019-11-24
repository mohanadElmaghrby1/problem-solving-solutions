

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/**
 * created by mohannad  on 24/11/19
 */
public class BalancedBrackets {

    public static void main(String[] args) {
        System.out.println(isBalanced("{{}}"));
        System.out.println(isBalanced("[[({})]]"));
        System.out.println(isBalanced("{{}([]{)}}"));
        System.out.println(isBalanced("{{[[(())]]}}"));
        System.out.println(isBalanced("{[(])}"));
    }

    // Complete the isBalanced function below.
    static String isBalanced(String s) {

        String open="{([";
        String close="})]";

        String ans="YES";
//        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < chars.length; i++) {
//            stack.push(chars[i]);
//        }

        int i=0;
        while (i<s.length()){
            char c = s.charAt(i);
            if (open.indexOf(c)!=-1){
                stack.push(c);
            }else {
                //c is close brackets
                if (stack.isEmpty()){
                    ans="NO";
                    break;
                }
                Character pop = stack.pop();
                if(pop=='{'&&c!='}'){
                    ans="NO";
                    break;
                }else if(pop=='['&&c!=']'){
                    ans="NO";
                    break;
                }else if(pop=='('&&c!=')'){
                    ans="NO";
                    break;
                }

            }


            ++i;
        }
        ans=stack.isEmpty()?ans:"NO";
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int t = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int tItr = 0; tItr < t; tItr++) {
//            String s = scanner.nextLine();
//
//            String result = isBalanced(s);
//
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
//        }
//
//        bufferedWriter.close();
//
//        scanner.close();
//    }
}
