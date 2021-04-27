package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Mohannad Elmagharby
 * on 4/24/2021
 */
public class Div2_262B {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        var nrAvg= bf.readLine().split(" ");
        var n = Integer.parseInt(nrAvg[0]);
        var k = Integer.parseInt(nrAvg[1]);
        var arr = new int[n];
        var s = bf.readLine().split(" ");
        int mis=0,sum=0;
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(s[i]);
            sum+=arr[i];
            mis+=arr[i]<=0?1:0;
        }
        Arrays.sort(arr);

        int toChange = Math.min(mis,k);
        int i=0 , fin=toChange;
        while (toChange>0 && i<n){
            sum-=arr[i];
            arr[i]*=-1;
            sum+=arr[i];
            --toChange;
            ++i;
        }
        Arrays.sort(arr);

        if ((k-fin)%2==1){
            sum-=arr[0];
            arr[0]*=-1;
            sum+=arr[0];
        }
        System.out.println(sum);

    }
}
