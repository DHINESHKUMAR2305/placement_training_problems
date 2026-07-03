						Digit Frequency Score


class Solution
 {
    public int digitFrequencyScore(int n) 
    {
        HashMap<Integer , Integer> hm = new HashMap<>();

        while(n!=0)
        {
            int rem = n%10;
            hm.put(rem , hm.getOrDefault(rem , 0)+1);
            n/=10;
        }

        int res = 0;

        for(Map.Entry<Integer , Integer> xx : hm.entrySet())
        {
            int keyy = xx.getKey();
            int valuee = xx.getValue();

            int temp = keyy*valuee;

            res+=temp;

        }

        return res;

    }
}