						Lucky Numbers in a Matrix


class Solution 
{
    public List<Integer> luckyNumbers(int[][] arr) 
    {
        ArrayList<Integer> xx = new ArrayList<>();

        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=0 ; j<arr[0].length ; j++)
            {
                int row_min = Integer.MAX_VALUE;
                for(int k=0 ; k<arr[0].length ; k++)
                {
                    if(arr[i][k] < row_min)
                    {
                        row_min = arr[i][k];
                    }
                }


                int column_max = Integer.MIN_VALUE;
                for(int k=0 ; k<arr.length ; k++)
                {
                    if(arr[k][j] > column_max)
                    {
                        column_max = arr[k][j];
                    }
                }

                if(row_min == column_max)
                {
                    xx.add(arr[i][j]);
                }

            }
        }

        return xx;

    }
}