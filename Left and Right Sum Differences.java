					Left and Right Sum Differences


class Solution 
{
    public int[] leftRightDifference(int[] arr) 
    {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        for(int i=0 ; i<arr.length ; i++)
        {
            if(i == 0)
            {
                left[i] = 0;
            }
            else 
            {
                int sum = 0;
                for(int j=0 ; j<i ; j++)
                {
                    sum+=arr[j];
                }
                left[i] = sum;
            }
        }

        for(int i=0 ; i<arr.length ; i++)
        {
            int sum = 0;
            for(int j=i+1 ; j<arr.length ; j++)
            {
                sum+=arr[j];
            }
            right[i] = sum;
        }

        int[] ans = new int[arr.length];;

        for(int i=0 ; i<arr.length ; i++)
        {
            int temp = Math.abs(left[i] - right[i]);
            ans[i] = temp;
        }

        return ans;

    }
}