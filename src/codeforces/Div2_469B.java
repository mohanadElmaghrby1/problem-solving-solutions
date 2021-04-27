package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 4/24/2021
 */
public class Div2_469B {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        var pqlr = bf.readLine().split(" ");
        var p = Integer.parseInt(pqlr[0]);
        var q = Integer.parseInt(pqlr[1]);
        var l = Integer.parseInt(pqlr[2]);
        var r = Integer.parseInt(pqlr[3]);

        //z
        var abs = new int[p][2];
        for (int i = 0; i < p; i++) {
            var ab = bf.readLine().split(" ");
            abs[i][0] = Integer.parseInt(ab[0]);
            abs[i][1] = Integer.parseInt(ab[1]);
        }

        var cds = new int[q][2];
        for (int i = 0; i < q; i++) {
            var cd = bf.readLine().split(" ");
            cds[i][0] = Integer.parseInt(cd[0]);
            cds[i][1] = Integer.parseInt(cd[1]);
        }

        int ans = 0;
        for (int i = l; i <= r; i++) {
            boolean suit=false;
            for (int j = 0; j < cds.length && !suit; j++) {
                var newC = cds[j][0] + i;
                var newD = cds[j][1] + i;
                for (int v = 0; v < abs.length; v++) {
                    var a = abs[v][0];
                    var b = abs[v][1];
//                    System.out.println(newC+","+newD);
                    if ((newC >= a && newC <= b) ||
                            (newD >= a && newD <= b) ||
                            (newC <= a && newD >= b)) {
                        suit=true;
//                        System.out.println("t = "+i);
                        break;
                    }
                }
            }
            ans +=suit?1:0;
        }
        System.out.println(ans);

    }
}
