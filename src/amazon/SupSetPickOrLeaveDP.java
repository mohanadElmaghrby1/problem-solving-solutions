package amazon;

/**
 * @author Mohannad Elmagharby
 * on 4/26/2021
 */
public class SupSetPickOrLeaveDP {

    public static void main(String[] args) {

        //count the number of longest increaseing subset
//        ex. {5, 2, 7, 3, 4, 6}
            // answer = {2, 3, 4, 6} = 4
        int arr[]={5, 2, 7, 3, 4, 6};
        System.out.println(solve(arr,0,0, ""));

        int arr2[]={5, 2, 7, 3, 4, 6,5,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(solve(arr2,0,0, ""));


    }
    static int visited[][]= new int [10000][100000];

    static int solve (int arr[] ,int i , int prev , String debug){
        if (i==arr.length){
//            System.out.println(debug);
            return 0;
        }
        if (visited[i][prev]!=0){
            return visited[i][prev];
        }


        //pick
        int ans=0;

        if (arr[i]>=prev){
            //pick
            ans=Math.max(ans,1+solve(arr,i+1 , arr[i],debug+","+arr[i]));
        }

        //leave
        ans=Math.max(ans,solve(arr,i+1 , prev, debug));
        visited[i][prev]=ans;

        return ans;

    }
}
