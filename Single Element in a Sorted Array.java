				Single Element in a Sorted Array


class Solution 
{
    public int singleNonDuplicate(int[] nums) 
    {
        HashMap<Integer , Integer> arr = new HashMap<>();

        for(int i : nums)
        {
            arr.put(i , arr.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer , Integer> xx : arr.entrySet())
        {
            if(xx.getValue() ==1)
            {
                return xx.getKey();
            }
        }

        return -1;

    }
}