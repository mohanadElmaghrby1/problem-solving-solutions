import java.util.Arrays;

/**
 * create by mohannad on 11/4/2019
 */
public class RotateArray {
    public static void main(String[] args) {
        int nums[]= {1,2,3};

        new RotateArray().rotate(nums , 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

    }


    public  void rotate(int[] nums, int k) {
        int narr[]=new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            narr[(i+k)%nums.length]=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=narr[i];
        }
    }
}
