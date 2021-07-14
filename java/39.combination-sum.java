import java.util.*;

/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 *  Input: candidates = [2,3,6,7], target = 7
    Output: [[2,2,3],[7]]
    Explanation:
    2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
    7 is a candidate, and 7 = 7.
    These are the only two combinations.

    递归 回溯方法

 */

// @lc code=start
class Solution39 {
//class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res  = new ArrayList<>();
        List<Integer> tem = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0,target,tem,res,candidates);
        return res;
    }
    public void dfs(int index,int target,List<Integer> tem,List<List<Integer>> res,int []candidates){
        if(target==0){// 递归出口
            res.add(new ArrayList<>(tem)); // 一个答案已经找到了
        }
        for (int i = index; i < candidates.length; i++){ // 对于每一个候选数字
            if(target<candidates[i]){  // 有序数组 当前数字大于target没必要走了
                break;
            }
            tem.add(candidates[i]);  //添加 一个数字 
            dfs(i,target-candidates[i],tem,res,candidates);// 进行递归
            tem.remove(tem.size()-1); // 删除 最后一个 // 回溯
        }
    }
}
// @lc code=end

