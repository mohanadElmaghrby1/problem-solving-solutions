package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Mohannad Elmagharby
 * on 4/25/2021
 */
public class Div2_6B {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        var nmColor= bf.readLine().split(" ");
        var n = Integer.parseInt(nmColor[0]);
        var m = Integer.parseInt(nmColor[1]);
        var color = nmColor[2].charAt(0);

        var arr = new char[n+2][m+2];
        Arrays.fill(arr[0],'.');
        Arrays.fill(arr[n+1],'.');
        for (int i = 1; i <= n; i++) {
            arr[i]= ("."+bf.readLine()+".").toCharArray();
        }

        var set = new HashSet<Character>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (arr[i][j] == color){
                    //left i -j
                    if (arr[i][j-1]!='.' && arr[i][j-1]!=color)
                        set.add(arr[i][j-1]);

                    //right i +j
                    if (arr[i][j+1]!='.' && arr[i][j+1]!=color)
                        set.add(arr[i][j+1]);

                    //up -i j
                    if (arr[i-1][j]!='.' && arr[i-1][j]!=color)
                        set.add(arr[i-1][j]);

                    //down +i j
                    if (arr[i+1][j]!='.' && arr[i+1][j]!=color)
                        set.add(arr[i+1][j]);
                }
            }
        }
        System.out.println(set.size());
    }
}
