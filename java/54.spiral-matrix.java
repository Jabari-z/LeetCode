import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length==0) return res;
        int l = 0;
        int r = matrix[0].length-1;
        int b = matrix.length-1;
        int t = 0;

        while(true){
            // left to right
            for(int i = l; i<=r;i++) res.add(matrix[t][i]);

            // top to bottom
            if(++t>b) break;
            for (int i = t; i <= b; i++) res.add(matrix[i][r]);

            // right to left
            if(--r<l) break;
            for(int i = r;i >= l;i--) res.add(matrix[b][i]);

            // bottom to top
            if(--b<t) break;
            for(int i = b;i>=t; i--) res.add(matrix[i][l]);

            if(++l>r) break;

        }
        return res;
    }
}
// @lc code=end

