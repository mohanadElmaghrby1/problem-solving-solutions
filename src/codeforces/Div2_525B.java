package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 4/22/2021
 */
public class Div2_525B {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        var s = bf.readLine().toCharArray();
        int n = Integer.parseInt(bf.readLine());
        var as =bf.readLine().split(" ");
        var sums = new int [s.length];
        for (int i = 0; i < n; i++) {
            var a =Integer.parseInt(as[i]);
            ++sums[a-1];
            --sums[s.length-a];
//            swap(s, a-1 , s.length-a);
        }

        //accumulative sum
        for (int i = 1; i < s.length; i++) {
            sums[i]+=sums[i-1];
        }

        for (int i = 0; i<s.length/2; i++) {
            if (sums[i]% 2 == 1){
                swap(s,i, s.length-i-1);
            }
        }
        System.out.println(new String(s));

        
    }

    public static void swap(char[] arr, int l , int r){
        var temp = arr[l];
            arr[l] = arr[r];
            arr[r]= temp;
//        while (l<r){
//            var temp = arr[l];
//            arr[l] = arr[r];
//            arr[r]= temp;
//
//            --r;
//            ++l;
//        }
    }
}
