					Sum of Distances

class Solution 
{
    public long[] distance(int[] arr) 
    {
        long[] res = new long[arr.length];

        for(int i=0 ; i<arr.length ; i++)
        {
            int val = 0;
            for(int j=0 ; j<arr.length ; j++)
            {
                if(arr[i] == arr[j])
                {
                    int temp = Math.abs(i-j);
                    val+=temp;
                }
            }
            res[i] = val;
        }
        return res;
    }
}