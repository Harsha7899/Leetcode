class Solution {
    public String reverseStr(String s, int k) {

        char[] array = s.toCharArray ();

        for ( int start = 0; start < array.length; start += 2*k)
        {
            int innerStart = start, innerEnd = Math.min(innerStart + k - 1, array.length - 1);

            while (innerStart < innerEnd)
            {
                char temp = array[innerStart];
                array[innerStart++] = array[innerEnd];
                array[innerEnd--] = temp;
            }
        }
        return new String (array);
    }
}