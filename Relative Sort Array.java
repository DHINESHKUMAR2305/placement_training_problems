						Relative Sort Array


class Solution 
{
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        int[] res = new int[arr1.length];
        int res_count = 0;

        for(int i=0 ; i<arr2.length ; i++)
        {
            for(int j=0 ; j<arr1.length ; j++)
            {
                if(arr2[i] == arr1[j])
                {
                    res[res_count++] = arr1[j];
                }
            }
        }

        ArrayList<Integer> xx = new ArrayList<>();

        for(int i=0 ; i<arr1.length ; i++)
        {
            boolean is_boolean = true;

            for(int j=0 ; j<arr2.length ; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    is_boolean = false;
                }
            }
            if(is_boolean)
            {
                xx.add(arr1[i]);
            }
        }

        Collections.sort(xx);

        for(int i : xx)
        {
            res[res_count++] = i;
        }

        return res;

    }
}