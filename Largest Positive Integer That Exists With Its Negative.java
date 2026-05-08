				Largest Positive Integer That Exists With Its Negative


class Solution 
{
    public int findMaxK(int[] arr) 
    {
        ArrayList<Integer> xx = new ArrayList<>();

        for(int i : arr)
        {
            xx.add(i);
        }

        ArrayList<Integer> fin = new ArrayList<>();

        for(int i : arr)
        {
            if(i > 0)
            {
                int temp = i*-1;
                if(xx.contains(temp))
                {
                    fin.add(i);
                }
            }
        }

        if(fin.size() == 0)
        {
            return -1;
        }

        Collections.sort(fin);

        return fin.get(fin.size()-1);

    }
}