package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Mohannad Elmagharby
 * on 3/5/2020
 */
public class Div2_505B_Imp {

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String nm[] = bf.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < m; ++i) {
            String abc[] = bf.readLine().split(" ");
            int a = Integer.parseInt(abc[0]);
            int b = Integer.parseInt(abc[1]);
            int c = Integer.parseInt(abc[2]);

            if (!map.containsKey(c)){
                map.put(c , new ArrayList<>());
            }

            map.get(c).add(a);
            map.get(c).add(b);


        }

    }
}
