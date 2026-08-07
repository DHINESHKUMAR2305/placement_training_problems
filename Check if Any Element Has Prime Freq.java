						Check if Any Element Has Prime Frequency




class Solution 
{
    public boolean checkPrimeFrequency(int[] arr) 
    {
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i : arr)
        {
            hm.put(i , hm.getOrDefault(i , 0)+1);
        }

        ArrayList<Integer> xx = new ArrayList<>();

        for(int i=2 ; i<100 ; i++)
        {
            int count = 0;
            for(int j=1 ; j<=i ; j++)
            {
                if(count > 2)
                {
                    continue;
                }
                if(i%j==0)
                {
                    count+=1;
                }
            }
            if(count == 2)
            {
                xx.add(i);
            }
        }

        for(Map.Entry<Integer , Integer> xxx : hm.entrySet())
        {
            if(xx.contains(xxx.getValue()))
            {
                return true;
            }
        }

        return false;

    }
}