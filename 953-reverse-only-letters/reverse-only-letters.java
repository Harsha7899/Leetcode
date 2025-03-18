class Solution {
    public String reverseOnlyLetters(String s) {
        
        char [] array = s.toCharArray();
        int left = 0, right = array.length - 1;

        while (left<=right)
        {
            if (!Character.isLetter(array[left]))
            {
                left++;
            }
            else if (!Character.isLetter(array[right]))
            {
                right--;
            }
            else {
            char temp = array[left];
            array[left++] = array[right];
            array[right--] = temp;
            }
        }
        return new String(array);
    }
}