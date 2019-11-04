package codinGame;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(bf.readLine());
        int h = Integer.parseInt(bf.readLine());
        char[] texts=bf.readLine().toUpperCase().toString().toCharArray();
        StringBuilder ans= new StringBuilder("");
        for (int i = 0; i < h; i++) {
            String row = bf.readLine();
            for (char cr:texts) {
                int position = cr-65;
                String substring;
                if (position>=26 || position<0){
                    //not a letter from A-Z
                    substring= row.substring(26 * l, (26 * l + l));
                }else {
                    substring= row.substring(position * l, (position * l + l));
                }
                ans.append(substring);
            }
            ans.append("\n");
        }


        System.out.println(ans.toString());
    }
}
