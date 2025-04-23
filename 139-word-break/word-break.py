class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        n = len(s) + 1 #finding the size of str
        dp = [False] * n # Take anew array and make it false at indices expepect zero position
        dp[0] = True
       
        for i in range(n):
            for j in range(i):
                if dp[j] and s[j:i] in wordDict:
                    dp[i] = True
                    break
        return dp[-1]
