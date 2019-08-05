import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    private List<List<Integer>> ansList = new ArrayList<>();
    private LinkedList<Integer> tmpList = new LinkedList<>();
    private int[] aa;
    private int globalT;

    private void DFS(int index, int sum){
        if(index == aa.length) return;
        if(sum == globalT) ansList.add(new ArrayList<>(tmpList));
        if(sum > globalT) return;
        for(int i = index;i < aa.length; ++i){
            tmpList.add(aa[i]);
            DFS(i, sum+aa[i]);
            tmpList.removeLast();
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        aa = candidates;
        globalT = target;
        DFS(0, 0);
        return ansList;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{2,3,6,7};

    }
}
