						Build Array from Permutation


class Solution 
{
    public int[] buildArray(int[] arr) 
    {
        int[] new_arr = new int[arr.length];

        for(int i=0 ; i<arr.length ; i++)
        {
            new_arr[i] = arr[arr[i]];
        }

        return new_arr;

    }
}