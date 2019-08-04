class Solution {
    public int maxArea(int[] height) {
        //双指针法， 左右两边同时逼近， 原则是短边移动
        int maxArea = -1;
        int area;
        int l = 0, r = height.length-1;
        while(l<r){
            area = Math.min(height[l], height[r])*(r-l);
            maxArea = Math.max(maxArea, area);
            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(s.maxArea(nums));
    }
}