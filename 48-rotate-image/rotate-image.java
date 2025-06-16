class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i=0; i < (n+1)/2; i++)
        {
            for(int j = 0; j < n/2; j++)
            {
                // Storing left bottom value in temp variable
                int temp = matrix[n-1-j][i];

                // Swapping right bottom to left bottom
                matrix[n-1-j][i] = matrix[n - 1 -i][n - 1 - j];

                // swapping right top to right bottom
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n -1- i];

                // Swapping left top to right top
                matrix[j][n -1- i] = matrix[i][j];

               // Storing the value
                matrix[i][j] = temp;
            }
        }

    }
}