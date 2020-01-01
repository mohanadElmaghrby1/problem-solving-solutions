public class NumberofIslands {

    public static void main(String[] args) {

//        char grid[][]={{'1','1','1','1','0'} ,{'1','1','0','1','0'} ,{'1','1','0','0','0'} , {'0','0','0','0','0'}};//1
        char grid[][]={{'1','1','1','1','0'} ,{'1','1','0','1','0'} ,{'1','1','0','0','1'} , {'0','0','0','0','0'}}; //2
//        char grid[][]={{'1','0'},{'1','0'}};

        System.out.println(numIslands(grid));


    }

    public static int numIslands(char[][] grid) {
        if (grid.length==0 || grid[0].length==0)
            return 0;
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        int ans=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!visited[i][j] && grid[i][j]=='1'){
                    ++ans;
                    dfs(i,j,grid,visited);
                }
            }
        }
        return ans;
    }
    public static void dfs(int i , int j , char grid[][] , boolean visited[][]){
        if (!isValid(i,j,grid,visited)){
            return;
        }
        visited[i][j]=true;
        dfs(i,j+1,grid,visited); //left
        dfs(i,j-1,grid,visited);//right
        dfs(i-1,j,grid,visited);//up
        dfs(i+1,j,grid,visited);//down

    }
    public  static boolean isValid(int i , int j , char grid[][] , boolean visited[][]){
        return  !(i<0 || i >=grid.length || j<0 || j >= grid[0].length || visited[i][j] || grid[i][j]=='0');
    }
}
