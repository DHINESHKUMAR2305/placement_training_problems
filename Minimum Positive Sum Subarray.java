						Minimum Positive Sum Subarray 



class Solution 
{
    public int minimumSumSubarray(List<Integer> arr, int l, int r) 
    {
        int min = Integer.MAX_VALUE;
        for(int i=0; i <arr.size() ; i++)
        {
            for(int j=i ; j<arr.size() ; j++)
            {
                ArrayList<Integer> xx= new ArrayList<>();

                for(int k=i ; k<=j ; k++)
                {
                    xx.add(arr.get(k));
                }

                if(xx.size()>=l && xx.size()<=r)
                {
                    int sum = 0;
                    for(int ii : xx)
                    {
                        sum+=ii;
                    }

                    if(sum>0)
                    {
                        min = Math.min(min , sum);
                    }

                    
                }

            }
        }

        if(min == 2147483647)
        {
            return -1;
        }

        return min;
    }
}