public class Solution2 {
/*
* 分治（参考discuss思路如下）  O(nlogn)

Step1. Select the middle element of the array.
So the maximum subarray may contain that middle element or not.

Step 2.1 If the maximum subarray does not contain the middle element, then we can apply the same algorithm to the the subarray to the left of the middle element and the subarray to the right of the middle element.

Step 2.2 If the maximum subarray does contain the middle element, then the result will be simply the maximum suffix subarray of the left subarray plus the maximum prefix subarray of the right subarray

Step 3 return the maximum of those three answer.

Here is a sample code for divide and conquer solution. Please try to understand the algorithm before look at the code
* */
    public int maxSubArray(int[] nums) {
        if ( nums.length == 0 ) return 0;
        return getMaxSubArray( nums , 0 , nums.length-1 );
    }
        public int getMaxSubArray( int[] nums , int low , int high ){
            if ( low == high ) return nums[low];
            int mid = ( low + high ) / 2;
            int left_fix = nums[mid] , right_fix = 0;
            int left_sum = nums[mid] , right_sum = 0;//左边的累计和必选mid，右边不必选mid
            for ( int i=1 ; i<=mid-low ; i++ ){//左右同时开工；左边可能会多一个元素
                left_fix = Math.max(left_fix, left_sum = left_sum+nums[mid-i]);
                right_fix = Math.max(right_fix, right_sum = right_sum+nums[mid+i]);
            }
            right_fix = ((high - low ) & 0x1) == 1 ? Math.max(right_fix, right_sum = right_sum+nums[high]) : right_fix;
            int leftmax = getMaxSubArray(nums , low, mid );
            int rightmax = getMaxSubArray(nums , mid+1, high);
            return Math.max( Math.max(leftmax , rightmax ), left_fix + right_fix );
        }
}
