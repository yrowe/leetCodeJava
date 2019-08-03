public class Solution {
    //暴力遍历算法， 时间复杂度O(n^2), 空间复杂度O(1)
    public int[] twoSum(int[] nums, int target) {
        int ansI=-1, ansJ=-1;
        boolean flg = false;
        for(int i=0;i < nums.length; ++i){
            for(int j = i+1;j < nums.length; ++j){
                if(nums[i] + nums[j] == target){
                    ansI = i;
                    ansJ = j;
                    flg = true;
                    break;
                }
            }
            if(flg) break;
        }
        return new int[]{ansI, ansJ};
    }
}
