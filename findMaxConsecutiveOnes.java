				findMaxConsecutiveOnes

class Solution 
{
    public int findMaxConsecutiveOnes(int[] arr) 
    {
        int count = 0;
        int res = 0;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] == 1)
            {
                count++;
            }
            else 
            {
                res = Math.max(res , count);
                count = 0;
            }
        }

        res = Math.max(res , count);

        return res;
    }
}