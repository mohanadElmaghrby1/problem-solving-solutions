package amazon;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'unboundedKnapsack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int unboundedKnapsack(int k, List<Integer> arr) {
        // Write your code here
        return solve(k,arr)>=1?k:k-fans;

    }

    static int fans =Integer.MAX_VALUE;
    static int solve (int target, List<Integer> arr ){

        if (target == 0){
            System.out.println("done");
            return 1;
        }

        if (target<0)
            return 0;

        fans= Math.min(fans,target);

        int ans=0;
        for (int i=1 ; i <arr.size() ; ++i){
            //pick
            ans+=solve(target-arr.get(i), arr);
        }


        return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());



        for (int i = 0 ; i <t ; ++i){
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);

            int k = Integer.parseInt(firstMultipleInput[1]);

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
            int result = Result.unboundedKnapsack(k, arr);

            System.out.println(result);
        }


        bufferedReader.close();
    }
}
