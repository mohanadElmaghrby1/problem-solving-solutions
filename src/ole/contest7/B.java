package ole.contest7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 3/20/2020
 */
public class B {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringBuilder ans = new StringBuilder("ROYGBIV");
        int m=n;
        n-=7;
        while(n>0){
            ans.append("GBIV");
            n-=4;
        }
        System.out.println(ans.substring(0,m));
    }
}
