class Solution {
    public boolean isPalindrome(String s) {

        String fixed_string = "";
        for( char ch : s.toCharArray())
        {
            if(Character.isDigit(ch) || Character.isLetter(ch))
            {
                fixed_string += ch;
            }
        }

        fixed_string = fixed_string.toLowerCase();

        int left = 0, right = fixed_string.length() -1;

        while(left <= right)
        {
            if(fixed_string.charAt(left++) != fixed_string.charAt(right--))
                return false;
        }
        return true; 
    }
}