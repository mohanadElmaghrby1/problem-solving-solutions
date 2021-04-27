package leetcode;

/**
 * @author Mohannad Elmagharby
 * on 1/25/2021
 */
public class ArrayFormationThroughConcatenation {

    public static void main(String[] args) {
//        int arr []= {85}, pieces[][] = {{85}};
//        System.out.println(canFormArray(arr,pieces));
//        int arr2[]={15,88}  ,pice2 [][]={{88},{15}} ;
//        System.out.println(canFormArray( arr2, pice2));
//
//        int arr3[]={49,18,16}, pieces3[][]= {{16,18,49}};
//        System.out.println(canFormArray(arr3,pieces3));

        int arr4[] = {91,4,64,78}, pieces4[][] = {{78},{4,64},{91}};
        System.out.println(canFormArray(arr4,pieces4));




    }

//    int arr4[] = {91,4,64,78}, pieces4[][] = {{78},{4,64},{91}};

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        boolean ans = true;
        for (int i = 0; i < arr.length &&ans; i++) {
            boolean incresedI= false;
            for (int j = 0; j < pieces.length && ans && i<arr.length; j++) {
                for (int k = 0; k < pieces[j].length && ans && i<arr.length; k++) {
                    if ( arr[i] == pieces[j][k]){
                        incresedI = true;
                        ++i;
                    }else if (incresedI){
                        ans = false;
                    }else{
                        break;
                    }
                }
            }
            if (!incresedI){
                ans=false;
            }else
                --i;
        }
        
        
        return ans;
    }
}
