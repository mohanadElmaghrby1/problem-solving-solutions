package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Div2_680B {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String nm[] = bf.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int a = Integer.parseInt(nm[1]);
        String inputs[] = bf.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            list.add(Integer.parseInt(inputs[i]));


        int ans=0;
        --a;
        for (int i = 0; i < list.size(); i++) {
            int l=a-i , r=a+i;
            if (l>=0 && r<list.size() &&(list.get(l)+list.get(r))==2){
                ans+=r==l?1:2;
            }else if(l<0&&r<list.size() &&list.get(r)==1){
                ++ans;
            }else if(r>=n &&l>=0 && list.get(l)==1)
                ++ans;
        }
        System.out.println(ans);

    }
}

