package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 4/23/2021
 */
public class Div2_540C {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String nm[] = bf.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        var arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            arr[i] = bf.readLine().toCharArray();
        }

        String currRC[] = bf.readLine().split(" ");
        int currR = Integer.parseInt(currRC[0]);
        int currC = Integer.parseInt(currRC[1]);
        arr[currR-1][currC-1] = '.';
        String rc[] = bf.readLine().split(" ");
        int r = Integer.parseInt(rc[0]);
        int c = Integer.parseInt(rc[1]);


        System.out.println(solve(arr,currR-1,currC-1,r-1,c-1)?"YES":"NO");

    }

    public static boolean solve(char arr[][], int currR, int currC, int r, int c) {
        //check if reach
        if (currR == r && currC == c && arr[r][c] =='X')
            return true;
        //validate
        if ((currR < 0 || currR >= arr.length || currC < 0 || currC >= arr[0].length || (arr[currR][currC] == 'X'))) {
            return false;
        }
//        System.out.println(currR+","+currC);
        //check if reach
//        if (currR == r && currC == c && arr[r][c] =='X')
//            return true;
        arr[currR][currC] = 'X';
        //all moves

        //left r , -c
        return solve(arr, currR, currC - 1, r, c) ||
                //right r, +c
                solve(arr, currR, currC + 1, r, c) ||
                //up -r, c
                solve(arr, currR - 1, currC, r, c) ||
                //down +r, c
                solve(arr, currR + 1, currC, r, c);


    }
}
