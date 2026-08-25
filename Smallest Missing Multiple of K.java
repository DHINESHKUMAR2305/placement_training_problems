					Smallest Missing Multiple of K


class Solution 
{
    public int missingMultiple(int[] arr, int k) 
    {
        int max = 0;

        for(int i : arr)
        {
            if(i>max)
            {
                max = i;
            } 
        }

        ArrayList<Integer> xx = new ArrayList<>();
        int count = 1;

        for(int i=0 ; i<110 ; i++)
        {
            xx.add(count*k);
            count+=1;
        }

        for(int i : xx)
        {
            boolean is_boolean = true;
            for(int j=0 ; j<arr.length ; j++)
            {
                if(arr[j] == i)
                {
                    is_boolean = false;
                }

            }
            if(is_boolean)
            {
                return i;
            }
        }

        return k;

    }
}