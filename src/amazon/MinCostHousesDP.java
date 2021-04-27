package amazon;

import java.util.HashMap;

/**
 * @author Mohannad Elmagharby
 * on 4/26/2021
 */
public class MinCostHousesDP {

    public static void main(String[] args) {

        int arr[][] = {
                {1, 3, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 1, 3},
                {3, 3, 2}};
        visited=new int[arr.length+1][4];
        System.out.println(solve(arr,-1,0,0));
        System.out.println(solve2(arr,3,0));
    }

    static HashMap<String,Integer> map = new HashMap<>();
    public static int solve(int arr[][], int lastIndx, int i, int sum) {
        if (i == arr.length)
            return sum;
        if (map.containsKey(i+","+sum))
            return map.get(i+","+sum);

        //0,1,2
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < 3; j++) {
            if (j != lastIndx) {
                min = Math.min(min, solve(arr, j, i + 1, sum + arr[i][j]));
            }
        }

        map.put(i+","+sum,min);
        return min;
    }

    static int visited[][];
    public static int solve2(int arr[][], int lastIndx, int currIndx) {
        if (currIndx == arr.length)
            return 0;

        if (visited[currIndx][lastIndx] > 0){
            return visited[currIndx][lastIndx];
        }
        //0,1,2
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < 3; j++) {
            if (j != lastIndx) {
                min = Math.min(min, arr[currIndx][j]+solve2(arr, j, currIndx + 1));
            }
        }
        visited[currIndx][lastIndx]=min;
        return min;
    }
}
