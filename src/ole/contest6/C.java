package ole.contest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Mohannad Elmagharby
 * on 3/18/2020
 */
public class C {

    public static void main(String[] args)  throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String nh[] = bf.readLine().split(" ");
        int n = Integer.parseInt(nh[0]);
        int l = Integer.parseInt(nh[1]);

        String ls[] = bf.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
            list.add(Integer.parseInt(ls[i]));

        Collections.sort(list);
        double ans = 2*Math.max(list.get(0)-0 , l-list.get(n-1));
        for (int i = 1; i < n; i++)
            ans = Math.max(ans ,list.get(i)-list.get(i-1));
        System.out.format("%.10f", ans/2,0);
    }
}
