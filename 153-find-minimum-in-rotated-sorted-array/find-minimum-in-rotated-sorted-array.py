class Solution:
    def findMin(self, nums: List[int]) -> int:
        res, l, r = nums[0], 0, len(nums)-1

        while l <= r:
            if nums[l] < nums[r]:
                res = min(res, nums[l])
                break
        
            mid = (l + r) // 2
            res = min(res, nums[mid])
            if nums[mid] >= nums[l]:
                l = mid + 1
            else:
                r = mid - 1
        return res

     