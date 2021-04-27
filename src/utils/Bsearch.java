package utils;

/**
 * @author Mohannad Elmagharby
 * on 3/19/2020
 */
public class Bsearch {

    public static void main(String[] args) {

        int arr[]={1,2,3};
        System.out.println(isIn(0 , arr));
        System.out.println(isIn(12 , arr));
        System.out.println(isIn(1 , arr));
        System.out.println(isIn(2 , arr));
        System.out.println(isIn(3 , arr));
    }

    static boolean isIn(int key , int sortedArr[]){
        int l=0,r=sortedArr.length-1;

        while (l<=r){
            int mid = l + (r - l) / 2;
            if (sortedArr[mid]==key)
                return true;
            else if(sortedArr[mid]<key){
                l=mid+1;
            }
            else
                r=mid-1;
        }

        return false;
    }
}
