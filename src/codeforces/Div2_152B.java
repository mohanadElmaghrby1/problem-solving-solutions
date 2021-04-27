package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 4/24/2021
 */
public class Div2_152B {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        var nm= bf.readLine().split(" ");
        var n = Integer.parseInt(nm[0]);
        var m = Long.parseLong(nm[1]);

        var xy= bf.readLine().split(" ");
        var x = Integer.parseInt(xy[0]);
        var y = Long.parseLong(xy[1]);
        var k = Integer.parseInt(bf.readLine());
        long ans=0;
        for (int i = 0; i < k; i++) {
            var dxy= bf.readLine().split(" ");
            var dx = Integer.parseInt(dxy[0]);
            var dy = Long.parseLong(dxy[1]);
            while ((x+dx) >0 && (x+dx)<=n &&
                    (y+dy)>0 && (y+dy)<=m){
                ++ans;
                x+=dx;
                y+=dy;
            }
        }
        System.out.println(ans);



    }
}
