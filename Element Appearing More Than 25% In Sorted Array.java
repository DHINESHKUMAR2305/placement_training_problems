					Element Appearing More Than 25% In Sorted Array

class Solution 
{
    public int findSpecialInteger(int[] arr) 
    {
        int avg = arr.length/4;   

        System.out.println(avg); 

        HashMap<Integer , Integer> hm = new HashMap<>();
        
        for(int i : arr)
        {
            hm.put(i , hm.getOrDefault( i ,0)+1);
        }

        int ans = 0;

        for(Map.Entry<Integer , Integer> xx : hm.entrySet())
        {
            if(xx.getValue() > avg)
            {
                ans = Math.max(ans , xx.getKey());
            }
        }

        return ans;

    }
}