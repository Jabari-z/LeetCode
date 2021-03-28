import java.util.*;

/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */
class Solution56 {
// @lc code=start
// class Solution {
    public int[][] merge(int[][] intervals) {
        
        //遍历这个二维数组
        // 若后一个的start<=前一个的end
        // 则 修改前一个的end 为 当前的end并且删除当前[]
        if(intervals.length==1||intervals.length==0){
            return intervals;
        }
        // 排序 // 第一维度
       Arrays.sort(intervals,new Comparator<int[]>(){
           @Override
           public int compare(int[] o1,int[] o2){
               return o1[0]-o2[0];
           }
       });
       List<int[]> res = new ArrayList<>();
       res.add(intervals[0]);
       for (int i = 1; i < intervals.length; i++) {
           int[] cur = res.get(res.size()-1);
           if(intervals[i][0]>cur[1]){ // 【1 2】 【3 4】
               res.add(intervals[i]);
           }else{  //   【13】 【24】     【1 4】 【2 3】
               cur[1] = Math.max((intervals[i][1]), cur[1]);
           }
       }
       return res.toArray(new int[res.size()][]);
    }
}
// @lc code=end

