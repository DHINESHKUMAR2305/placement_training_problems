						First Unique Even Element

class Solution 
{
    public int firstUniqueEven(int[] arr) 
    {
        int count = 0;
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i : arr)
        {
            hm.put(i , hm.getOrDefault(i , 0)+1);
        }  

        for(int i : arr)
        {
            if(i%2==0 && hm.get(i) ==1)
            {
                return i;
            }
        }

        return -1;

    }
}