package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Div2_463B {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String inputs[] = bf.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 0; i < n; ++i)
            list.add(Integer.parseInt(inputs[i]));

        int dollars=0,ans=0;

        for (int i = 0; i < n; i++) {
            dollars+=(list.get(i)-list.get(i+1));
            ans=Math.min(ans,dollars);
        }

        System.out.println(dollars>=0?0:ans*-1);

    }
}
