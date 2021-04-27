package compiler.contest0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Mohannad Elmagharby
 * on 10/15/2020
 */
public class D {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int  n = Integer.parseInt(bf.readLine());
        String []worms =  bf.readLine().split(" ");
        int m= Integer.parseInt(bf.readLine());
        String[] s = bf.readLine().split(" ");
        ArrayList<NumIndex> jossy= new ArrayList<>(n);
        for (int i = 0; i < m; i++) {
            jossy.add(new NumIndex(Integer.parseInt(s[i]),i));
        }
        Collections.sort(jossy);
        long sum= Long.parseLong(worms[0]) ;
        int ans[]=new int[m];
        int ni=0;
        for (int i = 0; i < m; i++) {
           while ( jossy.get(i).num > sum ){
               ++ni;
               sum+=Integer.parseInt(worms[ni]);
           }
           ans[jossy.get(i).index]=(ni+1);
        }
        StringBuilder ansr = new StringBuilder();
        for (int i = 0; i < ans.length; i++)
            ansr.append(ans[i]+"\n");
        System.out.println(ansr);
    }

    static class NumIndex implements Comparable<NumIndex>{
        int num;
        int index;

        public NumIndex(int num, int index) {
            this.num = num;
            this.index = index;
        }

        @Override
        public int compareTo(NumIndex o) {
            return Integer.compare(this.num,o.num);
        }
    }
}
