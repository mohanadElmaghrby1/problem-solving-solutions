import java.util.ArrayList;

public class RemoveElement {

    public static void main(String[] args) {
        int nums[] = {};
        int val = 3;
        // nums is passed in by reference. (i.e., without making a copy)
        int len = removeElement(nums, val);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }


    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> l = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                ++ans;
                l.add(nums[i]);
            }
        }
        for (int i = 0; i < ans; i++) {
            nums[i] = l.get(i);
        }
        return ans;
    }


    //    public static void shift(int nums[] , int val){
//        for (int i = 0; i <nums.length ; i++) {
//            for (int j = i; j < nums.length-1; j++) {
//                if(nums[j]==val)
//            }
//        }
//    }
    public int removeElementBest(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
