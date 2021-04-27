package codeforces;

import java.util.Arrays;

/**
 * @author Mohannad Elmagharby
 * on 4/23/2021
 */
public class let {

    public static void main(String[] args) {
//        int arr[] = {2, 4, 1};
//        System.out.println(maxProfit(arr));
////
//        int arr2[] = {7, 1, 5, 3, 6, 4};
//        int arr3[] = {1, 2, 3, 4, 5};
//        int arr4[] = {7, 6, 4, 3, 1};
////        System.out.println(canPlaceFlowers(arr,2));
//        String s="";
//        s.toCharArray()
//                char
//        System.out.println(maxProfit(arr));
//        System.out.println(maxProfit(arr2));
//        System.out.println(maxProfit(arr3));
//        System.out.println(maxProfit(arr4));

        System.out.println(getSmallestString(3, 27));
        System.out.println(getSmallestString(5, 73));
        System.out.println(getSmallestString(1, 1));
        System.out.println(getSmallestString(1, 26));
    }

    public static String getSmallestString(int n, int k) {
        char arr[]=new char[n];
        Arrays.fill(arr,'a');
        k-=n;
        int i=n-1;
        while (k>0 && i>=0){
            ++k;
            int valToAdd = Math.min(26,k);
            k-=valToAdd;
            arr[i] = (char) (valToAdd+96);
            --i;
        }

        return new String(arr);
    }

    public static int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 0; i < prices.length; i++) {
            int last = i;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[last]) {
                    last = j;
                } else
                    break;
            }
            ans += prices[last] - prices[i];
            i = last;
        }

        return ans;
    }


    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (flowerbed.length == 1) {
            return flowerbed[0] == 0;
        }

        for (int i = 0; i < flowerbed.length && n > 0; ++i) {
            if (i == 0 && flowerbed[i + 1] + flowerbed[i] == 0) {
                --n;
                flowerbed[i] = 1;
            } else if (i == (flowerbed.length - 1) && flowerbed[i - 1] + flowerbed[i] == 0) {
                --n;
                flowerbed[i] = 1;
            } else if (i != 0 && i != (flowerbed.length - 1) && flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                --n;
                flowerbed[i] = 1;
            }
        }
        return n == 0;

    }
}
