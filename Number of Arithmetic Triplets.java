				Number of Arithmetic Triplets


class Solution 
{
    public int arithmeticTriplets(int[] nums, int diff) 
    {
        int count = 0;
        for(int i=0 ; i<nums.length ; i++)
        {
            for(int j=i+1 ; j<nums.length ; j++)
            {
                for(int k=j+1 ; k<nums.length ; k++)
                {
                    if(i < j && j<k)
                    {
                        int temp1 = nums[j] - nums[i];
                        int temp2 = nums[k] - nums[j];

                        if(temp1 == diff && temp2 == diff)
                        {
                            count+=1;
                        }
                    }
                }
            }
        }

        return count;

    }
}