class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        min_p = max_p = nums[0]
        maximum_product = max_p

        for n in nums[1:]:
            temp = min_p
            min_p = min(n, min_p * n, max_p * n)
            max_p = max(n , n * temp, max_p * n)
            maximum_product = max(maximum_product, max_p)
        return maximum_product