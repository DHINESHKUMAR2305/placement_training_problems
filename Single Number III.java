					 Single Number III

class Solution 
{
    public int[] singleNumber(int[] nums) 
    {
        HashMap<Integer , Integer> arr = new HashMap<>();

        for(int i : nums)
        {
            arr.put(i , arr.getOrDefault(i , 0)+1);
        }

        int[] ans = new int[2];
        int ans_count = 0;

        for(Map.Entry<Integer , Integer> xx : arr.entrySet())
        {
            if(xx.getValue()==1)
            {
                ans[ans_count++] = xx.getKey();
            }
        }

        return ans;

    }
}