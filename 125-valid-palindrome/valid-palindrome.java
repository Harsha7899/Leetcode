class Solution {
    public boolean isPalindrome(String s) {

            String fixed_String = "";
            
        for (char c : s.toCharArray())
        {
            if(Character.isDigit(c)|| Character.isLetter(c))
            {
                fixed_String += c;
            }
        }
        
        fixed_String = fixed_String.toLowerCase();

        int left =0, right =  fixed_String.length()-1;
        
        while( left <= right)
        {
            if( fixed_String.charAt(left++) != fixed_String.charAt(right--))
              {
                     return false;
            }
        }
        return true;
    }
}