				Smallest Stable Index I


class Solution 
{
    public int firstStableIndex(int[] arr, int k) 
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j=0 ; j<=i ; j++)
            {
                max = Math.max(arr[j] , max);
            }

            int min = Integer.MAX_VALUE;
            for(int j=i ; j<arr.length ; j++)
            {
                min = Math.min(arr[j] , min);
            }

            int res = max - min;

            if(res <= k)
            {
                return i;
            }
        }

        return -1;
    }
}