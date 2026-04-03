					Majority Element II

class Solution 
{
    public List<Integer> majorityElement(int[] arr) 
    {
        ArrayList<Integer> res = new ArrayList<>();

        int n = arr.length/3;

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i : arr)
        {
            map.put(i , map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer , Integer> xx : map.entrySet())
        {
            if(xx.getValue() > n)
            {
                res.add(xx.getKey());
            }
        }
        return res;

    }
}