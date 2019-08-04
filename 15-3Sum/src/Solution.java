import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //此方法只适用于3Sum， 更多的Sum无法解决
        //先排序， 再定一个数， 将3Sum转化为有序数组的2Sum定值
        List<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i < nums.length-2; ++i){
            int left = i+1, right = nums.length-1, target=nums[i];
            while(left<right){
                if(target+nums[left]+nums[right] == 0){
                    List<Integer> tmpList = new ArrayList<>();
                    tmpList.add(target);
                    tmpList.add(nums[left]);
                    tmpList.add(nums[right]);
                    if(!ansList.contains(tmpList)){
                        ansList.add(tmpList);
                    }
                    left++;  //此处left++不可少， 否则会死循环
                }
                else if(target+nums[left]+nums[right] < 0){
                    left++;
                }else{
                    right--;
                }
            }

        }
        return ansList;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        Solution s = new Solution();
        List<List<Integer>> ans = s.threeSum(nums);
        for(List<Integer> aa: ans){
            for(int a: aa){
                System.out.println(a);
            }
            System.out.println();
        }
    }
}
