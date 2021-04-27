package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 4/17/2021
 */
public class Div2_791A {

    public static void main(String[] args)  throws IOException, IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        var ab = bf.readLine().split(" ");
        int a= Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        int ans=0;
        while (a<=b){
            a*=3;
            b*=2;
            ++ans;
        }
        System.out.println(ans);

    }


}
