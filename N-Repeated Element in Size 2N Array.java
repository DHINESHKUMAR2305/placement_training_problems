class Solution 
{
    public int repeatedNTimes(int[] arr) 
    {
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i : arr)
        {
            hm.put(i , hm.getOrDefault(i , 0)+1);
        }

        int max = 0;

        int max_value = 0;


        for(Map.Entry<Integer , Integer> xx : hm.entrySet())
        {
            if(xx.getValue() > max)
            {
                max = xx.getValue();
                max_value = xx.getKey();
            }
        }

        return max_value;

    }
}