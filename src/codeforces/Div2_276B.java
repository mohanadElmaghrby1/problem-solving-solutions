package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 4/22/2021
 */
public class Div2_276B {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        var s = bf.readLine().toCharArray();
        int counts[]=new int [26];
        for (int i = 0; i < s.length; i++) {
            ++counts[s[i]-'a'];
        }
        int odds=0,lats=0;
        for (int count : counts) {
            if (count%2==1){
                odds+=count;
                lats=count;
            }

        }
        odds-=lats;
        System.out.println(odds%2==1?"Second":"First");

    }
}
