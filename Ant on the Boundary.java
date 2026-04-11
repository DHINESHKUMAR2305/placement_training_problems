					Ant on the Boundary

class Solution 
{
    public int returnToBoundaryCount(int[] arr) 
    {
        int sum = 0;

        int count = 0;
        for(int i=0 ; i<arr.length ; i++)
        {
            int temp = arr[i];
            sum = sum-temp;

            if(sum == 0)
            {
                count+=1;

            }
        }

        return count;


    }

}