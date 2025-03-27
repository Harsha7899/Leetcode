class Solution {
    public int longestSubarray(int[] nums) {
        int window_size = 0, start = 0, zero_count = 0;
       for(int i = 0; i < nums.length; i++)
       {
            zero_count += nums[i] == 0 ? 1 : 0;

            while (zero_count > 1)
            {
                zero_count -= nums[start] == 0 ? 1 : 0;
                start ++;
            } 
            window_size = Math.max(window_size, i - start);
       }
       return window_size;
    }
}