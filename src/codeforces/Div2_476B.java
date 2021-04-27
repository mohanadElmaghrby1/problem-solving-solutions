package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mohannad Elmagharby
 * on 4/24/2021
 */
public class Div2_476B {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a=bf.readLine();
        String b=bf.readLine();
        int an=0,bn=0,qn=0;
        for (int i = 0 ; i < a.length() ; ++i){
            if (b.charAt(i)=='?')
                ++qn;
            else bn+=(b.charAt(i)=='+'?1:-1);
            an+=(a.charAt(i)=='+'?1:-1);
        }
        double pos = Math.pow(2,qn);
        int ans = count(0, qn , an-bn);
        System.out.println(String.format("%.12f",((float)ans/pos)));


    }


    public static int count(int currSum, int n , int target){
        if (n==0)
            return currSum==target?1:0;
        return count(currSum+1,n-1, target)+count(currSum-1,n-1, target);
    }
}
