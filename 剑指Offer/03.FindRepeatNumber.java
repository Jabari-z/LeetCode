class Solution {
    public int findRepeatNumber(int[] nums) {
        /**
           0 1 2 3 4 5 6
        *  2 3 1 0 2 5 3
           1 3 2 0 2 5 3
           3 1 2 0 2 5 3
           0 1 2 3 2 5 3
        */
        for(int i = 0;i<nums.length;i++){
            while(nums[i]!=i){
                if(nums[i]==nums[nums[i]]) {
                    return nums[i];
                }
                else{
                    int tmp = nums[nums[i]];
                    nums[nums[i]] = nums[i];
                    nums[i]= tmp;
                }
            }
        }
        return -1;
    }
}