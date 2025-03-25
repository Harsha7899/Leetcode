class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowels = {'a', 'e', 'i', 'o', 'u'}
        cur = 0
        for i in range (0, k):
            if s[i] in vowels:
                cur += 1 
        max_c = cur
        for i in range (k, len(s)):
            if s[i] in vowels:
                cur += 1
            
            if s[i-k] in vowels:
                cur -= 1
            max_c = max(max_c, cur)

        return max_c