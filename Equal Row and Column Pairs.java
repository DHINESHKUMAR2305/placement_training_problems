					Equal Row and Column Pairs


class Solution 
{
    public int equalPairs(int[][] arr) 
    {
        ArrayList<ArrayList<Integer>> row = new ArrayList<>();    
        ArrayList<ArrayList<Integer>> column = new ArrayList<>();

        int row_count = 0;

        for(int i=0 ; i<arr.length ; i++)
        {
            ArrayList<Integer> xx = new ArrayList<>();

            for(int j=0 ; j<arr[0].length ; j++)
            {
                if(i==row_count)
                {
                    xx.add(arr[i][j]);
                }
            }
            row_count+=1;

            row.add(xx);
        }


        int column_count = 0;

        for(int i=0 ; i<arr.length ; i++)
        {
            ArrayList<Integer> xx = new ArrayList<>();

            for(int j=0 ; j<arr[0].length ; j++)
            {
                xx.add(arr[j][i]);
            }
            column_count+=1;

            column.add(xx);
        }

        int count = 0;

        for(int i=0 ; i<row.size() ; i++)
        {
            for(int j=0 ; j<column.size() ; j++)
            {
                if(row.get(i).equals(column.get(j)))
                {
                    count+=1;
                }
            }
        }

        System.out.println(row);
        System.out.println(column);

        return count;

    }
}