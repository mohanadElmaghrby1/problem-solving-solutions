package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * create by mohannad on 11/6/2019
 */
public class Div2_599B {

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(bf.readLine());
        StringBuilder ans =new StringBuilder("");
        while (k > 0) {
            int n = Integer.parseInt(bf.readLine());
            String s=bf.readLine();
            String t=bf.readLine();

            int dif=0;
            HashSet<Character> sets=new HashSet<>();
            HashSet<Character> sett=new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) !=t.charAt(i)){
                    ++dif;
                    sets.add(s.charAt(i));
                    sett.add(t.charAt(i));
                }

            }

            ans.append(dif==2&&sets.size()==sett.size()&&sets.size()==1?"Yes"+"\n":"No"+"\n");

            --k;
        }

        System.out.println(ans);
    }
}
