					Maximum Prime Difference


class Solution 
{
    public int maximumPrimeDifference(int[] arr) 
    {
        ArrayList<Integer> xx = new ArrayList<>();

        for(int i=2 ; i<100 ; i++)
        {
            int count = 0;

            for(int j=1 ; j<=i/2 ; j++)
            {
                if(count > 1)
                {
                    continue;
                }
                if(i%j == 0)
                {
                    count+=1;
                }
            }

            if(count == 1)
            {
                xx.add(i);
            }
        }

        ArrayList<Integer> dummy = new ArrayList<>();

        for(int i=0 ; i<arr.length ; i++)
        {
            if(xx.contains(arr[i]))
            {
                dummy.add(i);
            }
        }

        Collections.sort(dummy);

        return dummy.get(dummy.size()-1) - dummy.get(0);

    }
}