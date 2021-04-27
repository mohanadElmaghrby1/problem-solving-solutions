package ole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 3/10/2020
 */
public class Step2_A {

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String l = bf.readLine();
        int cntD=0 , cntA=0;
        for (int i = 0; i < n; i++) {
            if (l.charAt(i)=='A')
                ++cntA;
            else
                ++cntD;
        }

        System.out.println(cntA>cntD?"Anton":cntD>cntA?"Danik":"Friendship");
    }
}
