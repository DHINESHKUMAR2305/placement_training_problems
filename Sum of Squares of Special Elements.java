							Sum of Squares of Special Elements 


class Solution 
{
    public int sumOfSquares(int[] arr) 
    {
        int sum = 0;
        for(int i=0; i<arr.length ; i++)
        {
            if(arr.length % (i+1)== 0)
            {
                int temp = arr[i] * arr[i];
                sum+=temp;
            }
        }

        return sum;
    }
}