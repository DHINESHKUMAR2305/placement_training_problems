					Sum of Integers with Maximum Digit Range


class Solution 
{
    public int maxDigitRange(int[] arr) 
    {
        HashMap<Integer , Integer> hm = new HashMap<>();
        HashMap<Integer , Integer> hm2 = new HashMap<>();

        int find = 0;

        for(int i : arr)
        {
            int temp = i;
            int temp2 = i;

            int min = 12345;

            

            while(temp!=0)
            {
                int rem = temp%10;
                min = Math.min(min , rem);
                temp/=10;
            }

            int max = -12345;

            while(temp2!=0)
            {
                int rem = temp2%10;
                max = Math.max(max , rem);
                temp2/=10;
            }

            int ans = Math.abs(max - min);
            find = Math.max(find , ans);

            hm.put(i , ans);
            hm2.put(i , hm2.getOrDefault(i , 0)+1);
        }

        ArrayList<Integer> aa = new ArrayList<>();

        for(Map.Entry<Integer , Integer> xx : hm.entrySet())
        {
            if(xx.getValue() == find)
            {
                aa.add(xx.getKey());
            } 
        }

        int ans = 0;

        for(Map.Entry<Integer , Integer> xx : hm2.entrySet())
        {
            if(aa.contains(xx.getKey()))
            {
                for(int i=0 ; i<xx.getValue() ; i++)
                {
                    ans+=xx.getKey();
                }
            }
        }

        return ans;


    }
}