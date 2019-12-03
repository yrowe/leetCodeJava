
public class Solution {

    public int hammingDistance(int x, int y) {
        int z = x^y;
        int c = 0;
        while(z != 0){
            z = z&(z-1);
            c++;
        }
        return c;
    }
}
