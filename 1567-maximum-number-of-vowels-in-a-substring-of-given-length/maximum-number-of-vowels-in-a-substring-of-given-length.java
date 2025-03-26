class Solution {
    public int maxVowels(String s, int k) {
    
        HashSet <Character> vowels = new HashSet<Character>();
        vowels. add('a');
        vowels. add('e');
        vowels. add('i');
        vowels. add('o');
        vowels. add('u');

        char [] ch = s.toCharArray();
        int length =0;
        for (int i = 0; i < k; i++)
        {
            if(vowels.contains(ch[i]))
            {
                length += 1;
            }
        }

        int max_length = length;

        for ( int i = k; i < s.length(); i++)
        {
            if(vowels.contains(ch[i]))
            {
                length += 1;
            }

            if (vowels.contains(ch[i-k]))
            {
                length -= 1;
            }
            max_length = Math.max(length, max_length);
        }
        return max_length;
    }
}