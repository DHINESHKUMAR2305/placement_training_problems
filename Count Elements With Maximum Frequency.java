					Count Elements With Maximum Frequency


class Solution 
{
    public int maxFrequencyElements(int[] nums) 
    {
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i : nums)
        {
            hm.put( i , hm.getOrDefault(i , 0)+1);
        }

        int max = 0;

        for(Map.Entry<Integer , Integer> xx : hm.entrySet())
        {
            if(xx.getValue() > max)
            {
                max = xx.getValue();
            }
        }

        int res = 0;

        for(Map.Entry<Integer , Integer> xx : hm.entrySet())
        {
            if(xx.getValue() == max)
            {
                res+=max;
            }
        }

        return res;

    }
}