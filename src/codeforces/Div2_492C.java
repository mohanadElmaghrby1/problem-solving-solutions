package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Mohannad Elmagharby
 * on 4/23/2021
 */
public class Div2_492C {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        var nrAvg= bf.readLine().split(" ");
        var n = Integer.parseInt(nrAvg[0]);
        var r = Long.parseLong(nrAvg[1]);
        var avg = Long.parseLong(nrAvg[2]);
        long req = avg *n , current=0 ,ans=0;
        var ab = new long [n][2];
        for (int i = 0; i < n; i++) {
            var abStr =bf.readLine().split(" ");
            ab[i][0]=Long.parseLong(abStr[0]);
            ab[i][1]=Long.parseLong(abStr[1]);
            current += ab[i][0];
        }
        Arrays.sort(ab, Comparator.comparingLong(a -> a[1]));

        for (int i = 0; i < n && current<req; i++) {
            if (ab[i][0] < r){
//                current += (r - ab[i][0]);
                long reqVal = Math.min(r - ab[i][0] , req-current);
                current += reqVal;
                ans+=(reqVal * ab[i][1]);
            }
        }
        System.out.println(ans);

    }
}
