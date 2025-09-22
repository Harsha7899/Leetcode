class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        ch = set()
        l = r = max_len = 0

        while r < len(s):
            if s[r] not in ch:
                ch.add(s[r])
                max_len = max(max_len, len(ch))
                r += 1
            else:
                ch.remove(s[l])
                l += 1
        return max_len