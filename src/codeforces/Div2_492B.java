package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Div2_492B {

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String nm[] = bf.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int l = Integer.parseInt(nm[1]);
        String inputs[] = bf.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            list.add(Integer.parseInt(inputs[i]));

        Collections.sort(list);
        double ans=0;
        ans=Math.max(ans,list.get(0));

        for (int i = 1; i < list.size(); i++) {
            ans=Math.max(ans,(list.get(i)-list.get(i-1))/2.0);
        }

//        System.out.println(ans);
        System.out.format("%.10f", ans);


    }
}
