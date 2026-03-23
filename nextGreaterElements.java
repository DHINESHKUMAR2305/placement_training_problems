						nextGreaterElements

class Solution 
{
    public int[] nextGreaterElements(int[] arr) 
    {
        int[] res = new int[arr.length];
        int res_count = 0;

        for(int i=0 ; i<arr.length ; i++)
        {
            boolean xx = true;
            for(int j=i+1 ; j<arr.length ; j++)
            {
                if(arr[j] > arr[i])
                {
                    res[i] = arr[j];
                    xx = false;
                    break;
                }
            }

            if(xx)
            {
                for(int jj=0 ; jj<i ; jj++)
                {
                    if(arr[jj] > arr[i])
                    {
                        res[i] = arr[jj];
                        xx = false;
                        break;
                    }
                }
            }

            if(xx)
            {
                res[i] = -1;
            }

            

        }

        // for(int i=0 ; i<res.length ; i++)
        // {
        //     if(res[i] == 0)
        //     {
        //         res[i] = -1;
        //     }
        // }


        return res;
    }
}