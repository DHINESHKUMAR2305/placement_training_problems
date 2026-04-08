					Find the Pivot Integer

class Solution 
{
    public int pivotInteger(int n) 
    {
        int sum = 0;

        for(int i=1 ; i<=n ; i++)
        {
            sum+=i;
        }    

        int sq = (int)Math.sqrt(sum);

        if(sq*sq == sum)
        {
            return sq;
        }

        return -1;
    }
}