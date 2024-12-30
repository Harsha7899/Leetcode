class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer>  Hm = new HashMap<>();
        
        for(int i =0; i<nums.length; i++)
        {
            int remind = target - nums[i];
            if (Hm.containsKey(remind)){
                return new int[]{i, Hm.get(remind)};
            }
            else{
                Hm.put(nums[i],i);
            }
        }
        return null;
    }
}