			Find N Unique Integers Sum up to Zero

class Solution 
{
    public int[] sumZero(int n) 
    {
        int[] arr =new int[n];

        for(int i=0 ; i<n-1 ; i++)
        {
            arr[i] = i+1;
        }        

        int sum = 0;
        for(int i : arr)
        {
            sum+=i;
        }

        arr[n-1] = -1*sum;

        return arr;
    }
}