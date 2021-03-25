/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */




// @lc code=start
// class Solution {
class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        int start = 0;
        int end = nums.length-1;
        while (start<=end) {
            if(nums[start]==target&&nums[end]==target){
                return new int[]{start,end};
            }
            int mid = start + (end-start)/2; 
            if(nums[mid]==target){// mid 位置为要找的数字  
                int tmpstart = mid;// 向前寻找
                while(tmpstart>=0 && nums[tmpstart]==target) {
                    tmpstart--;
                }
                start = tmpstart;
                int tmpend = mid;//向后寻找
                while(tmpend<=nums.length-1 &&nums[tmpend]==target) {
                    tmpend++;
                }
                end = tmpend;
                //返回结果
                return new int[]{start+1,end-1};
            }
            else if(target>nums[mid]){
                start = mid+1;
                // return searchRangeHelper(nums,target,mid+1,end);
            }else{
                end = mid-1;
                // return searchRangeHelper(nums,target,0,mid);
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,7,7,8,8,10};
        System.out.println(new Solution34().searchRange(nums, 8)[0]);
    }
}
// @lc code=end

