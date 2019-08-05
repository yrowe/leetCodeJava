public class Solution {
    ////原地旋转90度。
    ////1.沿主对⻆线所有元素交换(转置)
    ////2.沿着垂直中轴线⽅向所有元素交换
    private int len;

    public void rotate(int[][] matrix) {
        len = matrix.length;
        for(int i=0;i < len; ++i){
            for(int j = 0;j < i; ++j){
                transpose(matrix, i, j);
            }
        }

        for(int i = 0;i < len; ++i){
            for(int j = 0;j < len/2; ++j){
                swap(matrix, i, j);
            }
        }

    }

    private void transpose(int[][] matrix, int i, int j){
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = tmp;
    }

    private void swap(int[][] matrix, int i, int j){
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[i][len-j-1];
        matrix[i][len-j-1] = tmp;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] a = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        s.rotate(a);

        int ll = a.length;
        for(int i=0;i < ll; ++i){
            for(int j = 0;j < ll; ++j){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
