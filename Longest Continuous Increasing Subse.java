				Longest Continuous Increasing Subsequence


class Solution 
{
    public int findLengthOfLCIS(int[] arr) 
    {
        int max = -123;
        for(int i=0 ; i<arr.length ; i++)
        {
            int count = 1;
            int temp = arr[i];
            for(int j=i+1 ; j<arr.length ; j++)
            {
                if(temp < arr[j])
                {
                    count+=1;
                    temp = arr[j];
                }
                else 
                {
                    break;
                }
            }

            max = Math.max(count , max);
        }

        return max;

    }
}