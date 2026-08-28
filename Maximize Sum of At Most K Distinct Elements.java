				Maximize Sum of At Most K Distinct Elements


class Solution 
{
    public int[] maxKDistinct(int[] nums, int k) 
    {

        ArrayList<Integer> xx = new ArrayList<>();

        for(int i : nums)
        {
            if(!xx.contains(i))
            {
                xx.add(i);
            }   
        }

        Collections.sort(xx);
        Collections.reverse(xx);

        System.out.println(xx);

        int count = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        if(xx.size() >= k)
        {
            for(int i : xx)
            {
                if(count == k)
                {
                    break;
                }
                arr.add(i);
                count+=1;
            }
        }
        else 
        {
            for(int i : xx)
            {
                arr.add(i);
            }
        }

        int[] res = new int[arr.size()];

        int res_count = 0;

        for(int i : arr)
        {
            res[res_count++] = i;
        }

        return res;
    }
}