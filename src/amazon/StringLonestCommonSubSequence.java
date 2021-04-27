package amazon;

import java.util.Arrays;

/**
 * @author Mohannad Elmagharby
 * on 4/26/2021
 */
public class StringLonestCommonSubSequence {

    public static void main(String[] args) {
        //abpoicde
        //agbwecde
        //output abcde
        for (int[] ints : visited) {
            Arrays.fill(ints,-1);
        }
        System.out.println(solve("agbwecdeagbwecdeagbwecdeagbwecdeagbwecdeagbwecdeagbwecdeagbwecdeagbwecde","agbwecdeagbwecdeagbwecdeagbwecdeagbwecdeagbwecdeagbwecdeagbwecdeagbwecde",0,0));

    }

    //i j
    static int visited[][]=new int [1000][1000];
    static int solve(String s1, String s2, int i , int j){
        if (i>=s1.length() || j >=s2.length())
            return 0;

        if ( visited[i][j]!=-1)
            return  visited[i][j];
        //equal char
        if (s1.charAt(i) ==s2.charAt(j))
            return 1+solve(s1,s2, i+1, j+1);

        int ans= Math.max(solve(s1,s2, i+1, j), solve(s1,s2, i, j+1));
        visited[i][j]=ans;
        return ans;
    }
}
