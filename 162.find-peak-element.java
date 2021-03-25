/*
 * @lc app=leetcode id=162 lang=java
 *
 * [162] Find Peak Element
 */

// @lc code=start
// class Solution {
class Solution162 {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        for (int i = 0; i < nums.length; i++) {
            int n = isPeek(nums, i);
            if(n>=0) return n;
        }
        return 0;
        // return findPeakElementHelper(nums,0,nums.length-1);
    }
    public int findPeakElementHelper(int[] nums,int start,int end){
        if(start==end) return start;
        int mid = start+(end-start)/2;
        if(nums[mid]>nums[mid+1])
            return findPeakElementHelper(nums,0,mid);
        return findPeakElementHelper(nums,mid+1,end);

    }
    public int isPeek(int[] nums,int index){
        int preinedx = index-1;
        int pre = 0;
        if(preinedx<0)
            pre = Integer.MIN_VALUE;
        else{
            pre = nums[preinedx];
        }
        int postinedx = index+1;
        int post = 0;
        if(postinedx>nums.length-1)
            post = Integer.MIN_VALUE;
        else{
            post = nums[postinedx];
        }

        if(nums[index]>pre && nums[index]>post)
            return index; 
        return -1;
    }
}
// @lc code=end

