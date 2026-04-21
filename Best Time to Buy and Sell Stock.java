				Best Time to Buy and Sell Stock

class Solution 
{
    public int maxProfit(int[] arr) 
    {
        int max = -12345;
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=i+1 ; j<arr.length ; j++)
            {
                int profit = arr[j] - arr[i];

                if(profit > max)
                {
                    max = profit;
                }
            }
        }

        if(max<0)
        {
            return 0;
        }

        return max;
    }
}