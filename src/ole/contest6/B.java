package ole.contest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 3/18/2020
 */
public class B {

    public static void main(String[] args)throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String nh[] = bf.readLine().split(" ");
        int arr[]=new int[n+1];
        for (int i = 0; i < n; i++)
            arr[Integer.parseInt(nh[i])]=i;
        int m = Integer.parseInt(bf.readLine());
        String ms[] = bf.readLine().split(" ");
        long vas=0l,pet=0l;
        for (int i = 0; i < m; i++) {
            int msi = Integer.parseInt(ms[i]);
            vas+=arr[msi]+1l;
            pet+=(n-arr[msi]);
        }
        System.out.println(vas+" "+pet);
    }
}
