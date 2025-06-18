class Solution {
    public void rotate(int[][] matrix) {
       int n = matrix.length;

       for(int i = 0; i < (n+1)/2; i++)
       {
        for(int j = 0; j< n/2; j++)
        {
            // storing last row first index value in temp variable
            int temp = matrix[n-1-j][i];
            
            //swaping bottom right to bottom left
            matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
            
            //swapping top right  to bottom right
            matrix[n-1-i][n-1-j] = matrix[j][n-1-i];

            //Swapping top left  to top right
            matrix[j][n-1-i] = matrix[i][j];

            //storing temp value to first index
             matrix[i][j] = temp;
        }
       }

    }
}