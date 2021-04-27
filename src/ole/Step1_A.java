package ole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 3/9/2020
 */
public class Step1_A {

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String nh[] = bf.readLine().split(" ");
        int n = Integer.parseInt(nh[0]);
        int h = Integer.parseInt(nh[1]);
        int ans=0;
        String ais[] = bf.readLine().split(" ");
        for (int i = 0; i < n; i++)
            ans+=Integer.parseInt(ais[i])>h? 2 : 1;

        System.out.println(ans);


    }
}
