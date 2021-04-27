package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 4/22/2021
 */
public class Div2_435B {

    private String[] nm;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = bf.readLine().split(" ");
        var a = nm[0].toCharArray();
        int k = Integer.parseInt(nm[1]);
            for (int i = 0; i < a.length - 1 && k>0; i++) {

                //go to get the biggest number
                int mxIndx = i;
                for (int j = i + 1; j < a.length && j - i <= k; j++) {
                    if (a[j] > a[mxIndx]) {
                        mxIndx = j;
                    }
                }
                //swap
                while(mxIndx != i){
                    var tem = a[mxIndx-1];
                    a[mxIndx-1] = a[mxIndx];
                    a[mxIndx] = tem;
                    --mxIndx;
                    --k;
                }


        }

        System.out.println(new String(a));

    }

}
