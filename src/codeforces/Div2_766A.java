package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 4/17/2021
 */
public class Div2_766A {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        var a = bf.readLine();
        var b = bf.readLine();
        if (a.equals(b))
            System.out.println(-1);
        else
            System.out.println(Math.max(a.length(),b.length()));

    }
}
