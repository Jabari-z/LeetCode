import java.util.*;

/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
 class Solution40 {
//class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> oneres = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0,target,candidates,oneres,res);


        return res;
    }
    public void dfs(int start,int target,int[] candidates,List<Integer> oneres,List<List<Integer>> res){
        if(target==0){
            if(!res.contains(new ArrayList<>(oneres))){
                res.add(new ArrayList<>(oneres));
            }

        }

        for (int i = start; i < candidates.length; i++) {
            if (target<candidates[i]) {
                break;
            }
            oneres.add(candidates[i]);
            // 进行下一个数的遍历 
            dfs(i+1,target-candidates[i],candidates,oneres,res);
            oneres.remove(oneres.size()-1);
        }
    }
}
// @lc code=end

