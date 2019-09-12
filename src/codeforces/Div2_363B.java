package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Div2_363B {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String nm[] = bf.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int k = Integer.parseInt(nm[1]);
        String inputs[] = bf.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        int indx=0,ans=Integer.MAX_VALUE , sum=0;

        for (int i = 0; i < n; ++i) {
            list.add(Integer.parseInt(inputs[i]));
            if(i<k)
                sum+=list.get(i);
        }

       indx=0;
        ans=sum;

        for (int i = k; i < list.size(); i++) {
           sum+=list.get(i);
           sum-=list.get(i-k);
           if(sum<ans){
               ans=sum;
               indx=(i-(k-1));
           }

        }

        System.out.println((indx+1));

    }
}
