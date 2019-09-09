public class ContainerWithMostWater {

    public static void main(String[] args) {
        int heights[]={Integer.MAX_VALUE,8,6,2,5,4,8,Integer.MAX_VALUE,8,6,2,5,4,8,Integer.MAX_VALUE,8,6,2,5,4,8,Integer.MAX_VALUE,8,6,2,5,4,8,Integer.MAX_VALUE,8,6,2,5,4,8,Integer.MAX_VALUE};
        System.out.println(maxArea(heights));
    }

    public static int maxArea(int[] height) {

        int ans=0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                int con= Math.min(height[i],height[j])*(j-i);
                ans=Math.max(ans,con);
            }
        }

        return ans;

    }
}
