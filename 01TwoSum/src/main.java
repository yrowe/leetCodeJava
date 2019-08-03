public class main {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] ans = s.twoSum(nums, target);
        for(int a: ans){
            System.out.println(a);
        }
    }
}
