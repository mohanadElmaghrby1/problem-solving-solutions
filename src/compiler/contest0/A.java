package compiler.contest0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 10/14/2020
 */
public class A {


    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long x = Long.parseLong(bf.readLine());
        int ans=0;
        while (x>0){
            ans+=x%2;
            x/=2;
        }
        System.out.println(ans);
    }
}
