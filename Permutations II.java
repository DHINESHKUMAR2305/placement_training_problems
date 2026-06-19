					Permutations II


class Solution 
{
    public List<List<Integer>> permuteUnique(int[] nums) 
    {
        List<List<Integer>> xx = new ArrayList<>();

        permutation(nums , 0 , xx);

        return xx;
    }


    public static void permutation(int[] c , int index , List<List<Integer>> xx)
    {
        if(c.length == index)
        {
            ArrayList<Integer> pp = new ArrayList<>();

            for(int i :c)
            {
                pp.add(i);
            }

            if(!xx.contains(pp))
            {
                xx.add(pp);
            }

            
            return;
        }

        for(int i=index ; i<c.length ; i++)
        {
            int temp = c[index];
            c[index] = c[i];
            c[i] = temp;

            permutation(c , index+1 , xx);

            temp = c[index];
            c[index] = c[i];
            c[i] = temp;
            
        }

    }


}