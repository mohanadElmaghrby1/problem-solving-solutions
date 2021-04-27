package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Mohannad Elmagharby
 * on 4/24/2021
 */
public class Div2_433B {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        var n = Integer.parseInt(bf.readLine());
        var vs= bf.readLine().split(" ");
        var arr = new long[n+1];
        var sortedArr = new ArrayList<Long>(n+1);
        sortedArr.add(0l);
        for (int i = 1; i <= n; i++) {
            arr[i]=Integer.parseInt(vs[i-1]);
            sortedArr.add(arr[i]);
            arr[i]+=arr[i-1];
        }
        Collections.sort(sortedArr);
        for (int i = 1; i <= n; i++) {
//            sortedArr[i]+=sortedArr[i-1];
            sortedArr.set(i,sortedArr.get(i)+ sortedArr.get(i-1));
        }
        var m =  Integer.parseInt(bf.readLine());
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < m; i++) {
            var typeRl= bf.readLine().split(" ");
            var type = Integer.parseInt(typeRl[0]);
            var l = Integer.parseInt(typeRl[1]);
            var r = Integer.parseInt(typeRl[2]);
            if (type ==1){
                ans.append(arr[r]-arr[l-1]+"\n");
            }else {
                ans.append(sortedArr.get(r)-sortedArr.get(l-1)+"\n");

            }
        }
        System.out.println(ans.toString());


    }
}
