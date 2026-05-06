						Lemonade Change


class Solution 
{
    public boolean lemonadeChange(int[] arr) 
    {
        int five = 0;
        int ten = 0;
        int twenty = 0;

        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] == 5)
            {
                five+=1;
            }
            else if(arr[i] == 10)
            {
                ten+=1;
                if(five >= 1)
                {
                    five--;
                }
                else 
                {
                    return false;
                }
            }
            else 
            {
                twenty+=1;
                if(ten>=1 && five>=1)
                {
                    ten--;
                    five--;
                }
                else if(five>=3)
                {
                    five-=3;
                }
                else 
                {
                    return false;
                }
            }
        }

        return true;
    }
}