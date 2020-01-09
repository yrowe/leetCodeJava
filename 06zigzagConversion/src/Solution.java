import java.util.ArrayList;
import java.util.List;

/**
 * 类功能描述
 *
 * @Author rowe
 * @Date 2020/1/9 10:56
 */
public class Solution {

    public String convert(String s, int numRows){
        if(numRows == 1) return s;
        List<StringBuilder> rows = new ArrayList<>();
        for(int i = 0;i < Math.min(s.length(), numRows);i++){
            rows.add(new StringBuilder());
        }

        int rowsNum = 0;
        boolean flg = false;

        for(char c: s.toCharArray()){
            rows.get(rowsNum).append(c);
            if(rowsNum == 0 || rowsNum == numRows-1) flg = !flg;
            rowsNum += flg?1:-1;
        }

        String ans = "";
        for(StringBuilder aa: rows){
            ans += aa.toString();
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().convert("leetcodeishiring",3));
    }
}
