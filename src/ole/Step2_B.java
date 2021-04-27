package ole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 3/10/2020
 */
public class Step2_B {


    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String na[] = bf.readLine().split(" ");
        int n = Integer.parseInt(na[0]);
        int a = Integer.parseInt(na[1]);
        --a;
        int sum=0;

        String ts[] = bf.readLine().split(" ");
        int arr[]= new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(ts[i]);
            sum+=arr[i];
        }

        int l=a-1 , r =a+1;
        while (l >= 0 && r < n){
            int add=(arr[l]+arr[r]);
            sum-=(add*2-add*add);
            --l;
            ++r;
        }
        System.out.println(sum);
    }
}
