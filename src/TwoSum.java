/**
 * created by mohannad
 */
public class TwoSum {

    public static void main(String[] args) {
        int nums[]={ 11,2, 7, 15};
        System.out.println(twoSum(nums , 9)[0]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int sum=nums[0];
        int ans[] = new int[2];
        boolean cont=true;
        for (int i = 0 ; i <nums.length&&cont ; ++i){
            for (int j=i+1 ; j<nums.length&&cont ; ++j){
                if (nums[i]+nums[j] == target){
                    ans[0]=i;
                    ans[1]=j;
                    cont=false;
                }
            }
        }


        return ans;
    }
}
