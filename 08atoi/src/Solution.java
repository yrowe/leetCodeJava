import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * 类功能描述
 *
 * @Author rowe
 * @Date 2020/1/8 16:09
 */
public class Solution {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0){
            return 0;
        }

        int i = 0;
        while(i < str.length() && str.charAt(i) == ' '){
            i++;
        }
        if(i == str.length()){
            return 0;
        }

        long res = 0;
        int flag = 1;
        if(str.charAt(i) == '-'){
            flag = -1;
            ++i;
        }else if(str.charAt(i) == '+'){
            ++i;
        }

        while(i < str.length()){
            char ci = str.charAt(i);
            if(ci < '0' || ci > '9'){
                break;
            }
            res = res*10 + ci - '0';
            if(flag == 1 && res > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(flag == -1 && -res < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }

        if(flag == -1){
            return (int)(-1*res);
        }else{
            return (int)res;
        }

    }

    public static void main(String[] args) {
        new Solution().myAtoi("42");
    }
}
