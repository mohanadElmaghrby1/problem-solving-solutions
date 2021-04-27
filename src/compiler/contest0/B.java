package compiler.contest0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * @author Mohannad Elmagharby
 * on 10/14/2020
 */
public class B {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String nm[] = bf.readLine().split(" ");
        long n = Long.parseLong(nm[0]) ,x = Long.parseLong(nm[1]) , ans=0;
        for (int i = 1; i <=n ; i++)
            if(x%i==0 && (i*n >= x ))
                ++ans;
        System.out.println(ans);

    }
}
