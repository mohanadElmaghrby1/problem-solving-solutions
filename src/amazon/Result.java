//package amazon;
//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//class Result {
//
//    /*
//     * Complete the 'getWays' function below.
//     *
//     * The function is expected to return a LONG_INTEGER.
//     * The function accepts following parameters:
//     *  1. INTEGER n
//     *  2. LONG_INTEGER_ARRAY c
//     */
//
//    public static long getWays(int n, List<Long> c) {
//        // Write your code here
//        solve(c,n,0);
//        return count;
//    }
//
//    static int count=0;
//    static HashMap<String,Long> visited=new HashMap<>();
//    static long solve(List<Long> c , long ammount ,int indx){
//        if (visited.containsKey(ammount+","+indx)){
//            return visited.get(ammount+","+indx);
//        }
//        if (ammount==0){
//            return 1;
//        }
//        if (ammount<0)
//            return 0;
//
//        long ans=0;
//        for (int i = indx; i < c.size(); i++) {
//            ans+=solve(c,ammount-c.get(i),i);
//        }
//
//        visited.put(ammount+","+indx , ans);
//        return ans;
//    }
//
////    static void solve(List<Long> c , long ammount ,int indx){
////
////        if (ammount==0){
////            ++count;
////            return;
////        }
////        if (ammount<0)
////            return;
////
////        for (int i = indx; i < c.size(); i++) {
////            solve(c,ammount-c.get(i),i);
////        }
////    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(firstMultipleInput[0]);
//
//
//        int m = Integer.parseInt(firstMultipleInput[1]);
//
//        List<Long> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Long::parseLong)
//                .collect(toList());
//
//        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
//
//        long ways = Result.getWays(n, c);
//
//        bufferedWriter.write(String.valueOf(ways));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
