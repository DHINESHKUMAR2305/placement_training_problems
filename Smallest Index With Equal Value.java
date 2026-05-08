							Smallest Index With Equal Value


class Solution 
{
    public int smallestEqual(int[] arr) 
    {
        ArrayList<Integer> xx = new ArrayList<>();

        for(int i=0 ; i<arr.length ; i++)
        {
            int mod = i%10;

            if(mod == arr[i])
            {
                xx.add(i);
            }

        }

        if(xx.size()==0)
        {
            return -1;
        }

        Collections.sort(xx);

        return xx.get(0);

    }
}