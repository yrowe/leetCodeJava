public class Solution {
    //动态规划， 左边界和上边界的每个点都只有唯一路径，而对于其他的点， 能到达的方法为其正上方和左边的点的路径数之和
    public int uniquePaths(int m, int n){
        int[][] path = new int[m][n];
        for(int i =0;i < m; ++i){
            for(int j = 0;j < n; ++j){
                if(i == 0 || j == 0) path[i][j] = 1;
                else path[i][j] = path[i-1][j] + path[i][j-1];
            }
        }
        return path[m-1][n-1];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.uniquePaths(3,2));
    }
}
