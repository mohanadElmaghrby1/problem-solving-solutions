package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * create by mohannad on 11/5/2019
 */
public class Div2_1245A {

    public static void main(String[] args)throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(bf.readLine());
        while (t>0){
            String nm[] = bf.readLine().split(" ");
            int a = Integer.parseInt(nm[0]);
            int b = Integer.parseInt(nm[1]);

            System.out.println(gcd(a,b)==1?"finite":"Infinite");

            --t;
        }

    }

    public static int gcd(int a  ,int b){
        if (b==0)
            return a;
        return gcd(b , a%b);
    }
}
