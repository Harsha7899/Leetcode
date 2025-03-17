class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        s = list(s)

        for start in range (0, len(s), 2*k):
            innerStart, innerEnd = start, min(start + k - 1, len(s)-1)

            while innerStart < innerEnd:
                s[innerStart], s[innerEnd] = s[innerEnd],  s[innerStart]
                innerStart += 1
                innerEnd -= 1
        return "".join(s)