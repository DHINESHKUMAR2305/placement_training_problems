					Minimum Moves to Equal Array Elements III


class Solution 
{
    public int minMoves(int[] arr) 
    {
        Arrays.sort(arr);
        int max = arr[arr.length-1];

        int res = 0;

        for(int i=0 ; i<arr.length ; i++)
        {
            int temp = Math.abs(arr[i]-max);
            res+=temp;
        }

        return res;

    }
}