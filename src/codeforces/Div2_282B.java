package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/**
 * @author Mohannad Elmagharby
 * on 4/21/2021
 */
public class Div2_282B {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        StringBuilder ans=new StringBuilder();
        int sumA=0;
        int sumB=0;

        for(int i=0;i<n;i++){
            String[] nm = bf.readLine().split(" ");
            int a=Integer.parseInt(nm[0]);
            int b=Integer.parseInt(nm[1]);

            if((sumA+a)-sumB>500){
                sumB+=b;
                ans.append("G");
            }else{
                sumA+=a;
                ans.append("A");
            }
        }
        if(Math.abs(sumB-sumA)>500) {
            System.out.println(-1);
        }else {
            System.out.println(ans);
        }
        System.out.println(sumA+","+sumB);

    }
}
