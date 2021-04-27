package amazon;

/**
 * @author Mohannad Elmagharby
 * on 4/26/2021
 */
public class FindLowHighIndex {


    public static void main(String[] args) {
        int arr[]= {1,2,3,3,4,4,4,5};
//        System.out.println(binarySearch(arr,0,arr.length-1, 3, false));
//        System.out.println(binarySearch(arr,0,arr.length-1, 30,false));
        System.out.println(binarySearch(arr,0,arr.length-1, 4,true));
        System.out.println(binarySearch(arr,0,arr.length-1, 4,false));

    }


    static int binarySearch(int arr[], int l , int r , int x , boolean max){
        int ans=-1;
        while (r>=l){
            int mid = l + (r-l)/2;
            if (arr[mid]==x){
                ans = ans==-1?mid:max?Math.max(ans,mid):Math.min(ans,mid);
                if (max){
                    l = mid+1;
                }else {
                    r= mid-1;
                }
            }
            else if (arr[mid]<x){
                l = mid+1;
            }else {
                r = mid-1;
            }

        }
        return ans;
    }
}
