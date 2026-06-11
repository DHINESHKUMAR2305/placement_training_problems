							Binary Subarrays With Sum

class Solution 
{
    public int numSubarraysWithSum(int[] arr, int goal) 
    {
        int count = 0;

        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=i ; j<arr.length ; j++)
            {
                ArrayList<Integer> xx = new ArrayList<>();
                for(int k=i ; k<=j ; k++)
                {
                    xx.add(arr[k]);
                }
                int sum = 0;

                for(int ii : xx)
                {
                    sum+=ii;

                    if(sum > goal)
                    {
                        break;
                    }
                }

                if(sum == goal)
                {
                    count+=1;
                }

            }
        }

        return count;
    }

    
}