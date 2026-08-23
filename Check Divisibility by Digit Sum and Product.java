								Check Divisibility by Digit Sum and Product





class Solution 
{
    public boolean checkDivisibility(int n) 
    {

        int tempp = n;

        int sum = 0;
        int product = 1;

        while(n!=0)
        {
            int temp = n%10;
            sum+=temp;
            product = product*temp;
            n/=10;
        }

        int fin = sum+product;

        if(tempp%fin == 0)
        {
            return true;
        } 
        else 
        {
            return false;
        }

        

    }
}