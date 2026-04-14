					Minimum Capacity Box


class Solution 
{
    public int minimumIndex(int[] arr, int item) 
    {
        int min = 1234;
        int index = -1;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] >= item)
            {
                if(arr[i] < min)
                {
                    min = arr[i];
                    index = i;
                }
            }
        }    

        return index;
    }
}