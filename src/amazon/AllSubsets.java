package amazon;

/**
 * @author Mohannad Elmagharby
 * on 4/26/2021
 */
public class AllSubsets {

    public static void main(String[] args) {

        int arr[]={2,3};
        solve(arr,0,"");
    }

    static void solve(int arr[] , int indx , String curr){
        if (indx==arr.length)
            return;
        System.out.println(curr);

        //take
        solve(arr,indx+1 , curr+","+arr[indx]);

        //not take
        solve(arr,indx+1 , curr);


    }
}
