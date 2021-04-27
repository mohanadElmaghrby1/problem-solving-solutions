package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Mohannad Elmagharby
 * on 4/27/2021
 */
public class CoinsChangeDP {

    public static void main(String[] args) {

        int arr[]={99,1};
        int n=100;
        List<List<Integer>> ans =new ArrayList<>();



//        System.out.println(solve(n,arr));
        System.out.println(maxCoins(n,0,arr));
    }

    //min
    public static int solve(int n, int coins[]){
        int dp[]=new int[n+1];
        Arrays.fill(dp, n+1);
        dp[0]=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >=coins[j]){
                    dp[i] = Math.min(dp[i], 1+dp[i-coins[j]]);
                }
            }
        }
        return dp[n]>n?-1:dp[n];
    }


    //max
    public static int maxCoins(int n , int indx, int coins[]){
        if (n==0)
            return 1;
        if (indx >=coins.length)
            return 0;
        int ans= 0;
        for (int i = indx ; i < coins.length ; ++i){
            if (n>= coins[i])
                ans += maxCoins(n-coins[i], i, coins ) ;
        }
        return ans;
    }
}
