package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * create by mohannad on 11/6/2019
 */
public class Div2_599A {

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringBuilder ans =new StringBuilder("");
        while (t > 0) {
            int n = Integer.parseInt(bf.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            String inputs[] = bf.readLine().split(" ");

            for (int i = 0; i < n; ++i)
                list.add(Integer.parseInt(inputs[i]));
            Collections.sort(list);

            int max=0;
            for (int i = 0; i < n; i++) {
                int s = Math.min(n-i , list.get(i));
                max=Math.max(max , s);
            }
            ans.append(max+"\n");
            --t;
        }
        System.out.println(ans.toString());

    }
}
