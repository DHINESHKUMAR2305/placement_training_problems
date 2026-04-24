				Sum of Absolute Differences in a Sorted Array

class Solution 
{
    public int[] getSumAbsoluteDifferences(int[] arr) 
    {
        int[] res = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++)
        {
            int sum = 0;
            for(int j=0 ; j<arr.length ; j++)
            {
                int temp = Math.abs(arr[i] - arr[j]);
                sum+=temp;
            }
            res[i] = sum;
        }

        return res;
    }
}