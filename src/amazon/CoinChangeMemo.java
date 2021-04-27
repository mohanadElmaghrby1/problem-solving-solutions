package amazon;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Mohannad Elmagharby
 * on 4/26/2021
 */
public class CoinChangeMemo {


    public static void main(String[] args) {

//        int n=24;
//
//
//        int coins []= {1,2,3};
//        System.out.println(ways(n, coins,0));
//        System.out.println(waysMemo(n, coins,0));


//        int n = 250;
//        int coins2[] = {41, 34, 46, 9, 37, 32, 42, 21, 7, 13, 1, 24, 3, 43, 2, 23, 8, 45, 19, 30, 29, 18, 35, 11};
////        Arrays.sort(coins2);
////        System.out.println(ways(n, coins2,0));
//        System.out.println(waysMemo(n, coins2, 0));
//        System.out.println(waysMemo(10, coins2, 0));
//        int arr[] = {1, 2, 3};
//        System.out.println(waysMemo(4, arr, 0));
//
//        System.out.println(waysMoreEff(4, arr, 0));
//
//        System.out.println(minWays(4, arr, 0));
//        int arr2[]={5};

        int arr2[]={1};
        int n = 1;
        Arrays.sort(arr2);
        System.out.println(minWays(n, arr2, 0));
//        System.out.println(waysMemo(n, arr2, 0));

    }

    static long visited[][] = new long[260][60];

    HashMap<String,Long> map = new HashMap<>();
    static long waysMemo(int n, int[] coins, int indx) {
        if (n == 0) {
            return 1;
        }
        if (visited[n][indx] != 0)
            return visited[n][indx];
        long ans = 0;
        for (int i = indx; i < coins.length; i++) {
            if (n >= coins[i])
                ans += waysMemo(n - coins[i], coins, i);
        }
        visited[n][indx] = ans;
        return ans;

    }

    // Complete the ways function below.
    static int ways(int n, int[] coins, int indx) {
        if (n == 0) {
            return 1;
        }
        int ans = 0;
        for (int i = indx; i < coins.length; i++) {
            if (n >= coins[i])
                ans += ways(n - coins[i], coins, i);
        }
        return ans;

    }

    // Complete the ways function below.
    static int waysMoreEff(int n, int[] coins, int indx) {
        if (n == 0) {
            return 1;
        }
        if (indx == coins.length || n < coins[indx])
            return 0;
        //leave
        return waysMoreEff(n - coins[indx], coins, indx) + waysMoreEff(n, coins, indx + 1);

    }


    /**
     * get minmimum number of coins to get n
     *
     * @param n
     * @param coins
     * @param indx
     * @return
     */
    static long minWays(long n, int[] coins, int indx) {

        if (n == 0) {
            return 0;
        }
        if (indx == coins.length || n < coins[indx])
            return Integer.MAX_VALUE;
        //leave
        return Math.min(1l+minWays(n - coins[indx], coins, indx),
                minWays(n, coins, indx + 1));

    }


}
