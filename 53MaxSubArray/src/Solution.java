public class Solution {
    public int maxSubArray(int[] nums) {
        //动态规划， acc数组表示到当前为止的前n项所能组成的最大连续和
        int[] acc = new int[nums.length];
        acc[0] = nums[0];
        for(int i = 1;i < nums.length; ++i){
            if(nums[i] + acc[i-1] < nums[i])
                acc[i] = nums[i];
            else
                acc[i] = nums[i] + acc[i-1];
        }
        int max = acc[0];
        for(int i = 1;i < acc.length; ++i){
            if(max < acc[i])
                max = acc[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(s.maxSubArray(nums));
    }
}
