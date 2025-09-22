class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ch = new HashSet<>();

        int max = 0, l = 0, r = 0;

        while(r < s.length())
        {
            if(!ch.contains(s.charAt(r)))
            {
                ch.add(s.charAt(r));
                max = Math.max(max, ch.size());
                r++;
            }
            else
            {
                ch.remove(s.charAt(l));
                l++;
            }
        }

        return max;
        
    }
}