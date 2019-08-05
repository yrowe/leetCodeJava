public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int mid, l = 0, r = nums.length-1;
        //此处条件是!=而不是>, <
        while(l <= r && target != nums[l] && target != nums[r]){
            mid = (r-l)/2+l;
            if(target > nums[mid]){
                l = mid+1;
            }else if(target < nums[mid]){
                r = mid-1;
            }else{
                //nums[mid] == target， 说明此时l,r段中包含target
                break;
            }
        }

        if(l > r){
            return new int[]{-1, -1};
        }
        while(nums[l] != target){
            l++;
        }
        while(nums[r] != target){
            r--;
        }
        return new int[]{l, r};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 6;
        int[] aa = s.searchRange(nums, target);
        for(int a : aa){
            System.out.println(a);
        }
    }
}


