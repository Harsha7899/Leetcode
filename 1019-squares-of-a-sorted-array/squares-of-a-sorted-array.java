class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int res[] = new int [nums.length];
        int left = 0 , right = nums.length-1;
        int index = nums.length-1;

        while (left<= right)
        {
            if( nums[left] * nums[left] > nums[right]* nums[right])
            {
                res[index] = nums[left] * nums[left];
                left++;
            }
            else
            {
                res[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }

        return res;
    }
}