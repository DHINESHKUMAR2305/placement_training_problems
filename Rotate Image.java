							Rotate Image


class Solution 
{
    public void rotate(int[][] matrix) 
    {
        for(int i=0 ; i<matrix.length ; i++)
        {
            for(int j=i ; j<matrix[0].length ; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }   

        for(int i=0 ; i<matrix.length ; i++)
        {
            ArrayList<Integer> xx = new ArrayList<>();

            for(int j=0 ; j<matrix[0].length ; j++)
            {
                xx.add(matrix[i][j]);
            }

            ArrayList<Integer> reverse = new ArrayList<>();

            for(int ii=xx.size()-1 ; ii>=0 ; ii--)
            {
                reverse.add(xx.get(ii));
            }

            for(int ll=0 ; ll<matrix[0].length ; ll++)
            {
                matrix[i][ll] = reverse.get(ll);
            }

        }  


        System.out.println(Arrays.deepToString(matrix));
    }
}
