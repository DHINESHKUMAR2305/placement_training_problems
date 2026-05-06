					Difference Between Ones and Zeros in Row and Column


class Solution 
{
    public int[][] onesMinusZeros(int[][] grid) 
    {
        int[][] arr = new int[grid.length][grid[0].length];
    
        int xx = 0;

        for(int i=0 ; i<grid.length ; i++)
        {
            for(int j=0 ; j<grid[0].length ; j++)
            {
                ArrayList<Integer> row = new ArrayList<>();
                ArrayList<Integer> column = new ArrayList<>();

                for(int k = 0; k < grid[0].length; k++)
                {
                    row.add(grid[i][k]);
                }

                for(int k = 0; k < grid.length; k++)
                {
                    column.add(grid[k][j]);
                }

                int row_zero = 0;
                int column_zero = 0;
                int row_one = 0;
                int column_one = 0;

                

                for(int iii : row)
                {
                    if(iii==1)
                    {
                        row_one+=1;
                    }
                    else if(iii == 0)
                    {
                        row_zero+=1;
                    }
                }

                for(int iiii : column)
                {
                    if(iiii==1)
                    {
                        column_one+=1;
                    }
                    else if(iiii == 0)
                    {
                        column_zero+=1;
                    }
                }


                int temp = row_one+ column_one - row_zero - column_zero;

                arr[i][j] = temp;

            }
        }

        return arr;

    }
}