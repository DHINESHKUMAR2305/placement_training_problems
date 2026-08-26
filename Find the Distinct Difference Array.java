				Find the Distinct Difference Array


class Solution 
{
    public int[] distinctDifferenceArray(int[] arr) 
    {
        int[] fin = new int[arr.length];

        for(int i=0 ; i<arr.length ; i++)
        {
            HashSet<Integer> hs = new HashSet<>();
            HashSet<Integer> hs2 = new HashSet<>();

            for(int j=0 ; j<=i ; j++)
            {
                hs2.add(arr[j]);
            }

            for(int j=i+1 ; j<arr.length ; j++)
            {
                hs.add(arr[j]);
            }

            int res = hs2.size()-hs.size();
            fin[i] = res;
        }

        return fin;
    }
}