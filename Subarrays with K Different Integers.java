						Subarrays with K Different Integers


class Solution 
{
    public int subarraysWithKDistinct(int[] arr, int k) 
    {
        int count = 0;
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=i ; j<arr.length ; j++)
            {
                HashSet<Integer> xx = new HashSet<>();

                for(int kk=i ; kk<=j ; kk++)
                {
                    xx.add(arr[kk]);
                }

                if(xx.size() == k)
                {
                    count+=1;
                }

            }
        }

        return count;
    }
}