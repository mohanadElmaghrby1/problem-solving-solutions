package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author Mohannad Elmagharby
 * on 4/24/2021
 */
public class Div2_129B {

    public static void main(String[] args)  throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String nm[] = bf.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        var map = new HashMap<Integer, LinkedList<Integer>>();
        for (int i = 0; i < m; i++) {
            String ab[] = bf.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            if (!map.containsKey(a)){
                map.put(a,new LinkedList<>());
            }
            if (!map.containsKey(b))
                map.put(b,new LinkedList<>());
            map.get(a).add(b);
            map.get(b).add(a);
        }

        int groups=0;
        boolean flag=true;
        while (flag){
            flag=false;
            boolean visited[]=new boolean[n+1];
            var keys = map.keySet();
            for (var key: keys) {
                var arr= map.get(key);
                if (arr.size() ==1 && !visited[key]){
                    flag=true;
                    int rem = arr.remove();
                    visited[rem]=true;
                    removeFromMap(map,rem,key);
                }
            }
            groups+=flag?1:0;
        }
        System.out.println(groups);
    }

    public static void removeFromMap(HashMap<Integer, LinkedList<Integer>> map , int key , int val){
        var a = map.get(key);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == val){
                a.remove(i);
                break;
            }
        }
    }
}
