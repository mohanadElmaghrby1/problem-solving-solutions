package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author Mohannad Elmagharby
 * on 4/24/2021
 */
public class Div2_242C {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        var xyx2y2= bf.readLine().split(" ");
        var x = Integer.parseInt(xyx2y2[0]);
        var y = Integer.parseInt(xyx2y2[1]);
        var x2 = Integer.parseInt(xyx2y2[2]);
        var y2 = Integer.parseInt(xyx2y2[3]);
        var n = Integer.parseInt(bf.readLine());
        var map = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            var rab= bf.readLine().split(" ");
            var r = Integer.parseInt(rab[0]);
            var a = Integer.parseInt(rab[1]);
            var b = Integer.parseInt(rab[2]);
            while (a<=b){
                map.put(r+","+a , -1);
                ++a;
            }

        }
        /**
         * 5 7 6 11
         * 3
         * 5 3 8
         * 6 7 11
         * 5 2 5
         */
        System.out.println(bfs(map,x,y,x2,y2));

    }

    public static int bfs(HashMap<String ,Integer> map, int x, int y , int x2 , int y2){
        var q = new LinkedList<String>();
        q.add(x+","+y);
        map.put(x+","+y,0);
        while (!q.isEmpty()){
            var parent = q.remove();
            var rc=parent.split(",");
            int r  = Integer.parseInt(rc[0]), c=Integer.parseInt(rc[1]);
            for (int i = -1; i < 2; i++) {
                int newR = i+r;
                for (int j = -1; j < 2; j++) {
                    if (i==0&&j==0)
                        continue;
                    int newC = c+j;
                    //visited before
                    if (map.get(newR+","+newC)==null || map.get(newR+","+newC)!=-1){
                        continue;
                    }
                    //adding to q
                    q.add(newR+","+newC);
                    map.put(newR+","+newC , map.get(parent)+1);
                }
            }
        }

        return map.get(x2+","+y2);
    }
}
