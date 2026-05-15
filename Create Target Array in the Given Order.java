					Create Target Array in the Given Order


class Solution 
{
    public int[] createTargetArray(int[] arr, int[] index) 
    {
        int[] target = new int[arr.length];
        ArrayList<Integer> xx = new ArrayList<>();

        for(int i=0 ; i<arr.length ; i++)
        {
            xx.add(index[i] , arr[i]);
        }

        int ii = 0;

        for(int i : xx)
        {
            target[ii++] = i;
        }

        return target;

    }
}