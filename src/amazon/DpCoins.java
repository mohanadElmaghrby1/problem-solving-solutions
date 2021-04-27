package amazon;

import java.util.Arrays;

/**
 * @author Mohannad Elmagharby
 * on 4/26/2021
 */
public class DpCoins {

    public static void main(String[] args) {
        int denations[] ={1,2,5,7,9,11};
        for (int[] ints : visited) {
            Arrays.fill(ints,-1);
        }
        int amount=300;
        System.out.println(solve(denations, amount, 0, ""));
        System.out.println("TOTAL:"+count);
    }

    static int count=0;
    static int visited[][]=new int [1002][400];
    static int solve(int denotions[] , int ammount ,int indx, String ans){
        if (ammount==0){
            ++count;
//            System.out.println(ans);
            return 1;
        }
        if (ammount<0)
            return 0;

        if (visited[indx][ammount]!=-1)
            return visited[indx][ammount];
        int c=0;


        for (int i = indx; i < denotions.length; i++) {
            c+=solve(denotions,ammount-denotions[i],i,ans+","+denotions[i]);
        }

        visited[indx][ammount]=c;

        return c;
    }
}
