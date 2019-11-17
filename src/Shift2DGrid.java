import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * created by mohannad  on 17/11/19
 */
public class Shift2DGrid {

    public static void main(String[] args) {

        int grid [][]={{1,2,3},{4,5,6},{7,8,9}};
        shiftGrid(grid , 1);
        System.out.println();

        int grid2[][]={{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};
        shiftGrid(grid2,4);
        System.out.println();
        int grid3[][]={{1}};
        shiftGrid(grid3 , 1);

        System.out.println();
        int grid4[][]={{1,2}};
        shiftGrid(grid4 , 1);

        System.out.println();
        int grid5[][]={{1},{2}};
        shiftGrid(grid5 , 1);
    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int n = grid.length;
        int m = grid[0].length;

        while (k > 0) {
            int temp[]=new int[n];
            for (int i = m-1; i >=0; i--) {
                for (int j = n-1; j >=0; j--) {
                    if (i==(m-1)){
                        temp[j]=grid[j][i];
                    }

                    if(i>0)
                    grid[j][i]=grid[j][i-1];
                }
            }
            --k;

            for (int i = temp.length-1; i >0; i--) {
                grid[i][0]=temp[i-1];
            }
            grid[0][0]=temp[temp.length-1];
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>()) ;
            for (int j = 0; j < m; j++) {
                ans.get(i).add(grid[i][j]);
            }
        }

        print(grid);
        return ans;
    }


    static void print(int grid [][]){
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void print(int grid []){
        for (int i = 0; i < grid.length; i++) {
            System.out.println(grid[i]);
        }
        }
    }

