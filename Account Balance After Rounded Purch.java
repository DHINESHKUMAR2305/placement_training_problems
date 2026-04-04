				Account Balance After Rounded Purchase

class Solution 
{
    public int accountBalanceAfterPurchase(int purchaseAmount) 
    {
        if(purchaseAmount%10 == 0)
        {
            return 100-purchaseAmount;
        }
        int res = 100- purchaseAmount;

        int[] arr = {5 , 10 ,15 ,  20 , 25 , 30 ,35 ,  40 ,45, 50 ,55, 60 ,65, 70 ,75, 80 ,85, 90 ,95, 100};

        if(purchaseAmount < arr[0])
        {
            return 100;
        }

        for(int i=1 ; i<arr.length ; i++)
        {
            if(purchaseAmount < arr[i])
            {
                if(arr[i]%10==0)
                {
                    return 100-arr[i];
                }
                else
                {
                    int temp1 = Math.abs(arr[i-1]-purchaseAmount);
                    int temp2 = Math.abs(arr[i+1]-purchaseAmount);

                    int min = Math.min(temp1 , temp2);

                    if(temp1 <temp2)
                    {
                        return 100-arr[i-1];
                    }
                    else 
                    {
                        return 100-arr[i+1];
                    }
                }
            }
        }

        return -1;



        
    }
}