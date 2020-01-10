/**
 * 类功能描述
 *
 * @Author rowe
 * @Date 2020/1/10 16:32
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int i, j=0;
        for(i=0; i < nums.length; ++i){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
