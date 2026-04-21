					Move Zeroes

class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int count = 0;

        int temp = 0;
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]!=0)
            {
                nums[count++] = nums[i];
                temp++;
            }
        }

        for(int i=temp ; i<nums.length ; i++)
        {
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));

    }
}