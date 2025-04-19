class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = 0;
        int maxSub = nums[0];

        for( int i : nums){
            if(curSum < 0) {
                curSum = 0; }
            curSum += i;
            maxSub = Math.max(maxSub, curSum);
        }
        return maxSub;
    }
}