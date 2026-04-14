				Minimum Distance to the Target Element

class Solution 
{
    public int getMinDistance(int[] nums, int target, int start) 
    {
        int min = 1234;
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i] == target)
            {
                int temp = Math.abs(i-start);
                min = Math.min(min , temp);
            }
        }

        return min;
    }
}