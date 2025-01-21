class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> Output_arr = new LinkedList();

        for (int i=0; i<nums.length-2; i++)
        {
            if(i>0 && nums[i] == nums[i-1])
            { 
                continue;
            }
            int left = i+1;
            int right= nums.length -1;

                while (left<right)
                {
                   int total = nums[i] + nums[left] + nums[right];
                    if(total > 0)
                    {
                        right--;
                    }
                    else if (total <0)
                    {
                        left++;
                    }
                    else
                    {
                        Output_arr.add(Arrays.asList(nums[i], nums[left], nums[right])); 
                        left++;
                        right--;

                        while( left<right && nums[left] == nums[left-1])
                        {
                            left++;
                        }
                        while( left<right && nums[left] == nums[right +1])
                        {
                          right--;
                        }

                    }
                }
        }
        return Output_arr;
    }
}
