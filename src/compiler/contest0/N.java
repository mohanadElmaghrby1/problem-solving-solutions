package compiler.contest0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 10/15/2020
 */
public class N {

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int  indxBA , indxAB;
        String ans = "NO";
        indxBA = s.indexOf("BA");
        if (indxBA >= 0 && s.indexOf("AB", indxBA + 2) >= 0)
            ans = "YES";
        indxAB = s.indexOf("AB");
        if (indxAB >= 0 && s.indexOf("BA", indxAB + 2) >= 0)
            ans = "YES";
        System.out.println(ans);

    }
}
