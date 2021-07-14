

/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution74 {
// class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = matrix[0].length-1;

        int i = row;
        int j = 0;
        while(0<=i && j<=col){
                if(target==matrix[i][j])
                    return true;
                else if(target<matrix[i][j]){
                    i--;
                }else{
                    j++;
                }
        }

        return false;
    }
}
// @lc code=end

