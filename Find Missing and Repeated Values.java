				Find Missing and Repeated Values


class Solution 
{
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        ArrayList<Integer> arr = new ArrayList<>();

        boolean pp = true;

        for(int i=0 ; i<grid.length ; i++)
        {
           for(int j=0 ; j<grid[0].length ; j++)
           {
            if(grid[i][j] == 1)
            {
                pp = false;
            }
                arr.add(grid[i][j]);
           } 
        }

        int[] ans = new int[2];

        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i : arr)
        {
            hm.put(i , hm.getOrDefault( i ,0)+1);
        }

        for(Map.Entry<Integer , Integer> xx : hm.entrySet())
        {
            if(xx.getValue() > 1)
            {
                ans[0] = xx.getKey();
                break;
            }
        }

        Collections.sort(arr);

        HashSet<Integer> x = new HashSet<>();

        for(int i : arr)
        {
            x.add(i);
        }

        ArrayList<Integer> a = new ArrayList<>();
        
        for(int i : x)
        {
            a.add(i);
        }



        for(int i=0 ; i<a.size()-1 ; i++)
        {
            if(a.get(i)+1 != a.get(i+1) )
            {
                ans[1] = a.get(i)+1;
                break;
            }
        }

        System.out.println(a);

        if(ans[1] == 0)
        {
            ans[1] = a.get(a.size()-1)+1;
        }


        if(pp)
        {
            ans[1] = 1;
        }

        return ans;





    }
}