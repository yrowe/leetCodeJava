import java.util.HashMap;

public class Solution2 {
    //空间复杂度O(n), 时间复杂度O(n)
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length; ++i){
            int remain = target-nums[i];
            if(map.containsKey(remain)){
                return new int[]{map.get(remain), i};   //先出现的在前面
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }
}

