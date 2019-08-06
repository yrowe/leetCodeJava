public class Solution {
    public boolean canJump(int[] nums) {
        //distance为当处在i下标的时候，前⾯所能够达到的所有⻓度的最⼤值
        int distance = 0;
        for(int i = 0;i < nums.length-1 && i <= distance; ++i){
            distance = Math.max(i+nums[i], distance);
        }

        return distance >= nums.length-1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,1,4};
        Solution s = new Solution();
        System.out.println(s.canJump(nums));

    }
}
