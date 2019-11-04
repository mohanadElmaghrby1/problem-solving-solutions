/**
 * create by mohannad on 11/4/2019
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,cnt=0;
        for (int i = 0 ; i<nums.length ; ++i){
            if (nums[i]==1)
                ++cnt;
            else{
                max= Math.max(max , cnt);
                cnt=0;
            }
        }
        return Math.max(max , cnt);
    }
}
