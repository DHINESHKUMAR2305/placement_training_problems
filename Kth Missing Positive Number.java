					Kth Missing Positive Number


class Solution 
{
    public int findKthPositive(int[] arr, int k) 
    {
        ArrayList<Integer> new_arr = new ArrayList<>();

        for(int i : arr)
        {
            new_arr.add(i);
        }

        ArrayList<Integer> missing = new ArrayList<>();

        for(int i=1 ; i<=20000 ; i++)
        {
            if(!new_arr.contains(i))
            {
                missing.add(i);

                if(missing.size()-1 == k)
                {
                    return missing.get(k-1);
                }

            }
        }

        return -1;

    }
}