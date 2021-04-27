package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Mohannad Elmagharby
 * on 4/23/2021
 */
public class Div2_416C {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        var visitors = new int [n][3];
        for (int i = 0; i < n; i++) {
            var cpIndx= bf.readLine().split(" ");
            visitors[i][0]= Integer.parseInt(cpIndx[0]);
            visitors[i][1]= Integer.parseInt(cpIndx[1]);
            visitors[i][2]= i+1;
        }

        int k = Integer.parseInt(bf.readLine());
        var rstr= bf.readLine().split(" ");
        var rs= new int [k][2];
        for (int i = 0; i < k; i++) {
            rs[i] [0]= Integer.parseInt(rstr[i]);
            rs[i] [1]= i+1;
        }

        Arrays.sort(rs, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(visitors, (a1, a2) -> a2[1]-a1[1]);
        StringBuilder ans = new StringBuilder();
        int sum=0 , count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (visitors[i][0] <= rs[j][0]){
                    sum+=visitors[i][1];
                    ++count;
                    ans.append(visitors[i][2]+" "+rs[j][1]+"\n");
                    rs[j][0] = -1;
                    break;
                }
            }
        }
        System.out.println(count+" "+sum);
        System.out.println(ans.toString());
    }
}
